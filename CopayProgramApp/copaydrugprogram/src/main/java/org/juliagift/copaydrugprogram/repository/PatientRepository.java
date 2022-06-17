package org.juliagift.copaydrugprogram.repository;

import java.util.List;

import org.juliagift.copaydrugprogram.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
	
//	@Query(value = "SELECT * FROM User u Join Login l ON u.login_id = l.login_id WHERE email = :email", nativeQuery = true)
//	Patient findByEmail(@Param("email") String email);
	
//	@Query(value = "FROM Patient p Join Login l ON p.login_id = l.login_id WHERE l.email = :email")
//	public Patient findAllByEmail(@Param("email") String email);
	
	@Query(value = "SELECT p.* FROM Patient p JOIN Login l ON p.login_id = l.login_id WHERE l.email = :email",  nativeQuery = true)
	Patient findByEmail(String email);
}
