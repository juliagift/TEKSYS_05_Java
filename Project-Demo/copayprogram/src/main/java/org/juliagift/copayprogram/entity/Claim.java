package org.juliagift.copayprogram.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "claim")
public class Claim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "claim_id")
	private Long claimId;
	
	@NotNull
	@Column(name = "status")
	private String status;
	
	@NotNull
	@Column(name = "drug_cost_at_claim")
	private Double drugCostAtClaim;
	
	@NotNull
	@Column(name = "patient_payment")
	private Double patientPayment;
	
	@NotNull
	@Column(name = "manufacturer_payment")
	private Double manufacturerPayment;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "transaction_date")
	private Date transactionDate;
	
	@OneToOne
	@JoinColumn(name = "card_id")
	private Card card;
	
	@OneToOne
	@JoinColumn(name = "pharmacy_id")
	private Pharmacy pharmacy;
	
	@OneToOne
	@JoinColumn(name = "drug_id")
	private Drug drug;
	
	//	@OneToOne(targetEntity = Card.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "card_id")
//	private Long cardId;
	
//	@OneToOne(targetEntity = Pharmacy.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "pharmacy_id")
//	private Long pharmacyId;	
	
	//	@OneToOne(targetEntity = Drug.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "drug_id")
//	private Long drugId;

	public Long getClaimId() {
		return claimId;
	}

	public void setClaimId(Long claimId) {
		this.claimId = claimId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getDrugCostAtClaim() {
		return drugCostAtClaim;
	}

	public void setDrugCostAtClaim(Double drugCostAtClaim) {
		this.drugCostAtClaim = drugCostAtClaim;
	}

	public Double getPatientPayment() {
		return patientPayment;
	}

	public void setPatientPayment(Double patientPayment) {
		this.patientPayment = patientPayment;
	}

	public Double getManufacturerPayment() {
		return manufacturerPayment;
	}

	public void setManufacturerPayment(Double manufacturerPayment) {
		this.manufacturerPayment = manufacturerPayment;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Pharmacy getPharmacy() {
		return pharmacy;
	}

	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", status=" + status + ", drugCostAtClaim=" + drugCostAtClaim
				+ ", patientPayment=" + patientPayment + ", manufacturerPayment=" + manufacturerPayment
				+ ", transactionDate=" + transactionDate + ", card=" + card + ", pharmacy=" + pharmacy + ", drug="
				+ drug + "]";
	}



	

	
	
	
}
