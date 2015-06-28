package com.sharemyoffice.business.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharemyoffice.business.interfaces.GenericBusiness;
import com.sharemyoffice.dao.entities.AvailableFacilitiesMaster;
import com.sharemyoffice.dao.entities.CityMaster;
import com.sharemyoffice.dao.entities.OfficeFacilities;
import com.sharemyoffice.dao.entities.OfficeImages;
import com.sharemyoffice.dao.entities.OfficeInfo;
import com.sharemyoffice.dao.entities.User;
import com.sharemyoffice.dao.interfaces.GenericDataAccess;
import com.sharemyoffice.pojo.ListOffAvailableFacilities;
import com.sharemyoffice.pojo.ListOfficeImages;
import com.sharemyoffice.pojo.ListOffices;
import com.sharemyoffice.pojo.UserSignUp;
import com.sharemyoffice.util.MailUtil;

@Service
public class GenericBusinessImpl implements GenericBusiness{
	
	@Autowired
	GenericDataAccess genericDataAccess;
	
	@Autowired
	MailUtil mailUtil;
	
	@Override
	public List<Integer> userLoginAuthandication(String userName, String passWord) {
		// TODO Auto-generated method stub
		List<User> alrUser = genericDataAccess.userLoginVerify(userName);
		List<Integer> alrIntegers = new ArrayList<Integer>();
		Integer verification = 0;
		if(!alrUser.isEmpty())
		{
			if(passWord.equals(alrUser.get(0).getPassword()))
			{
				verification = alrUser.get(0).getId();
				alrIntegers.add(verification);
				Set<OfficeInfo> setOfficeInfos = alrUser.get(0).getOfficeInfos();
				if(!setOfficeInfos.isEmpty())
				{
				for(OfficeInfo officeInfo : setOfficeInfos)
				{
					alrIntegers.add(officeInfo.getId());
				}
				}
				
			}
			else
			{
				alrIntegers.add(verification);
			}
		}
		else
		{
			alrIntegers.add(verification);
		}
		
		return alrIntegers;
	}
	
