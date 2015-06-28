package com.sharemyoffice.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.sharemyoffice.business.interfaces.GenericBusiness;
import com.sharemyoffice.dao.entities.AvailableFacilitiesMaster;
import com.sharemyoffice.dao.entities.CityMaster;
import com.sharemyoffice.pojo.ListOffices;
import com.sharemyoffice.pojo.UserSignUp;
import com.sharemyoffice.util.MailUtil;

@Controller
public class MainController {

	@Autowired
	MailUtil mailUtil;
	/*
	@Autowired
	GenericBusiness genericBusiness;*/
	
	@RequestMapping(value = "/")
	public String index(){
		return "signup";
	}
	
	@RequestMapping(value = "/signup")
	public String signup(){
		return "signup";
	}
	
	@RequestMapping(value = "/loginAuth")
	public String loginAuth(HttpSession session,HttpServletRequest request){
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println("Email--->"+email);
		System.out.println("password--->"+password);
		
		return "userlanding";
		
	}
	@RequestMapping(value = "/register")
	public String signupdata(HttpSession session,HttpServletRequest request){
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		System.out.println("Name--->"+name);
		System.out.println("Email--->"+email);
		System.out.println("Phone--->"+phone);
		
		return "userlanding";
	}
	@RequestMapping(value = "/rent")
	public String rent(){
		return "rent";
	}
	@RequestMapping(value = "/rentimage")
	public String rentimage(){
		return "rentimage";
	}
	
	@RequestMapping(value = "/rentdata")
	public ModelAndView rentdata(HttpSession session,HttpServletRequest request,ModelAndView model){
		model= new ModelAndView("rentimage");
		String offname=request.getParameter("offname");
		String offadd=request.getParameter("offadd");
		String state=request.getParameter("state");
		String city=request.getParameter("city");
		String pincode=request.getParameter("pincode");
		String description=request.getParameter("description");
		String offspace=request.getParameter("offspace");
		String offtime=request.getParameter("offtime");
		String cost=request.getParameter("cost");
		String website=request.getParameter("website");
		String[] BasicAminities=request.getParameterValues("BasicAminities");
		
		System.out.println("offname--->"+offname);
		System.out.println("offadd--->"+offadd);
		System.out.println("state--->"+state);
		System.out.println("city--->"+city);
		System.out.println("pincode--->"+pincode);
		System.out.println("description--->"+description);
		System.out.println("offspace--->"+offspace);
		System.out.println("offtime--->"+offtime);
		System.out.println("cost--->"+cost);
		System.out.println("website--->"+website);
		for(int i=0;i<BasicAminities.length;i++){
		System.out.println("BasicAminities--->"+BasicAminities[i]);
		}
			return model;
	}
	
	@RequestMapping(value = "/UploadImage")
	public String rentimgdata(HttpSession session,HttpServletRequest request,HttpServletRequest response){
		String data=request.getParameter("dataurl");
		System.out.println("data--->"+data);
		return "rentimage";
	}
	
	@RequestMapping(value = "/need")
	public String need(){
		return "need";
	}
	
	@RequestMapping(value = "/fbsignUp")
	public ModelAndView fbsignUp(ModelAndView model,@RequestParam("email") String email,@RequestParam("name") String name){
		model=new ModelAndView("userlanding");
		
		
		return model;
	}
	
