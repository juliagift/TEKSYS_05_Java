package org.juliagift.copaydrugprogram.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.juliagift.copaydrugprogram.dto.UserRegistrationDto;
import org.juliagift.copaydrugprogram.model.Login;
import org.juliagift.copaydrugprogram.model.Role;
import org.juliagift.copaydrugprogram.model.User;
import org.juliagift.copaydrugprogram.repository.RoleRepository;
import org.juliagift.copaydrugprogram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//this class is used by spring controller to authenticate and authorize user
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
//	private User user;
//	
//	@Bean
//	public UserServiceImpl(User user) {
//		this.user = user;
//	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User registerUser(UserRegistrationDto userDto) {

//		User existingUser = userRepository.findByEmail(userDto.getEmail());
		
//		if(existingUser != null) {
//			throw new UserAlreadyExistsException("There is an account with that email address: "
//		              + userDto.getEmail());
//		}

		Role existingRole = roleRepository.findByName("USER");

		User user = new User();
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setDob(userDto.getDob());
		user.setGender(userDto.getGender());
		user.setPhoneNumber(userDto.getPhoneNumber());
		user.setAddress1(userDto.getAddress1());
		user.setAddress2(userDto.getAddress2());
		user.setCity(userDto.getCity());
		user.setState(userDto.getState());
		user.setZip5(userDto.getZip5());
		user.setZip4(userDto.getZip4());

		Login login = new Login(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()));
		user.setLogin(login);

		if (existingRole == null) {
			user.setRoles(Arrays.asList(new Role("USER")));
		} else {
			user.setRoles(Arrays.asList(existingRole));
		}
		
		System.out.println("I am here in the service/register");
		System.out.println(user);

		return userRepository.save(user);
	}


	// this class is used by spring controller to authenticate and authorize user
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);

		System.out.println("I am here in the service/loaduserusername");
		System.out.println(user);
		
		

		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		
//		return new CustomUserDetails(user);
		return new org.springframework.security.core.userdetails.User(user.getLogin().getEmail(),
				user.getLogin().getPassword(), mapRolesToAuthorities(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
	
	

}
