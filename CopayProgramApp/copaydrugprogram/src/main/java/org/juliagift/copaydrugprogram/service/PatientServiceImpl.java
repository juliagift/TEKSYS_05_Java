package org.juliagift.copaydrugprogram.service;

import org.juliagift.copaydrugprogram.dto.PatientRegistrationDto;
import org.juliagift.copaydrugprogram.exception.PatientAlreadyExistsException;
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


//this class is used by spring controller to authenticate and authorize user
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public Patient findByEmail(String email) {
		
		Patient patient = patientRepository.findByEmail(email);
		return patient;
		
	}
	
	

	public Patient registerPatient(PatientRegistrationDto patientDto) throws PatientAlreadyExistsException {
		
		Patient existingPatient = patientRepository.findByEmail(patientDto.getEmail());
		
		if(existingPatient == null) {
			throw new PatientAlreadyExistsException("There is an account with that email address: "
		              + patientDto.getEmail());
		}
		
		Patient patient = new Patient();
		patient.setFirstName(patientDto.getFirstName());
		patient.setLastName(patientDto.getLastName());
		patient.setDob(patientDto.getDob());
		patient.setGender(patientDto.getGender());
		patient.setPhoneNumber(patientDto.getPhoneNumber());
		patient.setAddress1(patientDto.getAddress1());
		patient.setAddress2(patientDto.getAddress2());
		patient.setCity(patientDto.getCity());
		patient.setState(patientDto.getState());
		patient.setZip5(patientDto.getZip5());
		patient.setZip4(patientDto.getZip4());

		Login login = new Login(patientDto.getEmail(), passwordEncoder.encode(patientDto.getPassword()));
		patient.setLogin(login);

		// Drug drug = new Drug(registration.getDrug(), 500.00);
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

	
//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//		Patient patient = patientRepository.findByEmail(email);
//		return null;
//	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	// this class is used by spring controller to authenticate and authorize patient

//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//		Patient patient = patientRepository.findByEmail(email);
//		if (patient == null) {
//			throw new UsernameNotFoundException("Invalid email or password.");
//		}
////		return new org.springframework.security.core.userdetails.User(patient.getLogin().getEmail(), patient.getLogin().getPassword(),
////				mapRolesToAuthorities(user.getRoles()));
//		
////		return new org.springframework.security.core.userdetails.User(patient.getLogin().getEmail(), patient.getLogin().getPassword(),
////				mapRolesToAuthorities(patient.getRoles()));
//		
//		return new org.springframework.security.core.userdetails.
	//}

//	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
//		return roles.stream()
//				.map(role -> new SimpleGrantedAuthority(role.getName()))
//				.collect(Collectors.toList());
//	}

}
