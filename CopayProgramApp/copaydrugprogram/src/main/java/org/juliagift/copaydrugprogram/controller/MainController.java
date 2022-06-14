package org.juliagift.copaydrugprogram.controller;

import java.util.ArrayList;
import java.util.List;

import org.juliagift.copaydrugprogram.model.Drug;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String root() {
		return "index";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@GetMapping("/user")
	public String userIndex() {
		return "user/index";
	}
	
	@GetMapping("/home")
	public String showHomePage() {
		return "home";
	}
	
//	@ModelAttribute("drugs")
//	@PostMapping("/registration")
//	public String getDrugs(Model model) {
//		List<Drug> drugs = new ArrayList<Drug>();
//		drugs.add(new Drug("Diabetedox", 1L));
//		drugs.add(new Drug("Arthriticol", 2L));
//		drugs.add(new Drug("Urimex", 3L));
//		drugs.add(new Drug("Thrombitinin", 4L));
//		drugs.add(new Drug("Cervisave", 5L));
//		
//		model.addAttribute("drugs", drugs);
//		
//		return "registration";
//	}

}
