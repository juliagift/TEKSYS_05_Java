package org.juliagift.copaycard.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.juliagift.copaycard.dao.ClaimDAO;
import org.juliagift.copaycard.entity.Card;
import org.juliagift.copaycard.entity.Claim;
import org.juliagift.copaycard.entity.Patient;
import org.juliagift.copaycard.exception.CustomException;


public class ClaimDAOImpl implements ClaimDAO {

	@Override
	public List<Claim> getAllClaims() throws CustomException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the claims.
		String hql = "FROM Claim";
		Query query = session.createQuery(hql);
		List<Claim> claims = query.getResultList();
		return claims;
	}

	@Override
	public List<Claim> getClaimsByCardId(Card card) throws CustomException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Get all the claims for a given card id.
		String hql = "FROM Claim where card_id = :c";
		Query query = session.createQuery(hql);
		query.setParameter("c", card.getCardId());
		List<Claim> claims = query.getResultList();
		return claims;
	}

	@Override
	public Boolean submitClaim(Patient patient) throws CustomException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteClaim(Patient patient) throws CustomException {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
