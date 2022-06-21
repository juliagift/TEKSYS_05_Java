package org.juliagift.copaydrugprogram.service;

import org.juliagift.copaydrugprogram.dto.UserRegistrationDto;
import org.juliagift.copaydrugprogram.model.Card;
import org.juliagift.copaydrugprogram.model.User;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User findUserByEmail(String email);
	User registerUser(UserRegistrationDto userDto);
//	Card findCardByEmail(String email);
//	UserCard getUserCard(String email, Long id);
//	Card findCardByUserId(Long id);

}
