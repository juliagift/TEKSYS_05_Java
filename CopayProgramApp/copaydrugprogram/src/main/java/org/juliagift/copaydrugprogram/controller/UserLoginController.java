package org.juliagift.copaydrugprogram.controller;

import javax.validation.Valid;

import org.juliagift.copaydrugprogram.dto.UserRegistrationDto;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//@RequestMapping("/login")
public class UserLoginController {
	
//	@Autowired
//	private UserService userService;
//	


	
	
	
	
	
//	@PostMapping
//	public ModelAndView processLoginForm(ModelAndView modelAndView, @Valid User user,
//			BindingResult result) {
//		
//		User existingUser = userService.findByEmail(user.getLogin().getEmail());
//		
//		System.out.println("in the login controller");
//		System.out.println(existingUser);
//		
//		if(existingUser == null) {
//			modelAndView.addObject("NoUserFoundMessage", "You are not authorized to log in");
//			modelAndView.setViewName("register");
//			
//			result.reject("email");
//		}
//		
//		if (result.hasErrors()) { 
//			modelAndView.setViewName("login");		
//		}
//		
//		return null;
//		
//	}
	
	
	
//	@GetMapping("/index")
//	public ModelAndView userDashboard() {
//		return new ModelAndView("index");
//	}
//	
//	@GetMapping("/adminDashboard")
//	public ModelAndView showAdminDashboard() {
//		return new ModelAndView("adminDashboard");
//	}
	

}
