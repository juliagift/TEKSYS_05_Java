package org.juliagift.copaycard.dao;

import org.juliagift.copaycard.dto.UserLoginDTO;
import org.juliagift.copaycard.entity.Card;
import org.juliagift.copaycard.exception.CustomException;

public interface PatientDAO {
	
	Boolean registerPatient(UserLoginDTO user) throws CustomException;
	Double getPatientPaymentByCardId(Card card) throws CustomException;
	
}