	/*@Override
	public List<ListOffices> getListOffices() {
		// TODO Auto-generated method stub
		List<OfficeInfo> alrInfos = genericDataAccess.getUserOfficeInfo();
		List<ListOffices> alrListOffices = new ArrayList<ListOffices>();
		List<ListOfficeImages> alrListOfficeImages = null;
		List<ListOffAvailableFacilities>  alrAvailableFacilities = null;
		ListOffices listOffices;
		if(!alrInfos.isEmpty())
		{
			for(OfficeInfo officeInfo : alrInfos)
			{
				listOffices = new ListOffices();
				listOffices.setCost(""+officeInfo.getCost());
				listOffices.setDescription(officeInfo.getDescription());
				listOffices.setDistanceFromBusStand(officeInfo.getDistanceFromBusStand());
				listOffices.setOfficeAddress(officeInfo.getOfficeAddress());
				listOffices.setOfficeCity(officeInfo.getCityMaster().getName());
				listOffices.setOfficeName(officeInfo.getOfficeName());
				listOffices.setOfficePincode(""+officeInfo.getOfficePincode());
				listOffices.setOfficeState(officeInfo.getCityMaster().getState());
				listOffices.setOfficeTiming(officeInfo.getOfficeTiming());
				listOffices.setOfficeWebsite(officeInfo.getOfficeWebsite());
				listOffices.setSquareFeetSeats(officeInfo.getSquareFeet());
				listOffices.setUserContactNumber(""+officeInfo.getUser().getContactNumber());
				listOffices.setUserEmailId(officeInfo.getUser().getEmailId());
				listOffices.setCityid(officeInfo.getCityMaster().getId());
				listOffices.setOfficeid(officeInfo.getId()); 
				if(!officeInfo.getOfficeImageses().isEmpty())
				{
					alrListOfficeImages = new ArrayList<ListOfficeImages>();
					for(OfficeImages officeImages : officeInfo.getOfficeImageses())
					{
						ListOfficeImages listOfficeImages = new ListOfficeImages();
						listOfficeImages.setOfficeImages(officeImages.getImages());
						listOfficeImages.setOfficeId(officeImages.getId());
						alrListOfficeImages.add(listOfficeImages);
					}
					listOffices.setAlrOfficeImages(alrListOfficeImages);
				}
				
				if(!officeInfo.getOfficeFacilitieses().isEmpty())
				{
					alrAvailableFacilities = new ArrayList<ListOffAvailableFacilities>();
					for(OfficeFacilities officeFacilities : officeInfo.getOfficeFacilitieses())
					{
						ListOffAvailableFacilities listOffAvailableFacilities = new ListOffAvailableFacilities();
						listOffAvailableFacilities.setFacilitiesid(officeFacilities.getAvailableFacilitiesMaster().getId());
						listOffAvailableFacilities.setFacilitiesname(officeFacilities.getAvailableFacilitiesMaster().getFacilitiesName());
						alrAvailableFacilities.add(listOffAvailableFacilities);
					}
					listOffices.setAlrOfficeFacilities(alrAvailableFacilities);
				}
				alrListOffices.add(listOffices);
			}
		}
		return alrListOffices;
	}
*/
	@Override
	public ListOffices getOfficesInfoBasedOnOfficeId(Integer officeId) {
		// TODO Auto-generated method stub
		List<OfficeInfo> alrInfos = genericDataAccess.getUserOfficeInfoBasedonofficeId(officeId);
		List<ListOfficeImages> alrListOfficeImages = null;
		List<ListOffAvailableFacilities>  alrAvailableFacilities = null;
		ListOffices listOffices = null;
		if(!alrInfos.isEmpty())
		{
			for(OfficeInfo officeInfo : alrInfos)
			{
				listOffices = new ListOffices();
				listOffices.setCost(""+officeInfo.getCost());
				listOffices.setDescription(officeInfo.getDescription());
				listOffices.setDistanceFromBusStand(officeInfo.getDistanceFromBusStand());
				listOffices.setOfficeAddress(officeInfo.getOfficeAddress());
				listOffices.setOfficeCity(officeInfo.getCityMaster().getName());
				listOffices.setOfficeName(officeInfo.getOfficeName());
				listOffices.setOfficePincode(""+officeInfo.getOfficePincode());
				listOffices.setOfficeState(officeInfo.getCityMaster().getState());
				listOffices.setOfficeTiming(officeInfo.getOfficeTiming());
				listOffices.setOfficeWebsite(officeInfo.getOfficeWebsite());
				listOffices.setSquareFeetSeats(officeInfo.getSquareFeet());
				listOffices.setUserContactNumber(""+officeInfo.getUser().getContactNumber());
				listOffices.setUserEmailId(officeInfo.getUser().getEmailId());
				listOffices.setCityid(officeInfo.getCityMaster().getId());
				listOffices.setOfficeid(officeInfo.getId()); 
				if(!officeInfo.getOfficeImageses().isEmpty())
				{
					alrListOfficeImages = new ArrayList<ListOfficeImages>();
					for(OfficeImages officeImages : officeInfo.getOfficeImageses())
					{
						ListOfficeImages listOfficeImages = new ListOfficeImages();
						listOfficeImages.setOfficeImages(officeImages.getImages());
						listOfficeImages.setOfficeId(officeImages.getId());
						alrListOfficeImages.add(listOfficeImages);
					}
					listOffices.setAlrOfficeImages(alrListOfficeImages);
				}
				
				if(!officeInfo.getOfficeFacilitieses().isEmpty())
				{
					alrAvailableFacilities = new ArrayList<ListOffAvailableFacilities>();
					for(OfficeFacilities officeFacilities : officeInfo.getOfficeFacilitieses())
					{
						ListOffAvailableFacilities listOffAvailableFacilities = new ListOffAvailableFacilities();
						listOffAvailableFacilities.setFacilitiesid(officeFacilities.getAvailableFacilitiesMaster().getId());
						listOffAvailableFacilities.setFacilitiesname(officeFacilities.getAvailableFacilitiesMaster().getFacilitiesName());
						alrAvailableFacilities.add(listOffAvailableFacilities);
					}
					listOffices.setAlrOfficeFacilities(alrAvailableFacilities);
				}
			}
		}
		return listOffices;
	}

