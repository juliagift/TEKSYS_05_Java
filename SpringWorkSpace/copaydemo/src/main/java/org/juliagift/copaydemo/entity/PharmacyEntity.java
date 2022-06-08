package org.juliagift.copaydemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pharmacy")
public class PharmacyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pharmacyId;
	
	
	private String name;
	private String phoneNumber;
	private String address;
	
	public Integer getPharmacyId() {
		return pharmacyId;
	}
	public void setPharmacyId(Integer pharmacyId) {
		this.pharmacyId = pharmacyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
