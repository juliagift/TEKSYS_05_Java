package org.juliagift.copayprogram.service;

import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
	
	@Autowired
	private UserRepository userRepository;

	public Patient getPatientById(Long id) {
		
		return userRepository.getReferenceById(id);
	}
	
//	public viewClaimByCardId() {
//		
//	}
}
