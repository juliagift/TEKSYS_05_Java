package org.juliagift.copayprogram.entity;

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
	
	@OneToOne(targetEntity = Card.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "card_id")
	private Long cardId;
	
	@OneToOne(targetEntity = Pharmacy.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "pharmacy_id")
	private Long pharmacyId;
	
	@OneToOne(targetEntity = Drug.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "drug_id")
	private Long drugId;

}
