package org.juliagift.copaydrugprogram.dto;

import org.juliagift.copaydrugprogram.model.Card;
import org.juliagift.copaydrugprogram.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCard {
	
	private User user;
	private Card card;
	
}
