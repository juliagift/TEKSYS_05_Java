package org.juliagift.copaydrugprogram.repository;

import org.juliagift.copaydrugprogram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
//	@Query(value = "SELECT * FROM User u Join Login l ON u.login_id = l.login_id WHERE email = :email", nativeQuery = true)
//	Patient findByEmail(@Param("email") String email);
	
//	@Query(value = "FROM Patient p Join Login l ON p.login_id = l.login_id WHERE l.email = :email")
//	public Patient findAllByEmail(@Param("email") String email);
	
	@Query(value = "SELECT u.* FROM User u JOIN Login l ON u.login_id = l.login_id WHERE l.email = :email",  nativeQuery = true)
	User findUserByEmail(String email);
	
	
}