	@Override
	public List<ListOffices> getListOfficesBasedOnCityId(Integer cityId) {
		// TODO Auto-generated method stub
		List<OfficeInfo> alrInfos = genericDataAccess.getUserOfficeInfoBasedonCityId(cityId);
		List<ListOffices> alrListOffices = new ArrayList<ListOffices>();
		List<ListOfficeImages> alrListOfficeImages = null;
		List<ListOffAvailableFacilities>  alrAvailableFacilities = null;
		ListOffices listOffices;
		if(!alrInfos.isEmpty())
		{
			for(OfficeInfo officeInfo : alrInfos)
			{
				listOffices = new ListOffices();
				listOffices.setCost(""+officeInfo.getCost());
				listOffices.setDescription(officeInfo.getDescription());
				listOffices.setDistanceFromBusStand(officeInfo.getDistanceFromBusStand());
				listOffices.setOfficeAddress(officeInfo.getOfficeAddress());
				listOffices.setOfficeCity(officeInfo.getCityMaster().getName());
				listOffices.setOfficeName(officeInfo.getOfficeName());
				listOffices.setOfficePincode(""+officeInfo.getOfficePincode());
				listOffices.setOfficeState(officeInfo.getCityMaster().getState());
				listOffices.setOfficeTiming(officeInfo.getOfficeTiming());
				listOffices.setOfficeWebsite(officeInfo.getOfficeWebsite());
				listOffices.setSquareFeetSeats(officeInfo.getSquareFeet());
				listOffices.setUserContactNumber(""+officeInfo.getUser().getContactNumber());
				listOffices.setUserEmailId(officeInfo.getUser().getEmailId());
				listOffices.setCityid(officeInfo.getCityMaster().getId());
				listOffices.setOfficeid(officeInfo.getId()); 
				if(!officeInfo.getOfficeImageses().isEmpty())
				{
					alrListOfficeImages = new ArrayList<ListOfficeImages>();
					for(OfficeImages officeImages : officeInfo.getOfficeImageses())
					{
						ListOfficeImages listOfficeImages = new ListOfficeImages();
						listOfficeImages.setOfficeImages(officeImages.getImages());
						listOfficeImages.setOfficeId(officeImages.getId());
						alrListOfficeImages.add(listOfficeImages);
					}
					listOffices.setAlrOfficeImages(alrListOfficeImages);
				}
				
				if(!officeInfo.getOfficeFacilitieses().isEmpty())
				{
					alrAvailableFacilities = new ArrayList<ListOffAvailableFacilities>();
					for(OfficeFacilities officeFacilities : officeInfo.getOfficeFacilitieses())
					{
						ListOffAvailableFacilities listOffAvailableFacilities = new ListOffAvailableFacilities();
						listOffAvailableFacilities.setFacilitiesid(officeFacilities.getAvailableFacilitiesMaster().getId());
						listOffAvailableFacilities.setFacilitiesname(officeFacilities.getAvailableFacilitiesMaster().getFacilitiesName());
						alrAvailableFacilities.add(listOffAvailableFacilities);
					}
					listOffices.setAlrOfficeFacilities(alrAvailableFacilities);
				}
				alrListOffices.add(listOffices);
			}
		}
		return alrListOffices;
	}

	@Override
	public List<CityMaster> getAllCityMaster() {
		// TODO Auto-generated method stub
		return genericDataAccess.getCityMasterBased();
	}

	@Override
	public List<AvailableFacilitiesMaster> getAllAvailableFacilitiesMasters() {
		// TODO Auto-generated method stub
		return genericDataAccess.getAllAvailableFacilitiesMasters();
	}

	@Override
	public void deleteImages(Integer imageId) {
		// TODO Auto-generated method stub
		List<OfficeImages> alrOfficeImages = genericDataAccess.getImageBasedonId(imageId);
		if(!alrOfficeImages.isEmpty())
		{
			genericDataAccess.deleteOfficeImages(alrOfficeImages.get(0));
		}
		
	}

	@Override
	public void userSignUp(UserSignUp userSignUp) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setEmailId(userSignUp.getEmailId());
		user.setUsername(userSignUp.getUsername());
		String accessCode1 = "TACCESSCD";
		Random random = new Random();
		Integer randomNumber = random.nextInt(999999);
		accessCode1 = accessCode1 + randomNumber;
		char a[] = accessCode1.toCharArray();
		for (int i = 0; i < a.length - 1; i++) {
			int j = random.nextInt(a.length - 1);
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		String strAccessCode = new String(a);
		user.setPassword(strAccessCode);
		if(!userSignUp.getContactNumber().isEmpty())
		{
			user.setContactNumber(Integer.parseInt(userSignUp.getContactNumber()));
		}
		genericDataAccess.userSignup(user);
		mailUtil.SendMail(userSignUp.getEmailId(), strAccessCode, "Your Password");
	}

