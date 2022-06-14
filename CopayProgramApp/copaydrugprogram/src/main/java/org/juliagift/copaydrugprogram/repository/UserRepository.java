package org.juliagift.copaydrugprogram.repository;

import org.juliagift.copaydrugprogram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
//	@Query(value = "SELECT * FROM User u Join Login l ON u.login_id = l.login_id WHERE email = :email", nativeQuery = true)
//	User findByEmail(@Param("email") String email);
	
//	User findByEmail(String email);
}
