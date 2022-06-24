package org.juliagift.copaydrugprogram.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.juliagift.copaydrugprogram.dto.ClaimSubmissionDto;
import org.juliagift.copaydrugprogram.dto.UserProfileDto;
import org.juliagift.copaydrugprogram.dto.UserRegistrationDto;
import org.juliagift.copaydrugprogram.exception.ClaimNotFoundException;
import org.juliagift.copaydrugprogram.exception.UserNotFoundException;
import org.juliagift.copaydrugprogram.model.Card;
import org.juliagift.copaydrugprogram.model.Claim;
import org.juliagift.copaydrugprogram.model.Login;
import org.juliagift.copaydrugprogram.model.Pharmacy;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.repository.PharmacyRepository;
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

	@Autowired
	private PharmacyRepository pharmacyRepository;
	
	
	List<Pharmacy> pharmacies;
	
//	@ModelAttribute("pharmacies")
//	public void getPharmacies() {
//   
//			List<Pharmacy> thePharmacies = new ArrayList<Pharmacy>();
//			thePharmacies.add(new Pharmacy("CVS 3272", "4805075399", "2371 E Guadalupe Rd", null, "Gilbert", "AZ", "85234", null));
//			thePharmacies.add(new Pharmacy("CVS 9222", "6022725601", "4275 W Thomas Rd", null, "Phoenix", "AZ", "85019", null));
//			thePharmacies.add(new Pharmacy("Walmart 5186", "4802246900", "2501 S Market St", null, "Gilbert", "AZ", "85295", null));
//			thePharmacies.add(new Pharmacy("Walmart 3789", "6022757507", "3605 E Thomas Rd", null, "Phoenix", "AZ", "85018", null));
//			thePharmacies.add(new Pharmacy("Frys 628", "4807067340", "3949 E Chandler Blvd", null, "Phoenix", "AZ", "85048", null));
//			
//			thePharmacies.add(new Pharmacy("CVS 1822", "2519478602", "21975 Hwy 59", null, "Robertsdale", "AL", "36567", null));
//			thePharmacies.add(new Pharmacy("CVS 10516", "2568515350", "5859 Highway 53", null, "Harvest", "AL", "35749", null));
//			thePharmacies.add(new Pharmacy("Walmart 1201", "2056318110", "890 Odum Rd", null, "Gardendale", "AL", "35071", null));
//			thePharmacies.add(new Pharmacy("Walmart 7280", "2566156667", "5601 Al Highway 157", null, "Cullman", "AL", "35058", null));
//			thePharmacies.add(new Pharmacy("Birmingham Loyalty Kroger", "8005764377", "14 W Oxmoor Rd", null, "Homewood", "AL", "35209", null));
//			
//			thePharmacies.add(new Pharmacy("CVS 613", "8139351134", "9202 N Florida Ave", null, "Tampa", "FL", "33612", null));
//			thePharmacies.add(new Pharmacy("CVS 5400", "4072384726", "6790 Central Florida Pkwy", null, "Orlando", "FL", "32821", null));
//			thePharmacies.add(new Pharmacy("Walmart 5871", "3212474817", "5734 S Orange Blossom Trl", null, "Orlando", "FL", "32839", null));
//			thePharmacies.add(new Pharmacy("Walmart 2727", "3052424447", "33501 S Dixie Hwy", null, "Florida City", "FL", "33034", null));
//			thePharmacies.add(new Pharmacy("Groveland Loyalty", "8005764377", "7925 American Way", null, "Groveland", "FL", "34736", null));
//			
//	}
//			
//			for (Pharmacy pharmacy : thePharmacies) {
//				pharmacyRepository.save(pharmacy);
//			}
//		
//
//		
//		
//	}
	
	
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
		
		
		// If there are no pharmacies in the database, populate some.
		// Our specialty drug is only available at these 15 pharmacies.
		
		
		

		List<Pharmacy> pharmacies = pharmacyRepository.findAll();
		
		if (pharmacies.isEmpty()) {
			List<Pharmacy> thePharmacies = new ArrayList<Pharmacy>();
			thePharmacies.add(new Pharmacy("CVS 3272", "4805075399", "2371 E Guadalupe Rd", null, "Gilbert", "AZ", "85234", null));
			thePharmacies.add(new Pharmacy("CVS 9222", "6022725601", "4275 W Thomas Rd", null, "Phoenix", "AZ", "85019", null));
			thePharmacies.add(new Pharmacy("Walmart 5186", "4802246900", "2501 S Market St", null, "Gilbert", "AZ", "85295", null));
			thePharmacies.add(new Pharmacy("Walmart 3789", "6022757507", "3605 E Thomas Rd", null, "Phoenix", "AZ", "85018", null));
			thePharmacies.add(new Pharmacy("Frys 628", "4807067340", "3949 E Chandler Blvd", null, "Phoenix", "AZ", "85048", null));
			
			thePharmacies.add(new Pharmacy("CVS 1822", "2519478602", "21975 Hwy 59", null, "Robertsdale", "AL", "36567", null));
			thePharmacies.add(new Pharmacy("CVS 10516", "2568515350", "5859 Highway 53", null, "Harvest", "AL", "35749", null));
			thePharmacies.add(new Pharmacy("Walmart 1201", "2056318110", "890 Odum Rd", null, "Gardendale", "AL", "35071", null));
			thePharmacies.add(new Pharmacy("Walmart 7280", "2566156667", "5601 Al Highway 157", null, "Cullman", "AL", "35058", null));
			thePharmacies.add(new Pharmacy("Birmingham Loyalty Kroger", "8005764377", "14 W Oxmoor Rd", null, "Homewood", "AL", "35209", null));
			
			thePharmacies.add(new Pharmacy("CVS 613", "8139351134", "9202 N Florida Ave", null, "Tampa", "FL", "33612", null));
			thePharmacies.add(new Pharmacy("CVS 5400", "4072384726", "6790 Central Florida Pkwy", null, "Orlando", "FL", "32821", null));
			thePharmacies.add(new Pharmacy("Walmart 5871", "3212474817", "5734 S Orange Blossom Trl", null, "Orlando", "FL", "32839", null));
			thePharmacies.add(new Pharmacy("Walmart 2727", "3052424447", "33501 S Dixie Hwy", null, "Florida City", "FL", "33034", null));
			thePharmacies.add(new Pharmacy("Groveland Loyalty", "8005764377", "7925 American Way", null, "Groveland", "FL", "34736", null));
			
			for (Pharmacy pharmacy : thePharmacies) {
				pharmacyRepository.save(pharmacy);
			}
		}

		return "userDashboard";

	}

	@GetMapping("/claim")
	public String submitClaim(Model model) {

		// You can use this list to populate the pharmacy dropdown in claim.html.
		List<Pharmacy> pharmacies = pharmacyRepository.findAll();
		System.out.println("userdashboard controller/submit claim/GetMapping");
		System.out.println(pharmacies);
		model.addAttribute("pharmacies", pharmacies);
		
		return "claim";
	}

	@PostMapping("/claim")
	public String submitClaim(@AuthenticationPrincipal UserDetails userDetails, @ModelAttribute("pharmacy") @Valid ClaimSubmissionDto claimDto,Model model,
			BindingResult result, RedirectAttributes redirectAttributes) {

//		System.out.println(model.getAttribute("pharmacies"));
		 // This is the user-chosen pharmacy from the dropdown.
		Pharmacy pharmacy = userService.findPharmacyById(claimDto.getPharmacyId());
//		System.out.println("userdashboard controller/submit claim/post mapping");
//		System.out.println(claimDto.getPharmacyId());
//		System.out.println(pharmacy);

		try {
			Claim claim = claimService.submitClaim(userDetails, pharmacy);

			System.out.println("userdashboard controller/submit claim");
			System.out.println(claim);

			model.addAttribute("claim", claim);
			redirectAttributes.addFlashAttribute("message", "You have successfully submitted a claim.");
			return "redirect:/claim?success";

		} catch (NotFoundException e) {
			//redirectAttributes.addFlashAttribute("message", "Your claim has not been saved");
			return "userDashboard";
		}
		//return "userDashboard";
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

			//return "redirect:/delete?success";
			return "login";
			
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
	
	@GetMapping("/edit")
	public String showEditForm(@AuthenticationPrincipal UserDetails userDetails, Model model, RedirectAttributes redirectAttributes) {
		
		String userEmail = userDetails.getUsername();
		Card card = null;
		try {
			card = cardService.findCardByEmail(userEmail);
		} catch (NotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "No cards found");
		}
		User user = card.getUser();
		model.addAttribute("user", user);
		
		return "edit";
	}
	
	@PostMapping("/edit")
	public String editUserProfile(@ModelAttribute("user") @Valid UserProfileDto userProfileDto, BindingResult result) {
		
		if(result.hasErrors()) {
			return "edit";
		}
		
		userService.updateUser(userProfileDto);//byuserId
		return "redirect:/edit?success";
		
	}
	
	@GetMapping("/profile")
	public String showUserProfile(@AuthenticationPrincipal UserDetails userDetails, Model model, RedirectAttributes redirectAttributes) {
		
		String userEmail = userDetails.getUsername();
		Card card = null;
		try {
			card = cardService.findCardByEmail(userEmail);
		} catch (NotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "No cards found");
		}
		User user = card.getUser();
		model.addAttribute("user", user);
		
		return "profile";
	}
	


}