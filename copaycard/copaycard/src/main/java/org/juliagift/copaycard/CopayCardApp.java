package org.juliagift.copaycard;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CopayCardApp {

	public static void main(String[] args) {
		
		CopayCardApp copayCard = new CopayCardApp();
		
		copayCard.createTable();
	}
	
	public void createTable() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		
		t.commit();
		
		System.out.println("Successfully created tables!");
		
		factory.close();
		session.close();
	}

}
