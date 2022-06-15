package org.juliagift.copaydrugprogram.service;

import org.juliagift.copaydrugprogram.dto.PatientRegistrationDto;
import org.juliagift.copaydrugprogram.model.Patient;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface PatientService extends UserDetailsService {

	Patient findByEmail(String email);
	Patient save(PatientRegistrationDto registration);

}
