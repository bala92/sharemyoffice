package com.sharemyoffice.dao.interfaces;

import java.util.List;

import com.sharemyoffice.dao.entities.AvailableFacilitiesMaster;
import com.sharemyoffice.dao.entities.CityMaster;
import com.sharemyoffice.dao.entities.OfficeFacilities;
import com.sharemyoffice.dao.entities.OfficeImages;
import com.sharemyoffice.dao.entities.OfficeInfo;
import com.sharemyoffice.dao.entities.User;

public interface GenericDataAccess {
	
	public void userSignup(User user);
	
	public void officeImageUpload(OfficeImages officeImages);
	
	public void officeFacilitiesUpload(OfficeFacilities officeFacilities);
	
	public void officeInfoUpdate(OfficeInfo officeInfo);
	
	public List<CityMaster> getCityMasterBased();
	
	public Integer officeInfosave(OfficeInfo officeInfo);
	
	public List<User> userLoginVerify(String userName);
	
	public List<OfficeInfo> getUserOfficeInfo();
	
	public List<OfficeInfo> getUserOfficeInfoBasedonCityId(Integer cityId);
	
	public List<OfficeInfo> getUserOfficeInfoBasedonStateId(Integer stateId);
	
	public List<OfficeInfo> getUserOfficeInfoBasedonofficeId(Integer officeId);
	
	public void deleteOfficeImages(OfficeImages officeImages);
	
	public List<AvailableFacilitiesMaster> getAllAvailableFacilitiesMasters();
	
	public List<User> getPassword(Integer userid);
	
	public List<OfficeImages> getImageBasedonId(Integer imageId);
	
	public List<OfficeFacilities> getOfficeFacilities(Integer id, Integer officeid);

}
