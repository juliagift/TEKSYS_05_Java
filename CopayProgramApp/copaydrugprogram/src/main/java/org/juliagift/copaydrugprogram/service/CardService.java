package org.juliagift.copaydrugprogram.service;

import org.juliagift.copaydrugprogram.model.Card;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface CardService {
	
	Card findCardByEmail(String email) throws NotFoundException;
}
