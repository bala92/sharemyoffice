package com.sharemyoffice.dao.implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sharemyoffice.dao.entities.AvailableFacilitiesMaster;
import com.sharemyoffice.dao.entities.CityMaster;
import com.sharemyoffice.dao.entities.OfficeFacilities;
import com.sharemyoffice.dao.entities.OfficeImages;
import com.sharemyoffice.dao.entities.OfficeInfo;
import com.sharemyoffice.dao.entities.User;
import com.sharemyoffice.dao.interfaces.GenericDataAccess;

@Repository
public class GenericDataAccessImpl implements GenericDataAccess{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void userSignup(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(user);
		transaction.commit();
		session.flush();
		session.close();
	}

	@Override
	public List<User> userLoginVerify(String userName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from User where email_id = '"+userName+"'");
		List<User> alrUsers = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrUsers;
	}

	@Override
	public List<OfficeInfo> getUserOfficeInfo() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from OfficeInfo");
		List<OfficeInfo> alrOfficeInfos = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrOfficeInfos;
	}

	@Override
	public List<OfficeInfo> getUserOfficeInfoBasedonCityId(Integer cityId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from OfficeInfo where city_master_id = '"+cityId+"' ");
		List<OfficeInfo> alrOfficeInfos = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrOfficeInfos;
	}

	@Override
	public List<OfficeInfo> getUserOfficeInfoBasedonStateId(Integer stateId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from OfficeInfo");
		List<OfficeInfo> alrOfficeInfos = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrOfficeInfos;
	}

	@Override
	public List<OfficeInfo> getUserOfficeInfoBasedonofficeId(Integer officeId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from OfficeInfo where id = '"+officeId+"'");
		List<OfficeInfo> alrOfficeInfos = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrOfficeInfos;
	}

	@Override
	public void officeImageUpload(OfficeImages officeImages) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(officeImages);
		transaction.commit();
		session.flush();
		session.close();
	}

	@Override
	public void officeFacilitiesUpload(OfficeFacilities officeFacilities) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(officeFacilities);
		transaction.commit();
		session.flush();
		session.close();
	}

	@Override
	public void officeInfoUpdate(OfficeInfo officeInfo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(officeInfo);
		transaction.commit();
		session.flush();
		session.close();
	}
	
	@Override
	public List<CityMaster> getCityMasterBased() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from CityMaster");
		List<CityMaster> alrCityMasters = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrCityMasters;
	}

	@Override
	public Integer officeInfosave(OfficeInfo officeInfo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Integer officeInfoId = (Integer)session.save(officeInfo);
		transaction.commit();
		session.flush();
		session.close();
		return officeInfoId;
	}

	@Override
	public void deleteOfficeImages(OfficeImages officeImages) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(officeImages);
		transaction.commit();
		session.flush();
		session.close();
	}

	@Override
	public List<AvailableFacilitiesMaster> getAllAvailableFacilitiesMasters() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from AvailableFacilitiesMaster");
		List<AvailableFacilitiesMaster> alrAvailableFacilitiesMasters = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrAvailableFacilitiesMasters;
	}

	@Override
	public List<User> getPassword(Integer userid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from User where id = '"+userid+"'");
		List<User> alrUsers = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrUsers;
	}

	@Override
	public List<OfficeImages> getImageBasedonId(Integer imageId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from OfficeImages where id = '"+imageId+"'");
		List<OfficeImages> alrOfficeImagess = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrOfficeImagess;
	}

	@Override
	public List<OfficeFacilities> getOfficeFacilities(Integer id, Integer officeid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from OfficeFacilities where available_facilities_id = '"+id+"' and office_info_id = '"+officeid+"'");
		List<OfficeFacilities> alrOfficeFacilitiess = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return alrOfficeFacilitiess;
	}

}
