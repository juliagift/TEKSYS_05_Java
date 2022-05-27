package org.juliagift.copaycard.dao;

import java.util.List;

import org.juliagift.copaycard.entity.Card;
import org.juliagift.copaycard.entity.Claim;
import org.juliagift.copaycard.entity.Patient;
import org.juliagift.copaycard.exception.CustomException;

public interface ClaimDAO {
	
	List<Claim> getAllClaims() throws CustomException;
	List<Claim> getClaimsByCardId(Card card) throws CustomException;
	Boolean submitClaim(Patient patient) throws CustomException;
	Boolean deleteClaim(Patient patient) throws CustomException;
}
