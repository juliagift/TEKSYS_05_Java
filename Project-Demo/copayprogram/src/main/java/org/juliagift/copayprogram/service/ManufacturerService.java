package org.juliagift.copayprogram.service;

import java.util.ArrayList;
import java.util.List;

import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerService {
	
	@Autowired
	private UserRepository userRepository;

	public List<Patient> getAllPatients() {
		//create a new patients list and iterate over the result of the findAll from the userRepository which is an iterable of all the patients in the db
		//and for each of them, populate patients list with that element
		List<Patient> patients = new ArrayList<>();  
		userRepository.findAll().forEach(patients::add);   //for each of the elements in the iterable, call the add method on the patients and pass that element(method reference)
		return patients;
		//the framework sees the embedded mariadb db in the classpath and assumes that to be the db to connect to. no connection information necessary
	}
	
	

}
