package org.juliagift.copayprogram.packageA;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.exception.PatientNotFoundException;
import org.juliagift.copayprogram.repository.PatientRepository;
import org.juliagift.copayprogram.service.PatientServiceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

//@ExtendWith(MockitoExtension.class)
//annotations at class level to indicate that this is a test class and to instruct JUnit to execute all test cases on the same test instance it creates.
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PatientServiceTest {
	
	//@Mock
	@Autowired
	PatientRepository patientRepository;
	
//	@InjectMocks
//	auto wire thePatient67hghfhService class into the test class. Use before all and after all annotations to create and delete the data needed to run the test cases.
	PatientServiceImpl patientServiceImpl;
	
	private Patient patient;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test data set up is completed");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("All tests are completed");
	}

	@BeforeEach
	public void setUp() throws Exception {
		patientRepository = Mockito.mock(PatientRepository.class);
		patientServiceImpl = new PatientServiceImpl(patientRepository);
		System.out.println("Before each is executed");
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("After each is executed");
	}

	@DisplayName("JUnit test for getPatientById method")
	@Test
	public void testGetPatientId() {
		//given
		//given(patientRepository.findById(1L)).willReturn(Optional.of(patient));
		
		//when
		//Patient savedPatient = patientService.getPatientById(patient.getPatientId());
		
		//then
		//assertThat(savedPatient).isNotNull();
		
		//Patient p = patientService.getPatientById(1L);
		//System.out.println(p);
		//System.out.println("here");
		//assertEquals("John", p.getFirstName());
		
//		Patient p = new Patient();
//		p.setPatientId(1L);
//		when(patientRepository.findById(1L)).thenReturn(p);
//		
//		Patient patient = patientService.getPatientById(1L);
//		
//		verify(patientRepository).findById(1L);
//		
//		assertThat(patient.getPatientId(), is(1l));
//		Patient savedPatient = patientService.getPatientById(1L);
		//assertEquals(10, Math.addExact(5, 5));
		//Patient savedPatient = patientService.getPatientById(patient.getPatientId());
		
//		assertThat(savedPatient).isNotNull();
//		assertNotNull(savedPatient);
		
		
		
		//Mockito.when(patientServiceImpl.getPatientById(patient.getPatientId())).thenReturn(patient);
		
		
		
		
		
		
//		Mockito.when(patientRepository.findById(1L)).thenReturn(Optional.of(patient));
//		
//		Patient savedPatient = patientServiceImpl.getPatientById(1L);
//		
//		assertNotNull(savedPatient);
//		
//		assertEquals(Optional.of(patient), savedPatient);
		
		
		
		
		
	}

}