	/*
	@RequestMapping(value = "/city")
	public String cityList(){
		return "";
	}
	
	@RequestMapping(value = "/loginAuth" )
	public String loginAuth(HttpSession session,HttpServletRequest request){
		String redirect;
		List<Integer> result=genericBusiness.userLoginAuthandication(request.getParameter("email"),request.getParameter("password"));
		if(result.get(0)==0){
			redirect="index";
		}else{
			session.setAttribute("userID",result.get(0));
			session.setAttribute("email",request.getParameter("email"));
			session.setAttribute("officeid",result.get(1));
			redirect="redirect:/fullDataList";
		}
		return redirect;
	} 
	
	@RequestMapping(value = "/need" )
	public ModelAndView fullList(HttpServletResponse response,ModelAndView model) throws IOException{
		model = new ModelAndView("need");
		List<ListOffices> alrListOffices = genericBusiness.getListOffices();
		model.addObject("fulldata", alrListOffices);
		 return model; 
	}
	
	@RequestMapping(value = "/facilities" )
	public void avilinformation(HttpServletResponse response) throws IOException{
		List<AvailableFacilitiesMaster> listOffAvailableFacilities=genericBusiness.getAllAvailableFacilitiesMasters();
				
		 Gson gson=new Gson();
		 String jsonData=gson.toJson(listOffAvailableFacilities);
		 response.setCharacterEncoding("UTF-8");
		 response.setContentType("application/json");
		 response.getWriter().write(jsonData.toString());
	}
	
	@RequestMapping(value = "/signup")
	public String signup(){
		return "signup";
	}
	
	//RETURN FOR SIGNUP
	@RequestMapping(value = "/register")
	public ModelAndView register(ModelAndView model,HttpServletRequest request){
		model=new ModelAndView("userlanding");
		UserSignUp userSignUp = new UserSignUp();
		userSignUp.setEmailId(request.getParameter("email"));
		userSignUp.setUsername(request.getParameter("name"));
		userSignUp.setContactNumber(request.getParameter("contact"));
		genericBusiness.userSignUp(userSignUp);
		return model;
	}
	
	@RequestMapping(value = "/rent")
	public ModelAndView rent(ModelAndView model){
		model = new ModelAndView("rent");
		List<CityMaster> alrCityMasters = genericBusiness.getAllCityMaster();
		model.addObject("statelist", alrCityMasters);
		return model;
	}
	

	
	@RequestMapping(value = "/userlanding")
	public String userlanding(){
		
		return "userlanding";
	}
	
	
	@RequestMapping(value = "/forgetpassword" )
	public String forgetPassword(HttpServletRequest request){
		if(request.getParameter("email")!=null)
		{
			Integer a = genericBusiness.forgetPassword(request.getParameter("email"));
			if(a==1)
			{
				//success
			}
		}
		return"redirect:/index";
	}
	
	@RequestMapping(value = "/changepassword" )
	public void changePassword(HttpServletRequest request,HttpSession session){
		
		Integer userid = Integer.parseInt(""+session.getAttribute("userid"));
			Integer a = genericBusiness.ChagePassword(request.getParameter("password"), userid);
			if(a==1)
			{
				//success
			}
	}
	
	@RequestMapping(value = "/putImages")
	public void putofficeImages(HttpServletRequest request,HttpSession session){
		Integer officeId = Integer.parseInt(""+session.getAttribute("officeid"));
		genericBusiness.putOfficeImages(request.getParameter("image"),officeId);
		
	}
	
	@RequestMapping(value="/checkboxlist")
	public String officeaddon(HttpServletRequest request, HttpSession session){
		List<Integer> inte=null;
		Integer officeId = Integer.parseInt(""+session.getAttribute("officeid"));
		String[] option=request.getParameter("option").split(",");
		for(String opt:option){
			inte=new ArrayList();
			inte.add(Integer.parseInt(opt));
		}
		
		genericBusiness.putOfficefacilities(inte, officeId);
		return "";
	}
	
	@RequestMapping(value = "/putofficeInfo")
	public String officeInfo(){
		ListOffices listOffices=new ListOffices();
		listOffices.setCost("");
		listOffices.setDescription("");
		listOffices.setDistanceFromBusStand("");
		listOffices.setOfficeAddress("");
		listOffices.setOfficeName("");		
		listOffices.setOfficePincode("");
		listOffices.setOfficeTiming("");
		listOffices.setOfficeWebsite("");
		listOffices.setSquareFeetSeats("");
		genericBusiness.putOfficesInfo(listOffices);
		return "index";
	}
	
	@RequestMapping("/ccityServ")
	public ModelAndView ccitymethod(HttpServletResponse response,
			ModelAndView model, HttpServletRequest request) {
		try {
			String state = request.getParameter("value").toLowerCase();
			Map<String, List<CityMaster>> mapCity = genericBusiness
					.getCity();
			List<CityMaster> alrCity = null;
			if (mapCity.containsKey(state)) {
				alrCity = mapCity.get(state);
			}
			model = new ModelAndView("address");
			model.addObject("ccitylist", alrCity);
			
		} 
		catch(Exception e)
		{
			
		}
		return model;
	}
	*/
	@RequestMapping(value = "/subscribe")
	public String welcom(@RequestParam("email") String email){
		mailUtil.SendMail("care.hubcs@gmail.com", email, "Subscribed User");
		return "index";
	}
	

	}
