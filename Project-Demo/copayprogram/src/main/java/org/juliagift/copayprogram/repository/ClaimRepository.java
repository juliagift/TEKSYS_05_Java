package org.juliagift.copayprogram.repository;

import org.juliagift.copayprogram.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long>{

}
