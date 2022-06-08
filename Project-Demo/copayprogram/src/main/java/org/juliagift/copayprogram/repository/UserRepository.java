package org.juliagift.copayprogram.repository;

import org.juliagift.copayprogram.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Patient, Long> {

}
