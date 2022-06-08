package com.example.studentapp;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentapp.controller.StudentController;
import com.example.studentapp.entity.StudentEntity;
import com.example.studentapp.service.StudentView;

//@SpringBootApplication
public class StudentappApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(StudentappApplication.class, args);
		
		StudentEntity model =  retrieveStudent();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		//first call
		controller.updateView();
		
		//update model
		controller.setStudentName("Bob");
		controller.setRollNo("20");
		
		//second call
		controller.updateView();
	}
	
	private static StudentEntity retrieveStudent() {
		StudentEntity student = new StudentEntity();
		student.setName("Robert");
		student.setRollNo("15");
		
		return student;
	}

}
