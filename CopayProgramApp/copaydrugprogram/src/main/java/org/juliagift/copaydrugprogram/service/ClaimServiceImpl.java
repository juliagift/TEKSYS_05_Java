package org.juliagift.copaydrugprogram.service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.juliagift.copaydrugprogram.exception.ClaimNotFoundException;
import org.juliagift.copaydrugprogram.model.Card;
import org.juliagift.copaydrugprogram.model.Claim;
import org.juliagift.copaydrugprogram.model.Pharmacy;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.repository.ClaimRepository;
import org.juliagift.copaydrugprogram.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Service
public class ClaimServiceImpl implements ClaimService {
	public final double drugCost = 100.0;
//	@Autowired
//	private ClaimRepository claimRepository;
//	@Override
//	public List<Claim> getAllClaims() throws NotFoundException {
//		List<Claim> claims = new ArrayList<>();
//		
//		claims = claimRepository.findAll();
//		
//		if(claims != null) {
//			claims.forEach(claims::add);
//			
//			return claims;
//		} else {
//			throw new NotFoundException();
//		}		
//	}
	@Autowired
	private CardService cardService;
	
	@Autowired
	private ClaimRepository claimRepository;
	
	@Autowired
	private PharmacyRepository pharmacyRepository;
	
	
	@Override
	public Claim submitClaim(UserDetails userDetails) throws NotFoundException {
	//public Claim submitClaim(@AuthenticationPrincipal UserDetails userDetails, Model model, RedirectAttributes redirectAttributes) {
//		String userEmail = userDetails.getUsername();//		
//		
//		try {
//			Card card = cardService.findCardByEmail(userEmail);
//			model.addAttribute("card", card);
//			
//			
//		} catch (NotFoundException e) {
//			redirectAttributes.addFlashAttribute("message", "No cards found");
//			
//		}
		
		
		String userEmail = userDetails.getUsername();
		
		Card card = cardService.findCardByEmail(userEmail);
		
	
		Claim claim = new Claim();
		claim.setDrugCostAtClaim(drugCost);
		claim.setManufacturerPayment((1 - card.getBenefit()) * drugCost);
		claim.setPatientPayment(card.getBenefit() * drugCost);
		claim.setStatus("P");
		
		
//		Date sqlDate = new Date(new java.util.Date().getTime());
//		claim.setTransactionDate(sqlDate);
		claim.setTransactionDate(LocalDateTime.now());

		
		claim.setCard(card);
		
		Pharmacy pharmacy = pharmacyRepository.findById(1L).get();
		

		
		if (pharmacy == null) {
			pharmacy = new Pharmacy("CVS 3272", "4805075399", "2371 E Guadalupe Rd", null, "Gilbert", "AZ", 85234, null);
		}
		claim.setPharmacy(pharmacy);
		
		System.out.println("in the claim service");
		System.out.println(claim);

		return claimRepository.save(claim);
	}
	
	@Override
	public List<Claim> getAllClaims() throws NotFoundException {
		List<Claim> claims = new ArrayList<>();
		
		claims = claimRepository.findAll();
		
		if(claims != null) {
			claims.forEach(claims::add);
		} else {
			throw new NotFoundException();
		}
		
		return claims;
		
	}

	
	

}
