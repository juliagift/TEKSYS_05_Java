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
@Table (name = "drug")
public class Drug {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "drug_id")
	private Long drugId;
	
	@NotNull
//	@Column(name = "name")
	private String name;
	
	@NotNull
//	@Column(name = "cost", unique = false)
	private Double cost;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manufacturer_id")
	private Manufacturer manufacturer;

//	@OneToMany
//	private List<Claim> claim;

	public Long getDrugId() {
		return drugId;
	}

	public void setDrugId(Long drugId) {
		this.drugId = drugId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Drug [drugId=" + drugId + ", name=" + name + ", cost=" + cost + ", manufacturer=" + manufacturer + "]";
	}


	

	

}
