package com.example.thymeleafprojectdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.thymeleafprojectdemo.entity.User;

@Controller
public class UserContoller {
	
	//making a request, then using a method to handle that request
	@GetMapping(value= "/")
	public String index() {   //handle request
		return "index";       //return html doc to the screen, don't have to put index.html
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.POST)
	public ModelAndView profile(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("profile");  //view it on the profile.html page
		modelAndView.addObject("User", user);  //access to the data from the user entity
		
		return modelAndView;
	}
}
