package com.example.employeeapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		Employee e1 = new Employee();
		e1.setName("John Doe");
		e1.setRoll("Dev");
		
		Employee e2 = new Employee();
		e2.setName("Jane Doe");
		e2.setRoll("Manager");
		
		return args -> {
			log.info("Preloading " + repository.save(e1));
			log.info("Preloading " + repository.save(e2));
		};
		
	}

}
