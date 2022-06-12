package org.juliagift.copayprogram.service;

import java.util.List;

import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.exception.PatientNotFoundException;

public interface PatientService {
	List<Patient> getAllPatients();
	void savePatient(Patient patient);
	Patient getPatientById(Long id) throws PatientNotFoundException;
//	Patient updatePatient(Long id, Patient patient) throws PatientNotFoundException;
	void deletePatientById(Long id) throws PatientNotFoundException; 
	
	
}
