package org.juliagift.copaydrugprogram.service;

import org.juliagift.copaydrugprogram.dto.UserRegistrationDto;
import org.juliagift.copaydrugprogram.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User findByEmail(String email);
	User registerUser(UserRegistrationDto userDto);
	

}
