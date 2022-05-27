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
@Table (name = "drug")
public class Drug implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "drug_id", unique = true, nullable = false)
	private int drugId;
	
	@Column(name = "name", unique = false, nullable = false)
	private String name;
	
	@Column(name = "cost", unique = false, nullable = false)
	private double cost;
	
	@OneToOne(targetEntity = Manufacturer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "manufacturer_id")
	private int manufacturerId;

	public Drug() {
		
	}

	public Drug(int drugId, String name, double cost, int manufacturerId) {
		this.drugId = drugId;
		this.name = name;
		this.cost = cost;
		this.manufacturerId = manufacturerId;
	}

	public int getDrugId() {
		return drugId;
	}

	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	
	
}
