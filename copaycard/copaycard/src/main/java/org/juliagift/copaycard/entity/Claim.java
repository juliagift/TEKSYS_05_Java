package org.juliagift.copaycard.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "claim")
public class Claim implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "claim_id", unique = true, nullable = false)
	private int claimId;
	
	@OneToOne(targetEntity = Card.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "card_id")
	private int cardId;
	
	@OneToOne(targetEntity = Pharmacy.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "pharmacy_id")
	private int pharmacyId;
	
	@OneToOne(targetEntity = Drug.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "drug_id")
	private int drugId;
	
	@Column(name = "status", unique = false, nullable = false)
	private String status;
	
	@Column(name = "drug_cost_at_claim", unique = false, nullable = false)
	private double drugCostAtClaim;
	
	@Column(name = "patient_payment", unique = false, nullable = false)
	private double patientPayment;
	
	@Column(name = "manufacturer_payment", unique = false, nullable = false)
	private double manufacturerPayment;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "transaction_date", unique = false, nullable = false)
	private Date transactionDate;

	public Claim() {
		
	}

	public Claim(int claimId, int cardId, int pharmacyId, int drugId, String status, double drugCostAtClaim,
			double patientPayment, double manufacturerPayment, Date transactionDate) {
		this.claimId = claimId;
		this.cardId = cardId;
		this.pharmacyId = pharmacyId;
		this.drugId = drugId;
		this.status = status;
		this.drugCostAtClaim = drugCostAtClaim;
		this.patientPayment = patientPayment;
		this.manufacturerPayment = manufacturerPayment;
		this.transactionDate = transactionDate;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getPharmacyId() {
		return pharmacyId;
	}

	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

	public int getDrugId() {
		return drugId;
	}

	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getDrugCostAtClaim() {
		return drugCostAtClaim;
	}

	public void setDrugCostAtClaim(double drugCostAtClaim) {
		this.drugCostAtClaim = drugCostAtClaim;
	}

	public double getPatientPayment() {
		return patientPayment;
	}

	public void setPatientPayment(double patientPayment) {
		this.patientPayment = patientPayment;
	}

	public double getManufacturerPayment() {
		return manufacturerPayment;
	}

	public void setManufacturerPayment(double manufacturerPayment) {
		this.manufacturerPayment = manufacturerPayment;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
}
