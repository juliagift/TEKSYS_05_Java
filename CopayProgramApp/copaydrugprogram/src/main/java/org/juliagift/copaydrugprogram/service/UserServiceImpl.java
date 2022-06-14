package org.juliagift.copaydrugprogram.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.juliagift.copaydrugprogram.dto.UserRegistrationDto;
import org.juliagift.copaydrugprogram.model.Login;
import org.juliagift.copaydrugprogram.model.Role;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public User findByEmail(String email) {
//		return userRepository.findByEmail(email);
		return null;
	}

	public User save(UserRegistrationDto registration) {
		User user = new User();
		user.setFirstName(registration.getFirstName());
		user.setLastName(registration.getLastName());
//		user.setDob(registration.getDob());
		user.setGender(registration.getGender());
		user.setPhoneNumber(registration.getPhoneNumber());
		user.setAddress1(registration.getAddress1());
		user.setAddress2(registration.getAddress2());
		user.setCity(registration.getCity());
		user.setState(registration.getState());
		user.setZip5(registration.getZip5());
		user.setZip4(registration.getZip4());
		
		Login login = new Login(registration.getEmail(), passwordEncoder.encode(registration.getPassword()));
		user.setLogin(login);
//		user.setLogin().setEmail(registration.getEmail());
//		user.getLogin().setPassword(passwordEncoder.encode(registration.getPassword()));
		user.setRoles(Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
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
//			throw new UsernameNotFoundException("Invalid username or password.");
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
