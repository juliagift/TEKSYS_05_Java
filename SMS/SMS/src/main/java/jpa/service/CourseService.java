package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class CourseService implements CourseDAO {

	@Override
	public List<Course> getAllCourses() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the courses.
		String hql = "FROM Course";
		Query query = session.createQuery(hql);
		List<Course> courses = query.getResultList();
		
		return courses;
	}

	public Course getCourseById(int cId) {		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get the course corresponding to this course ID.
		String hql = "FROM Course WHERE id = :i";
		Query query = session.createQuery(hql);
		query.setParameter("i", cId);

		if (query.getResultList().size() == 0) {
			return null;
		}
		Course course = (Course) query.getResultList().get(0);
		
		return course;
	}
}
