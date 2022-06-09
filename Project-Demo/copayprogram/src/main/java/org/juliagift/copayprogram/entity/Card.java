package org.juliagift.copayprogram.entity;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "card")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	private Long cardId;
	
	@NotNull
	private Double benefit;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "drug_id")

	private Drug drug;

//	@OneToMany
//	@JoinColumn(name = "claim_id")
//	private List<Claim> claim;

	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public Double getBenefit() {
		return benefit;
	}

	public void setBenefit(Double benefit) {
		this.benefit = benefit;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", benefit=" + benefit + ", patient=" + patient + ", drug=" + drug + "]";
	}



	


	
	
	
}
