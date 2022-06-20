package org.juliagift.copaydrugprogram.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	private UserService userService;
	

	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	
	

//	@ModelAttribute("drugs")
//	@GetMapping
//	public String getDrugs(Model model) {
//		List<Drug> drugs = new ArrayList<Drug>();
//		drugs.add(new Drug(1L, "Diabetedox"));
//		drugs.add(new Drug(2L, "Arthriticol"));
//		drugs.add(new Drug(3L, "Urimex"));
//		drugs.add(new Drug(4L, "Thrombitinin"));
//		drugs.add(new Drug(5L, "Cervisave"));
//		
//		model.addAttribute("drugs", drugs);
//		
//		return "registration";
//	}
	
//	List<Drug> drugs;
//	
//	@ModelAttribute
//	public void getDrugs(Model model) {
//		drugs = new ArrayList<Drug>();
//		drugs.add(new Drug("Diabetedox", 100.00));
//		drugs.add(new Drug("Arthriticol", 200.00));
//		drugs.add(new Drug("Urimex", 300.00));
//		drugs.add(new Drug("Thrombitinin", 400.00));
//		drugs.add(new Drug("Cervisave", 500.00));
//		
//	}
	
	// Return registration form template
	@GetMapping
	public String showRegistrationForm(Model model) {
		
		return "registration";
	}
	
	// Process form input data
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto,
			BindingResult result) {
		
		// Lookup patient in database by email
		User existingUser = userService.findByEmail(userDto.getEmail());
		if (existingUser != null) {
			result.rejectValue("email", null, "There is already an account registered with that email");
			
		}
 
		
//		System.out.println("I am here in the controller");
//		System.out.println(existingUser);
//		System.out.println(result);
		
		if (result.hasErrors()) {
			return "registration";
		}
		

		userService.registerUser(userDto);
		return "redirect:/registration?success";
		

		
		
		


	}
	
	

}
