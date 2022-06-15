package org.juliagift.copaydrugprogram.service;

import org.juliagift.copaydrugprogram.dto.PatientRegistrationDto;
import org.juliagift.copaydrugprogram.model.Login;
import org.juliagift.copaydrugprogram.model.Patient;
import org.juliagift.copaydrugprogram.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PatientImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public Patient findByEmail(String email) {
//		return patientRepository.findByEmail(email);
		return null;
	}

	public Patient save(PatientRegistrationDto registration) {
		Patient patient = new Patient();
		patient.setFirstName(registration.getFirstName());
		patient.setLastName(registration.getLastName());		
		patient.setDob(registration.getDob());
		patient.setGender(registration.getGender());
		patient.setPhoneNumber(registration.getPhoneNumber());
		patient.setAddress1(registration.getAddress1());
		patient.setAddress2(registration.getAddress2());
		patient.setCity(registration.getCity());
		patient.setState(registration.getState());
		patient.setZip5(registration.getZip5());
		patient.setZip4(registration.getZip4());
		
		Login login = new Login(registration.getEmail(), passwordEncoder.encode(registration.getPassword()));
		patient.setLogin(login);
		
		//Drug drug = new Drug(registration.getDrug(), 500.00);
//		patient.setDrugId(registration.getDrugId());
//		
//		System.out.println(drug);
		System.out.println("I am here in the service");
		System.out.println(patient);
		
		
//		user.setRoles(Arrays.asList(new Role("ROLE_USER")));
		
//		user.setRoles(Arrays.asList(new Role("Patient")));
//		user.setRoles(Arrays.asList(new Role("Manufacturer")));
		
		return patientRepository.save(patient);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//		User user = userRepository.findByEmail(email);
//		if (user == null) {
//			throw new UsernameNotFoundException("Invalid email or password.");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getLogin().getEmail(), user.getLogin().getPassword(),
//				mapRolesToAuthorities(user.getRoles()));
//	}
//
//	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
//		return roles.stream()
//				.map(role -> new SimpleGrantedAuthority(role.getName()))
//				.collect(Collectors.toList());
//	}

}
