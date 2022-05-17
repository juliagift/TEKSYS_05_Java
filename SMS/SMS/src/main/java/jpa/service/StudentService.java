package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.entitymodels.StudentCourse;

public class StudentService implements StudentDAO {	

	@Override
	public List<Student> getAllStudents() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the students.
		String hql = "FROM Student";
		Query query = session.createQuery(hql);
		List<Student> students = query.getResultList();
		
		return students;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	
		// Get the student corresponding to this email.
		String hql = "FROM Student WHERE email = :e";
		Query query = session.createQuery(hql);
		query.setParameter("e", sEmail);
		
		if (query.getResultList().size() == 0) {
			return null;
		}
		Student student = (Student) query.getResultList().get(0);
		
		return student;
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get the student with this email and password.
		String hql = "FROM Student WHERE email = :e AND password = :p";
		Query query = session.createQuery(hql);
		query.setParameter("e", sEmail);
		query.setParameter("p", sPassword);
		
		if(query.getResultList().size() == 0) {
			return false;
		}
		return true;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// First, check if the student is already registered for this course.
		String hql = "FROM StudentCourse WHERE Student_email = :e AND sCourses_id = :i";
		Query query = session.createQuery(hql);
		query.setParameter("e", sEmail);
		query.setParameter("i", cId);
		
		// If the student is NOT registered for a course,
		// go ahead and add this email and course ID to StudentCourse.
		if (query.getResultList().size() == 0) {
			Transaction t = session.beginTransaction(); 

			StudentCourse studentCourse = new StudentCourse();
			studentCourse.setsEmail(sEmail);
			studentCourse.setcId(cId);
			
			session.save(studentCourse);
			t.commit();
			
			System.out.println("You have successfully registered for course ID " + cId + "!");
		} else {
			System.out.println("You are already registered in that course!");
		}
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		List<Course> courses = new ArrayList<Course>();
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get the list of who is registered to which courses.
		String hql = "FROM StudentCourse WHERE Student_email = :e";
		Query query = session.createQuery(hql);
		query.setParameter("e", sEmail);
		
		List<StudentCourse> studentCourse = query.getResultList();
		
		// For every course we retrieved from StudentCourse,
		// create a Course object with that course ID,
		// and add it to a list of courses.
		for(StudentCourse sc : studentCourse) {
			courses.add(new Course(sc.getcId()));
		}
		
		
		
		// For every course in our list of courses, 
		// query the database to find out the course name and instructor.
		for (Course c : courses) {
			hql = "FROM Course WHERE id = :i";
			query = session.createQuery(hql);
			query.setParameter("i", c.getcId());
			
			List<Course> courseList = query.getResultList();
			
			// Update our list of courses with the course name and instructor name.
			for (Course cl: courseList) {
				c.setcName(cl.getcName());
				c.setcInstructorName(cl.getcInstructorName());
			}
		}

		return courses;
	}
}
