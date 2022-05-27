package org.juliagift.copaycard.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "card")
public class Card implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id", unique = true, nullable = false)
	private int cardId;
	
	@Column(name = "benefit", unique = false, nullable = false)
	private double benefit;
	
	@OneToOne(targetEntity = Patient.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private int patientId;
	
	@OneToOne(targetEntity = Drug.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "drug_id")
	private int drugId;

	public Card() {
		
	}

	public Card(int cardId, double benefit, int patientId, int drugId) {
		this.cardId = cardId;
		this.benefit = benefit;
		this.patientId = patientId;
		this.drugId = drugId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public double getBenefit() {
		return benefit;
	}

	public void setBenefit(double benefit) {
		this.benefit = benefit;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDrugId() {
		return drugId;
	}

	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	
}