	@Override
	public Integer ChagePassword(String password, Integer userid) {
		// TODO Auto-generated method stub
		List<User> alrUsers = genericDataAccess.getPassword(userid);
		Integer verification = 0;
		if(!alrUsers.isEmpty())
		{
			alrUsers.get(0).setPassword(password);
			genericDataAccess.userSignup(alrUsers.get(0));
			verification = 1;
		}
		return verification;
	}

	@Override
	public Integer forgetPassword(String emailId) {
		// TODO Auto-generated method stub
		List<User> alrUsers = genericDataAccess.userLoginVerify(emailId);
		Integer verification = 0;
		if(!alrUsers.isEmpty())
		{
			mailUtil.SendMail(alrUsers.get(0).getEmailId(), alrUsers.get(0).getPassword(), "forgetPassword");
			verification = 1;
		}
		return verification;
	}

	@Override
	public void putOfficeImages(String images, Integer officeId) {
		// TODO Auto-generated method stub
		OfficeImages officeImages = new OfficeImages();
		officeImages.setImages(images);
		OfficeInfo officeInfo = new OfficeInfo();
	    officeInfo.setId(officeId);
		officeImages.setOfficeInfo(officeInfo);;
		genericDataAccess.officeImageUpload(officeImages);
	}

	@Override
	public void putOfficefacilities(List<Integer> faclitiesId, Integer officeId) {
		// TODO Auto-generated method stub
		if(!faclitiesId.isEmpty())
		{
			OfficeFacilities officeFacilities ;
			for(Integer a : faclitiesId)
			{
				List<OfficeFacilities> alrOfficeFacilities = genericDataAccess.getOfficeFacilities(a, officeId);
				if(alrOfficeFacilities.isEmpty())
				{
					officeFacilities = new OfficeFacilities();
					AvailableFacilitiesMaster availableFacilitiesMaster = new AvailableFacilitiesMaster();
					availableFacilitiesMaster.setId(a);
					OfficeInfo officeInfo = new OfficeInfo();
					officeInfo.setId(officeId);
					officeFacilities.setAvailableFacilitiesMaster(availableFacilitiesMaster);
					officeFacilities.setOfficeInfo(officeInfo);
					genericDataAccess.officeFacilitiesUpload(officeFacilities);
				}
				
			}
		}
		
		
	}

	@Override
	public void putOfficesInfo(ListOffices listOffices) {
		// TODO Auto-generated method stub
		OfficeInfo officeInfo = new OfficeInfo();
		Integer officeid;
		CityMaster cityMaster = new CityMaster();
		cityMaster.setId(listOffices.getCityid());
		officeInfo.setCityMaster(cityMaster);
		if(!listOffices.getCost().isEmpty())
		{
			officeInfo.setCost(Integer.parseInt(listOffices.getCost()));
		}
		officeInfo.setDescription(listOffices.getDescription());
		officeInfo.setDistanceFromBusStand(listOffices.getDistanceFromBusStand());
		officeInfo.setOfficeAddress(listOffices.getOfficeAddress());
		officeInfo.setOfficeName(listOffices.getOfficeName());
		officeInfo.setSquareFeet(listOffices.getSquareFeetSeats());
		officeInfo.setOfficeWebsite(listOffices.getOfficeWebsite());
		officeInfo.setOfficeTiming(listOffices.getOfficeTiming());
		if(!listOffices.getOfficePincode().isEmpty())
		{
			officeInfo.setOfficePincode(Integer.parseInt(listOffices.getOfficePincode()));
		}
		if(listOffices.getOfficeid()!=null)
		{
		    genericDataAccess.officeInfosave(officeInfo);
		}
		else
		{
			officeInfo.setId(listOffices.getOfficeid());
			genericDataAccess.officeInfoUpdate(officeInfo);
		}
		
		
	}
	
	@Override
	public Map<String, List<CityMaster>> getCity() {
		List<CityMaster> alrCity = this.genericDataAccess.getCityMasterBased();
		List<CityMaster> alrCity2 = null;
		String state;
		Map<String, List<CityMaster>> mapCity = new HashMap<String, List<CityMaster>>();
		for (CityMaster city : alrCity) {
			state = city.getState();
			alrCity2 = new ArrayList<CityMaster>();
			for (CityMaster city2 : alrCity) {
				if (state.equals(city2.getState())) {
					alrCity2.add(city2);
				}
			}
			mapCity.put(state, alrCity2);
		}
		return mapCity;
	}


}
