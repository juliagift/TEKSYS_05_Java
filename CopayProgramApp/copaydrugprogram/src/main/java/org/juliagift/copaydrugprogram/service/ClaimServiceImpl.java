package org.juliagift.copaydrugprogram.service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.juliagift.copaydrugprogram.exception.ClaimNotFoundException;
import org.juliagift.copaydrugprogram.model.Claim;
import org.juliagift.copaydrugprogram.model.Pharmacy;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class ClaimServiceImpl implements ClaimService {
	
//	@Autowired
//	private ClaimRepository claimRepository;
	
//		public Claim submitClaim(User user) {
//		
//		Claim claim = new Claim();
//		claim.setDrugCostAtClaim(100.0);
//		
//		claim.setTransactionDate(LocalDateTime.now());
//		
//		Date sqlDate = new Date(new java.util.Date().getTime());
//		claim.setTransactionDate(sqlDate);
//		
//		claim.setStatus("P");
//		claim.setPatientPayment(25.0);
//		
//		Pharmacy pharmacy = new Pharmacy("CVS");
//		claim.setPharmacy(pharmacy);
//
//		return claim;
//	}
//	
//	public List<Claim> getAllClaims() throws ClaimNotFoundException {
//		List<Claim> claims = new ArrayList<>();
//		
//		claims = claimRepository.findAll();
//		
//		if(claims != null) {
//			claims.forEach(claims::add);
//		} else {
//			throw new ClaimNotFoundException("No claims found");
//		}
//		
//		return claims;
		
	//}

	
	

}
