package com.example.studentapp.controller;

import com.example.studentapp.entity.StudentEntity;
import com.example.studentapp.service.StudentView;

public class StudentController {
	
	//using the model and view to update and control the data being passed through
	//in spring these are called dependency injection(DI), injecting these dependencies inside the controller
	//IOC
	private StudentEntity model;
	private StudentView view;
	
	//constructor
	public StudentController(StudentEntity model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	//control getters and setters from the model
	public String getStudentName() {
		return model.getName();
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	
	//use the method from the view to get the updated fields
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());;
	}

	
	
	
	

}
