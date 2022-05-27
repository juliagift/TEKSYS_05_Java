package org.juliagift.copaycard.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pharmacy")
public class Pharmacy implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pharmacy_id", unique = true, nullable = false)
	private int pharmacyId;
	
	@Column(name = "name", unique = false, nullable = false)
	private String name;
	
	@Column(name = "phone_number", unique = false, nullable = false)
	private String phoneNumber;
	
	@Column(name = "address1", unique = false, nullable = false)
	private String address1;
	
	@Column(name = "address2", unique = false, nullable = true)
	private String address2;
	
	@Column(name = "city", unique = false, nullable = false)
	private String city;
	
	@Column(name = "state", unique = false, nullable = false)
	private String state;
	
	@Column(name = "zip5", unique = false, nullable = false)
	private int zip5;
	
	@Column(name = "zip4", unique = false, nullable = true)
	private int zip4;

	public Pharmacy() {
		
	}

	public Pharmacy(int pharmacyId, String name, String phoneNumber, String address1, String address2, String city,
			String state, int zip5, int zip4) {
		this.pharmacyId = pharmacyId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip5 = zip5;
		this.zip4 = zip4;
	}

	public int getPharmacyId() {
		return pharmacyId;
	}

	public void setPharmacyId(int pharmacyId) {
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip5() {
		return zip5;
	}

	public void setZip5(int zip5) {
		this.zip5 = zip5;
	}

	public int getZip4() {
		return zip4;
	}

	public void setZip4(int zip4) {
		this.zip4 = zip4;
	}

	
}
