package com.sharemyoffice.business.interfaces;

import java.util.List;
import java.util.Map;

import com.sharemyoffice.dao.entities.AvailableFacilitiesMaster;
import com.sharemyoffice.dao.entities.CityMaster;
import com.sharemyoffice.pojo.ListOffices;
import com.sharemyoffice.pojo.UserSignUp;

public interface GenericBusiness {
	
	public List<Integer> userLoginAuthandication(String userName, String passWord);
	
	/*public List<ListOffices> getListOffices();*/
	
	public ListOffices getOfficesInfoBasedOnOfficeId(Integer officeId);
	
	public List<ListOffices> getListOfficesBasedOnCityId(Integer cityId);
	
	public List<CityMaster> getAllCityMaster();
	
	public List<AvailableFacilitiesMaster> getAllAvailableFacilitiesMasters();
	
	public void deleteImages(Integer imageId);
	
	public void userSignUp(UserSignUp userSignUp);
	
	public Integer ChagePassword(String password, Integer userid);
	
	public Integer forgetPassword(String emailId);
	
	public void putOfficeImages(String images, Integer officeId);
	
	public void putOfficefacilities(List<Integer> faclitiesId, Integer officeId);
	
	public void putOfficesInfo(ListOffices listOffices);
	
	public Map<String, List<CityMaster>> getCity();
}
