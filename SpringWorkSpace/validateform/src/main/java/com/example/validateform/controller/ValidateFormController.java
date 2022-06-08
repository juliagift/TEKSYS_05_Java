package com.example.validateform.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.validateform.entity.PersonForm;

@Controller
public class ValidateFormController implements WebMvcConfigurer{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");   
	}
	
	@GetMapping(value = "/")
	public String getForm(PersonForm personForm) {
		return "formPage";
	}
	
	@PostMapping(value = "/")   
	public String checkInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formPage"; //if there are errors, redirect back here
		}
		return "redirect:/results";  //if no errors, proceed to results page
	}
}
