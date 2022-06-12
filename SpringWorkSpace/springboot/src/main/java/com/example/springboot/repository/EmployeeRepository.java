package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Employee;

//This will provide a CRUD database operations for the Employee entity.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
