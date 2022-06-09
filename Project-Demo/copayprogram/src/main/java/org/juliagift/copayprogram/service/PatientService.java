package org.juliagift.copayprogram.service;

import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
	
	@Autowired
	private UserRepository userRepository;

	public Patient getPatientById(Long id) {
		
		return userRepository.getReferenceById(id);
	}
	
	public Patient updatePatient(Long id, Patient patient) throws ChangeSetPersister.NotFoundException {
		Patient patientData = getPatientById(id);
		
//		if(patientData != null) {
			patientData.setFirstName(patient.getLastName());
			patientData.setLastName(patient.getLastName());
			patientData.setGender(patient.getGender());
			patientData.setDob(patient.getDob());
			patientData.setEmail(patient.getEmail());
			patientData.setPhoneNumber(patient.getPhoneNumber());
			patientData.setAddress1(patient.getAddress1());
			patientData.setAddress2(patient.getAddress2());
			patientData.setCity(patient.getCity());
			patientData.setState(patient.getState());
			patientData.setZip5(patient.getZip5());
			patientData.setZip4(patient.getZip4());
			patientData.setLogin(patient.getLogin());
//		}
		return userRepository.save(patientData);
		
		//Patient patientData = userRepository.findById(id).get();
	}
	
//	public viewClaimByCardId() {
//		
//	}
}
