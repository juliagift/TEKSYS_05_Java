package com.example.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Object or POJO help create db tables
//@Getter
//@Setter

//@ToString
//@EqualsAndHashCode
//@Data
//@AllArgsConstructor
@Entity
public class StudentEntity {
	//setting fields
	private String rollNo;
	private String name;
	
	//creating getters and setters
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
