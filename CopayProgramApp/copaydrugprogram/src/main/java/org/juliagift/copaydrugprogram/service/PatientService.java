package org.juliagift.copaydrugprogram.service;

import org.juliagift.copaydrugprogram.dto.PatientRegistrationDto;
import org.juliagift.copaydrugprogram.exception.PatientAlreadyExistsException;
import org.juliagift.copaydrugprogram.model.Patient;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface PatientService {

	Patient findByEmail(String email);
	Patient registerPatient(PatientRegistrationDto registration) throws PatientAlreadyExistsException;
	

}
//extends UserDetailsService 