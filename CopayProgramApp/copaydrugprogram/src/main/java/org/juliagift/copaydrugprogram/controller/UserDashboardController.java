package org.juliagift.copaydrugprogram.controller;

import java.util.List;

import org.juliagift.copaydrugprogram.dto.UserCard;
import org.juliagift.copaydrugprogram.exception.ClaimNotFoundException;
import org.juliagift.copaydrugprogram.model.Card;
import org.juliagift.copaydrugprogram.model.Claim;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.service.ClaimService;
import org.juliagift.copaydrugprogram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//@Controller
public class UserDashboardController {
	
//	@Autowired
//	private ClaimService claimService;
	
//	@Autowired
//	private UserService userService;
	
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
//			
//	
//		
//
//		
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
//	@GetMapping("/claims")
//	public String getAllClaims(Model model, RedirectAttributes redirectAttributes) {
//		List<Claim> claims;
//		try {
//			
//			claims = claimService.getAllClaims();
//			System.out.println("In the userdashboard controller");
//		claims.forEach(claim -> {
//			System.out.println(claim);
//		});
//			model.addAttribute("claims", claims);
//			return "claim";
//		} catch (ClaimNotFoundException e) {
//			
//			redirectAttributes.addFlashAttribute("message", "No claim was found.");
//			return "redirect:/userDashboard";
//		}
//			
//	}
	
	
	
	
//}
}