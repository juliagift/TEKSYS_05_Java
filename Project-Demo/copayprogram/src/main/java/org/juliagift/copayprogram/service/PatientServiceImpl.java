package org.juliagift.copayprogram.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.exception.PatientNotFoundException;
import org.juliagift.copayprogram.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{
	
//	
	private PatientRepository patientRepository;
	
	@Autowired
	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	public List<Patient> getAllPatients() {
		//create a new patients list and iterate over the result of the findAll from the userRepository which is an iterable of all the patients in the db
		//and for each of them, populate patients list with that element
		List<Patient> patients = new ArrayList<>();  
		patientRepository.findAll().forEach(patients::add);   //for each of the elements in the iterable, call the add method on the patients and pass that element(method reference)
		return patients;
		//the framework sees the embedded mariadb db in the classpath and assumes that to be the db to connect to. no connection information necessary
	}
	
	public void savePatient(Patient patient) {
		patientRepository.save(patient);
	}

	public Patient getPatientById(Long id) throws PatientNotFoundException {
		Optional<Patient> optional = patientRepository.findById(id);
		
		Patient patient = null;
		
		if(optional.isPresent()) {
			patient = optional.get();
		} else {
			throw new PatientNotFoundException("Patient not found with id: " + id);
		}
		
		return patient;
		
	}
	
	
//	public Patient updatePatient(Long id, Patient patient) throws PatientNotFoundException {
//		Patient patientData = patientRepository.findById(id).get();
//		
//		if(patientData != null) {
//			patientData.setFirstName(patient.getLastName());
//			patientData.setLastName(patient.getLastName());
//			patientData.setGender(patient.getGender());
//			patientData.setDob(patient.getDob());
//			patientData.setEmail(patient.getEmail());
//			patientData.setPhoneNumber(patient.getPhoneNumber());
//			patientData.setAddress1(patient.getAddress1());
//			patientData.setAddress2(patient.getAddress2());
//			patientData.setCity(patient.getCity());
//			patientData.setState(patient.getState());
//			patientData.setZip5(patient.getZip5());
//			patientData.setZip4(patient.getZip4());
//			patientData.setLogin(patient.getLogin());
//			
//			return patientRepository.save(patientData);
//		} else {
//			throw new PatientNotFoundException("Patient not found with id:: " + id);
//		}
//		
//	}
	
	

	
	public void deletePatientById(Long id) throws PatientNotFoundException {
		Patient patient = patientRepository.findById(id)
				.orElseThrow(() -> new PatientNotFoundException("Invalid patient id : " + id));
		patientRepository.delete(patient);
	}
	
	

	
	//	public Optional<Patient> updatePatient(Long id, Patient patient) {
//		//only update a patient if it can be found first
//		
//		return userRepository.findById(id)
//				.map(oldPatient -> {
//					Patient updatedPatient = oldPatient.updateWith(patient);
//					return userRepository.save(updatedPatient);
//				});
//	}

}
