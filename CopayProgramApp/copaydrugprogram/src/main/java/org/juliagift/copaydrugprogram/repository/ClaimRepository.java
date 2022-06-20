package org.juliagift.copaydrugprogram.repository;

import org.juliagift.copaydrugprogram.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long>{

}
