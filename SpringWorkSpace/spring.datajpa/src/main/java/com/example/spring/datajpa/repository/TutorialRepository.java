package com.example.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.datajpa.entity.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {  // Tutorial → Entity type and Long --> primary key
	
	//  findByPublished is a custom method()
	List<Tutorial> findByPublished(boolean published);

}
