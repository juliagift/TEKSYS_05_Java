package org.juliagift.copayprogram;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.juliagift.copayprogram.entity.Login;
import org.juliagift.copayprogram.entity.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //test executed against database
@Rollback(false)
public class PatientRepositoryTests {
	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Test
//	public void testRegisterNewPatient() {
//		Patient patient = new Patient();
//		patient.setFirstName("Poppy");
//		patient.setLastName("Johnson");
//		patient.setGender('F');
//		patient.setDob(1999/02/02);
//		patient.setEmail("pjohnson@hotmail.com");
//		patient.setPhoneNumber("12348585805");
//		patient.setAddress1("2334 E St. John's Rd");
//		patient.setAddress2(null);
//		patient.setCity("MA");
//		patient.setState("Boston");
//		patient.setZip5(75757);
//		patient.setZip4(null);
//		patient.setLogin(7);
//		
//		Patient savedPatient = userRepository.save(patient);
//		
//		assertNotNull(savedPatient);
//		
//		assertTrue(savedPatient.getPatientId()).isGreaterThan(0);
//	}
//	
//	@Test
//	public void testGetAllPatients() {
//		Iterable<Patient> patients = userRepository.findAll();
//		
//		Assertions.assertThat(patients).hasSizeGreaterThan(0);
//	}

}
