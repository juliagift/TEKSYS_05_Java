package org.juliagift.copayprogram.service;

import java.util.ArrayList;
import java.util.List;

import org.juliagift.copayprogram.entity.Claim;
import org.juliagift.copayprogram.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimServiceImpl implements ClaimService{
	
	@Autowired
	private ClaimRepository claimRepository;
	
	public List<Claim> getAllClaims() {
		List<Claim> claims = new ArrayList<>();
		claimRepository.findAll().forEach(claims::add);
		return claims;
	}
	
}
