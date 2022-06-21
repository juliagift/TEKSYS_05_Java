package org.juliagift.copaydrugprogram.controller;

import java.util.List;

import javax.validation.Valid;

import org.juliagift.copaydrugprogram.exception.ClaimNotFoundException;
import org.juliagift.copaydrugprogram.exception.UserNotFoundException;
import org.juliagift.copaydrugprogram.model.Card;
import org.juliagift.copaydrugprogram.model.Claim;
import org.juliagift.copaydrugprogram.model.Login;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.repository.UserRepository;
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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserDashboardController {

//	@Autowired
//	private UserRepository userRepository;

	@Autowired
	private CardService cardService;

	@Autowired
	private ClaimService claimService;

	@Autowired
	private UserService userService;

	@GetMapping("/userDashboard")
	public String showUserDashboard(@AuthenticationPrincipal UserDetails userDetails, Model model,
			RedirectAttributes redirectAttributes) {

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
	public String submitClaim(@AuthenticationPrincipal UserDetails userDetails, Model model,
			RedirectAttributes redirectAttributes) {

		try {
			Claim claim = claimService.submitClaim(userDetails);

			System.out.println("userdashboard controller/submit claim");
			System.out.println(claim);

			model.addAttribute("claim", claim);
			redirectAttributes.addFlashAttribute("message", "You have successfully submitted a claim.");
			return "redirect:/claim?success";

		} catch (NotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "Your claim has not been saved");
			return "redirect:/userDashboard";
		}

	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	//@DeleteMapping("/delete")
	public String deleteUserById(@AuthenticationPrincipal UserDetails userDetails, Model model, RedirectAttributes redirectAttributes) {
		
		try {
			User user = userService.deleteUserById(userDetails);
			
			System.out.println("userdashboard controller/delete user");
			System.out.println(user);
			
			model.addAttribute("user", user);
			redirectAttributes.addFlashAttribute("message", "Your account has been deleted.");

			return "redirect:/delete?success";
			
		} catch (UserNotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "Your account has not been deleted");
			return "redirect:/delete?error";
		}
	}


	@GetMapping("/claims")
	public String getAllClaims(@AuthenticationPrincipal UserDetails userDetails, Model model, RedirectAttributes redirectAttributes) {
		List<Claim> claims;
		Card card = null;
		
		try {
			card = cardService.findCardByEmail(userDetails.getUsername());
			model.addAttribute("card", card);

		} catch (NotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "No cards found");

		}

		try {

			claims = claimService.getAllClaimsByCard(card);
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