package org.juliagift.copaycard.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.juliagift.copaycard.dao.ManufacturerDAO;
import org.juliagift.copaycard.entity.Claim;
import org.juliagift.copaycard.entity.Manufacturer;
import org.juliagift.copaycard.exception.CustomException;

public class ManufacturerDAOImpl implements ManufacturerDAO {

	@Override
	public List<Double> getManufacturerPaymentByMonth(Manufacturer manufacturer) throws CustomException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the manufacturer payments for a given manufacturer, by month.
		String hql = "SELECT sum(c.manufacturer_payment) FROM Claim c join Drug d on c.drug_id = d.drug_id where d.manufacturer_id = :m and year(transaction_date) = year(now()) group by month(transaction_date) order by month(transaction_date)";
		Query query = session.createQuery(hql);
		query.setParameter("m", manufacturer.getManufacturerId());
		List<Double> manufacturerPayments = query.getResultList();
		return manufacturerPayments;
	}

	@Override
	public HashMap<String, Double> getManufacturerPaymentByDrug(Manufacturer manufacturer) throws CustomException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the manufacturer payments for a given manufacturer, by drug.
		String hql = "SELECT d.name, sum(c.manufacturer_payment) FROM Claim c join Drug d on c.drug_id = d.drug_id where d.manufacturer_id = :m group by d.name order by d.name";
		Query query = session.createQuery(hql);
		query.setParameter("m", manufacturer.getManufacturerId());
		//List manufacturerPayments = query.getResultList();
		//return manufacturerPayments;
	}

	@Override
	public HashMap<String, Double> getManufacturerPaymentByState(Manufacturer manufacturer) throws CustomException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the manufacturer payments for a given manufacturer, by patient state.
		String hql = "SELECT p.state, sum(c.manufacturer_payment) FROM Claim c join Card c2 on c.card_id = c2.card_id join Patient p on c2.patient_id = p.patient_id where d.manufacturer_id = :m group by p.state order by p.state";
		Query query = session.createQuery(hql);
		query.setParameter("m", manufacturer.getManufacturerId());
		//List manufacturerPayments = query.getResultList();
		//return manufacturerPayments;
	}

	@Override
	public HashMap<String, Double> getManufacturerPaymentByGender(Manufacturer manufacturer) throws CustomException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the manufacturer payments for a given manufacturer, by patient gender.
		String hql = "SELECT p.gender, sum(c.manufacturer_payment) FROM Claim c join Card c2 on c.card_id = c2.card_id join Patient p on c2.patient_id = p.patient_id where d.manufacturer_id = :m group by p.gender order by p.gender";
		Query query = session.createQuery(hql);
		query.setParameter("m", manufacturer.getManufacturerId());
		//List manufacturerPayments = query.getResultList();
		//return manufacturerPayments;

	}

	@Override
	public HashMap<String, Double> getManufacturerPaymentByAgeGroup(Manufacturer manufacturer) throws CustomException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the manufacturer payments for a given manufacturer, by patient gender.
		String hql = "SELECT datediff(now(), p.dob)/365 dt, sum(c.manufacturer_payment) FROM Claim c join Card c2 on c.card_id = c2.card_id join Patient p on c2.patient_id = p.patient_id where d.manufacturer_id = :m group by dt order by dt";
		Query query = session.createQuery(hql);
		query.setParameter("m", manufacturer.getManufacturerId());
		//List manufacturerPayments = query.getResultList();
		//return manufacturerPayments;

	}

	

}
