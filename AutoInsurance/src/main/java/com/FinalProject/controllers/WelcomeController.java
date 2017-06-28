package com.FinalProject.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.FinalProject.model.CustomerProfile;
import com.FinalProject.repositories.CustomerProfileRepository;

@Controller
public class WelcomeController {

	@Autowired
	CustomerProfileRepository customerProfileRepository;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response) throws IOException{
		return "login";
	}
	
	
	@RequestMapping(value="/checklogin", method=RequestMethod.POST)
	public ModelAndView checklogin(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String Username = request.getParameter("userId");
		String Userpassword = request.getParameter("password");
		
		/*ModelAndView mv;
		System.out.println("Name : " + Username + " Password : " + Userpassword);
		if(Username.equals(getParameter("userId"))  && Userpassword.equals(getParameter.("Password")){
			mv = new ModelAndView("home");
			mv.addObject("userId",Username);
		} else {
			mv = new ModelAndView("login");
			mv.addObject("msg", "Please Try Again");
		}
		
		return mv;*/
		
		ModelAndView mv;
		System.out.println("Name : " + Username + " Password : " + Userpassword);
		
		CustomerProfile customerProfile = customerProfileRepository.cprofile(Username, Userpassword);
						
				
		if(customerProfile !=null){
			mv = new ModelAndView("CustomerProfile");
			
			mv.addObject("customerProfile",customerProfile);
			
		} else {
			mv = new ModelAndView("login");
			mv.addObject("msg", "Please Try Again");
		}
		
		return mv;
	
	/*@RequestMapping(value="/checklogin", method=RequestMethod.POST)
	public String checklogin (@RequestParam("userId") String userName, @RequestParam("password") String userPassword) throws IOException{
		String userName = request.getParameter("userId");
		String userPassword = request.getParameter("password");
		System.out.println("Name : " + userName + " Password : " + userPassword);
		ModelAndView mv = new ModelAndView("home");
		mv.addOb
		return "home";
	}
*/
	
	
}
}
