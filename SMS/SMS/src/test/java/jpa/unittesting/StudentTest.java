package jpa.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jpa.entitymodels.Student;
import jpa.service.StudentService;

public class StudentTest {
	
	StudentService studentService;
	
	@BeforeAll
	public static void setUpBefore() throws Exception {
		System.out.println("Run Before Class");
	}
	
	@BeforeEach
	public void setUp() throws Exception {
		studentService = new StudentService();
		System.out.println("Run Before Each Test Method");
	}
	
	//checks all the data returned by a valid call on getStudentByEmail
	@Test
	public void testGetStudentByEmail() {
		Student s = studentService.getStudentByEmail("cjaulme9@bing.com");
		assertEquals("cjaulme9@bing.com", s.getsEmail());
		assertEquals("Cahra Jaulme", s.getsName());
		assertEquals("FnVklVgC6r6", s.getsPass());
		System.out.println("Testing getStudentByEmail()");
	}
	
	//Checks that all 10 students are returned when getAllStudents is called
	@Test
	public void testGetAllStudents() {
		List<Student> students = studentService.getAllStudents();
		assertEquals(10, students.size());
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Run After Tests");
	}
	
	@AfterAll
	public static void classTearDown() throws Exception {
		System.out.println("Run After the class");
	}

}
