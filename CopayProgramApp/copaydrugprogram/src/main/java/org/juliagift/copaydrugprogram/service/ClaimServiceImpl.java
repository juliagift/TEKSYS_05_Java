package org.juliagift.copaydrugprogram.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import org.juliagift.copaydrugprogram.exception.ClaimNotFoundException;
import org.juliagift.copaydrugprogram.model.Card;
import org.juliagift.copaydrugprogram.model.Claim;
import org.juliagift.copaydrugprogram.model.Pharmacy;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.repository.CardRepository;
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
	
	@Autowired
	private CardRepository cardRepository;;
	
	@Autowired
	private ClaimRepository claimRepository;
	

	@Override
	public Claim submitClaim(UserDetails userDetails, Pharmacy pharmacy) throws NotFoundException {
		String userEmail = userDetails.getUsername();	
		Card card = cardRepository.findCardByEmail(userEmail);
		Claim claim = new Claim();
		
		claim.setDrugCostAtClaim(drugCost);
		claim.setManufacturerPayment((1 - card.getBenefit()) * drugCost);
		claim.setPatientPayment(card.getBenefit() * drugCost);
		claim.setStatus("P");
		claim.setTransactionDate(LocalDateTime.now());
		claim.setCard(card);
		claim.setPharmacy(pharmacy);
		
//		System.out.println("in the claim service");
//		System.out.println(claim);

		return claimRepository.save(claim);
	}
	
	@Override
	public List<Claim> getAllClaims() throws NotFoundException {
		List<Claim> claims = new ArrayList<>();
		
		claims = claimRepository.findAll();
		
//		System.out.println("I am in getAllClaims");
//		System.out.println(claims);
		
		return claims;
		
	}

	@Override
	public List<Claim> getAllClaimsByCard(Card card) throws NotFoundException {
		List<Claim> claims = new ArrayList<>();
		
		claims = claimRepository.getAllClaimsByCard(card.getCardId());
		
//		System.out.println("I am in getAllClaims");
//		System.out.println(claims);
		
		return claims;
		
	}
	
	

}
