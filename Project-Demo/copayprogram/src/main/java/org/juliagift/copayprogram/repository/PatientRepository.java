package org.juliagift.copayprogram.repository;

import org.juliagift.copayprogram.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	
	//List<Patient> findPatientByDrug(Drug drug);
	
	//List<Patient> findPatientByState(String state);
}
