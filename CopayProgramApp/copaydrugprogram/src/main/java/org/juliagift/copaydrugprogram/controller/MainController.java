package org.juliagift.copaydrugprogram.controller;



import java.util.List;

import org.juliagift.copaydrugprogram.model.Pharmacy;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * main controller to redirect users based on their role.
 * this is the main controller to redirect user to their dashboard pages based on role name 
 * * for admin it should be /admin/dashboard
 * * for user  it should be /user/dashboard
 *
 * @author abhishek.somani
 */

@Controller
public class MainController {
	
	
	@GetMapping("/home")
	public String showHomePage() {
		return "home";
	}
	
	@GetMapping("/login")
	public  ModelAndView showLoginPage() {
		return new ModelAndView("login");
	}
	
	@GetMapping("/adminDashboard")
	public ModelAndView showAdminDashboard() {
		return new ModelAndView("adminDashboard");
	}
	
	
	@GetMapping("/delete")
	public ModelAndView deleteUser() {
		return new ModelAndView("delete");
	}
	

	
	
	
	
	
//	@ModelAttribute("drugs")
//	@PostMapping("/registration")
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

}
