package com.sharemyoffice.pojo;

import java.util.List;

public class ListOffices {
	
	Integer userid,officeid,cityid;
	List<ListOfficeImages>  alrOfficeImages;
	List<ListOffAvailableFacilities> alrOfficeFacilities;
	String officeName, officeAddress, officeCity, officeState, officePincode, description, cost,
	squareFeetSeats, distanceFromBusStand, officeTiming, officeWebsite, userEmailId, userContactNumber;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public List<ListOfficeImages> getAlrOfficeImages() {
		return alrOfficeImages;
	}
	public void setAlrOfficeImages(List<ListOfficeImages> alrOfficeImages) {
		this.alrOfficeImages = alrOfficeImages;
	}
	public List<ListOffAvailableFacilities> getAlrOfficeFacilities() {
		return alrOfficeFacilities;
	}
	public void setAlrOfficeFacilities(List<ListOffAvailableFacilities> alrOfficeFacilities) {
		this.alrOfficeFacilities = alrOfficeFacilities;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getOfficeCity() {
		return officeCity;
	}
	public void setOfficeCity(String officeCity) {
		this.officeCity = officeCity;
	}
	public String getOfficeState() {
		return officeState;
	}
	public void setOfficeState(String officeState) {
		this.officeState = officeState;
	}
	public String getOfficePincode() {
		return officePincode;
	}
	public void setOfficePincode(String officePincode) {
		this.officePincode = officePincode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getSquareFeetSeats() {
		return squareFeetSeats;
	}
	public void setSquareFeetSeats(String squareFeetSeats) {
		this.squareFeetSeats = squareFeetSeats;
	}
	public String getDistanceFromBusStand() {
		return distanceFromBusStand;
	}
	public void setDistanceFromBusStand(String distanceFromBusStand) {
		this.distanceFromBusStand = distanceFromBusStand;
	}
	public String getOfficeTiming() {
		return officeTiming;
	}
	public void setOfficeTiming(String officeTiming) {
		this.officeTiming = officeTiming;
	}
	public String getOfficeWebsite() {
		return officeWebsite;
	}
	public void setOfficeWebsite(String officeWebsite) {
		this.officeWebsite = officeWebsite;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUserContactNumber() {
		return userContactNumber;
	}
	public void setUserContactNumber(String userContactNumber) {
		this.userContactNumber = userContactNumber;
	}
	public Integer getOfficeid() {
		return officeid;
	}
	public void setOfficeid(Integer officeid) {
		this.officeid = officeid;
	}
	public Integer getCityid() {
		return cityid;
	}
	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}
	
	

}
