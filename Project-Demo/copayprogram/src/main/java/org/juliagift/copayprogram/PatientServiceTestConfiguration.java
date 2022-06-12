package org.juliagift.copayprogram;

import org.juliagift.copayprogram.service.PatientServiceImpl;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class PatientServiceTestConfiguration {
	
	@Bean
	@Primary
	public PatientServiceImpl patientServiceImpl() {
		return Mockito.mock(PatientServiceImpl.class);
		
	}
	
}
