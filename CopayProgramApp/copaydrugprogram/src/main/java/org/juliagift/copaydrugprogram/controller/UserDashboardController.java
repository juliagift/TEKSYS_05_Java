package org.juliagift.copaydrugprogram.controller;

import java.util.List;

import javax.validation.Valid;

import org.juliagift.copaydrugprogram.exception.ClaimNotFoundException;
import org.juliagift.copaydrugprogram.model.Card;
import org.juliagift.copaydrugprogram.model.Claim;
import org.juliagift.copaydrugprogram.model.Login;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.service.CardService;
import org.juliagift.copaydrugprogram.service.ClaimService;
import org.juliagift.copaydrugprogram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserDashboardController {
		
//	@Autowired
//	private UserService userService;
	
	@Autowired
	private CardService cardService;
	
	@Autowired
	private ClaimService claimService;
	

	
	@GetMapping("/userDashboard")
	public String showUserDashboard(@AuthenticationPrincipal UserDetails userDetails, Model model, RedirectAttributes redirectAttributes) {
		
		String userEmail = userDetails.getUsername();
		
		
//		User user = userService.findUserByEmail(userEmail);
		
		
		try {
			Card card = cardService.findCardByEmail(userEmail);
			model.addAttribute("card", card);
			
			
		} catch (NotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "No cards found");
			
		}
		
		return "userDashboard";
		
		
		
	}
	
	@PostMapping("/claim")
	public String submitClaim(@Valid UserDetails userDetails, Model model, RedirectAttributes redirectAttributes) {
		
		try {
			Claim claim = claimService.submitClaim(userDetails);
			
			System.out.println("userdashboard controller/submit claim");
			System.out.println(claim);
			
			model.addAttribute("claim", claim);
			redirectAttributes.addFlashAttribute("message", "You have successfully submitted a claim.");
			return "claims";
			
		} catch (NotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "Your claim has not been saved");
			return "redirect:/userDashboard";
		}
		
	}
	
//	@ModelAttribute("login")
//	public Login getLogin() {
//		return new Login();
//	}
//	
//	@GetMapping("/login")
//	public String doLogin(Model model) {
//		
//		model.addAttribute("login", new Login());
//		
//		System.out.println(new Login());
//		System.out.println(new Login().getEmail());
//		
//		return "login";
//	}
//	
//	@PostMapping("/login")
//	public String postLogin(@Valid Login login, Model model) {
//		
//		model.addAttribute("login", login);
//		
//		System.out.println("in login");
//		
//		System.out.println(login);
//		System.out.println(login.getEmail());
//		
//		return "redirect:/userDashboard";
//	}
//	
//	
//	@GetMapping("/userDashboard")
//	public String showUserDashboard(@Valid Login login, Model model, BindingResult result) {
//		
//		model.addAttribute("login", login);
//		
//		System.out.println("In the dashboard controller");
//		System.out.println(login);
//		
//	;
//
//		
//		return "userDashboard";
//	}
	
//	@GetMapping("/login")
//	public String login(@ModelAttribute("login") Login login, Model model) {
//		
//		System.out.println("in login");
//		
//		System.out.println(login.getEmail());
//		model.addAttribute("formVar", login);
//		return "login";
//	}
//	
//	
//	@RequestMapping("/userDashboard")
//	public String showUserDashboard(@ModelAttribute("login") Login login, Model model) {
//		
//		String loginEmail = login.getEmail();
//		
//		System.out.println("In the dashboard controller");
//		System.out.println(loginEmail);
//		
//		model.addAttribute("userInfo", loginEmail);
//		
////		Card dashboardCard = userService.findCardByEmail(email);
////		
////		System.out.println("In the dashboard controller");
////		System.out.println(dashboardCard);
////		
////		model.addAttribute("dashboardCard", dashboardCard);
//
//		
//		return "userDashboard";
//	}
	
//	@GetMapping("/userDashboard")
//	public String showUserDashboard(@RequestParam(required = false) String email, Model model) {
//		
//		Card dashboardCard = userService.findCardByEmail(email);
//		
//		System.out.println("In the dashboard controller");
//		System.out.println(dashboardCard);
//		
//		model.addAttribute("dashboardCard", dashboardCard);
//
//		
//		return "userDashboard";
//	}
	
//	
//	@RequestMapping("/userDashboard")
//	@ResponseBody
//	public String displayUserDashboard(@RequestParam("email") String email, @RequestParam("id") Long id, Model model) {
//		
//			UserCard userCard = userService.getUserCard(email, id);
//			
//			System.out.println("in the dashboard controller");
//			
//			System.out.println(userCard);
//			model.addAttribute("usercard", userCard);
//			
//			
//			
//			
//			return "userDashboard";	
//	}
	
	
//	
//	@PostMapping("/claim")
//	public String submitClaim(Model model) {
//		
//		Claim claim = claimService.submitClaim();
//		model.addAttribute("claim", claim);
//		
//		return "claims";
//		
//		
//	}
//	
//	
//	
	@GetMapping("/claims")
	public String getAllClaims(Model model, RedirectAttributes redirectAttributes) {
		List<Claim> claims;
		try {
			
			claims = claimService.getAllClaims();
			System.out.println("In the userdashboard controller");
		
		claims.forEach(claim -> {
			System.out.println(claim);
		});
			model.addAttribute("claims", claims);
			return "claims";
		} catch (NotFoundException e) {
			
			redirectAttributes.addFlashAttribute("message", "No claim was found.");
			return "redirect:/userDashboard";
		}
			
	}
	
	
	
	
//}
}