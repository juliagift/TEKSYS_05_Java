package org.juliagift.copaydrugprogram.repository;

import org.juliagift.copaydrugprogram.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
	
	@Query(value = "SELECT * FROM Card WHERE user_id = :id", nativeQuery = true)
	Card findCardByUserId(Long id);

}
