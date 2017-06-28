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
public class RegisterController {

	@Autowired
	private CustomerProfileRepository customerProfileRepository;
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request, HttpServletResponse response) throws IOException{
		return "register";
	}
	
	@RequestMapping(value= "/register", method = RequestMethod.POST)
	public ModelAndView registerCustomer(HttpServletRequest request){
		
		CustomerProfile customerProfile = new CustomerProfile();
		
		customerProfile.setFirstName(request.getParameter("firstName"));
		customerProfile.setLastName(request.getParameter("lastName"));
		customerProfile.setEmail(request.getParameter("email"));
		customerProfile.setPhone(request.getParameter("phone"));
		customerProfile.setGender(request.getParameter("gender"));
		customerProfile.setAddress1(request.getParameter("address1"));
		customerProfile.setAddress2(request.getParameter("address2"));
		customerProfile.setCity(request.getParameter("city"));
		customerProfile.setState(request.getParameter("state"));
		customerProfile.setUserId(request.getParameter("userId"));
		customerProfile.setPassword(request.getParameter("password"));
		
		customerProfileRepository.saveCustomer(customerProfile);
		
		ModelAndView mv = new ModelAndView("confirmation");
		mv.addObject("profile", customerProfile);
		
		return mv;
	
  }
}
