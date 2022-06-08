package com.example.managementproject.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.managementproject.entity.UserEntity;
import com.example.managementproject.entity.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {
	//@Query("Select username from user")
//	List<UserEntity> findByUsername(String username);
//	List<UserEntity> findAllByActiveOrderByIdDesc(boolean active);
//	Optional<UserEntity> findByIdAndActive(Integer id, boolean active);
	
	//findById Or Active
	 List<UserInfo> findAllByActiveOrderByIdDesc(boolean active);

	 Optional<UserInfo> findByIdAndActive(Integer id, boolean active);
}
