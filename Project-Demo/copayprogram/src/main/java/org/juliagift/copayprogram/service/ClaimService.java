package org.juliagift.copayprogram.service;

import java.util.List;

import org.juliagift.copayprogram.entity.Claim;

public interface ClaimService {
	
	Claim submitClaim();
		
	List<Claim> getAllClaims();

	
	
}
