package jpa.mainrunner;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;


public class SMSRunner {
	private Scanner scanner;
	private StringBuilder stringBuilder;

	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;

	public SMSRunner() {
		scanner = new Scanner(System.in);
		stringBuilder = new StringBuilder();
		courseService = new CourseService();
		studentService = new StudentService();
	}

	public static void main(String[] args) {
		SMSRunner sms = new SMSRunner();
		sms.mainMenu();	
	}

	// This is the main menu of the application.
	private void mainMenu() {
		int choice = 0;
		
		do {
			stringBuilder.append("\n1. Student Login\n2. Quit Application\nPlease enter 1 or 2: ");
			System.out.print(stringBuilder.toString());
			stringBuilder.delete(0, stringBuilder.length());

			try {
				choice = scanner.nextInt();
			} catch (NumberFormatException nfe) {
				System.out.println("Integer value not entered. Exiting application.");
				break;
			} catch (InputMismatchException ime) {
				System.out.println("Integer value not entered. Exiting application.");
				break;
			} catch (Exception e) {
				System.out.println("Unknown error. Exiting application.");
				break;
			}
			
			switch (choice) {
			case 1:
				// If the login is successful, move on to the registration menu.
				if (studentLogin()) {
					registrationMenu();
				}
				break;
			case 2:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid menu option! Please try again.");
			}
		} while (choice != 2);
	}

	// This returns true if the student login was successful, and false otherwise.
	private boolean studentLogin() {
		boolean isSuccessfulLogin = false;
		String email = null;
		String password = null;
		
		// Prompt user for credentials.
		try {
			System.out.print("Enter your email address: ");
			email = scanner.next();
			System.out.print("Enter your password: ");
			password = scanner.next();
		} catch (Exception e) {
			System.out.println("Unknown error. Exiting application.");
		}
		
		// Get the Student object associated with this email address.
		Student student = studentService.getStudentByEmail(email);
		
		if (student != null) {
			currentStudent = student;
		}

		// If credentials are valid, print a list of this student's courses.
		if (currentStudent != null & studentService.validateStudent(email, password)) {
			System.out.println("My Classes");
			printCourses(studentService.getStudentCourses(email));
			isSuccessfulLogin = true;
		} else {
			System.out.println("Wrong Credentials");
		}
		return isSuccessfulLogin;
	}
	
	// This prints a formatted list of the details of the given courses.
	private void printCourses(List<Course> courses) {
		if (courses == null || courses.size() == 0) {
			System.out.println("NOT CURRENTLY REGISTERED FOR ANY COURSES.");
		} else {
			System.out.format("%-5s %-30s %-20s\n", "#", "COURSE NAME", "INSTRUCTOR NAME");
	
			for (Course course : courses) {
				System.out.println(course);
			}
		}
	}

	// This is the registration menu. A student can register for a new course here.
	private void registrationMenu() {	
		int choice = 0;
		int cId = 0;
		
		do {
			stringBuilder.append("\n1. Register a class\n2. Logout\nPlease Enter 1 or 2: ");
			System.out.print(stringBuilder.toString());
			stringBuilder.delete(0, stringBuilder.length());
				
			try {
				choice = scanner.nextInt();
			} catch (NumberFormatException nfe) {
				System.out.println("Integer value not entered. Exiting application.");
				break;
			} catch (InputMismatchException ime) {
				System.out.println("Integer value not entered. Exiting application.");
				break;
			} catch (Exception e) {
				System.out.println("Unknown error. Exiting application.");
				break;
			}
			
			switch (choice) {
			
			case 1:
				String email = currentStudent.getsEmail();
				
				// Get a list of ALL the courses available.
				List<Course> allCourses = courseService.getAllCourses();
				
				// Get a list of the courses for which this student is currently registered.
				List<Course> studentCourses = studentService.getStudentCourses(email);
				
				// Remove the student's courses from the list of all courses, 
				// since they cannot register for a course they are already registered for.
				allCourses.removeAll(studentCourses);
	
				System.out.println("All Courses:");
				printCourses(allCourses);
				System.out.println();
				System.out.print("Enter Course Number: ");
				
				try {
					cId = scanner.nextInt();
				} catch (NumberFormatException nfe) {
					System.out.println("Integer value not entered. Exiting application.");
					break;
				} catch (InputMismatchException ime) {
					System.out.println("Integer value not entered. Exiting application.");
					break;
				} catch (Exception e) {
					System.out.println("Unknown error. Exiting application.");
					break;
				}
				
				Course newCourse = courseService.getCourseById(cId);
	
				// Register the student to the chosen course,
				// and then print the new list of registered coursed.
				if (newCourse != null) {
					studentService.registerStudentToCourse(email, cId);
					System.out.println("My Classes:");
					printCourses(studentService.getStudentCourses(email));
				}
				break;

			case 2:
				System.out.println("Goodbye " + currentStudent.getsName() + "! You have been signed out.");
				break;
				
			default:
				System.out.println("Invalid menu option! Please try again.");				
				}
		} while (choice == 1);
		
	}

	// This is used to create the Student, Course, and StudentCourse tables in the database.
	// It is not called as part of the regular running of this application.
	// For initialization purposes only.
	public void createTable() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Student student = new Student();
		Course course = new Course();
		
		t.commit();
		
		System.out.println("Successfully created tables!");
		
		factory.close();
		session.close();
	}
}
