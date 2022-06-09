package org.juliagift.copayprogram.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table (name = "pharmacy")
public class Pharmacy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pharmacy_id")
	private Long pharmacyId;
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@NotNull
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@NotNull
	@Column(name = "city")
	private String city;
	
	@NotNull
	@Column(name = "state")
	private String state;
	
	@NotNull
	@Column(name = "zip5")
	private Integer zip5;
	
	@Column(name = "zip4")
	private Integer zip4;
	
//	@OneToMany
//	private List<Claim> claim;

	public Long getPharmacyId() {
		return pharmacyId;
	}

	public void setPharmacyId(Long pharmacyId) {
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

	public Integer getZip5() {
		return zip5;
	}

	public void setZip5(Integer zip5) {
		this.zip5 = zip5;
	}

	public Integer getZip4() {
		return zip4;
	}

	public void setZip4(Integer zip4) {
		this.zip4 = zip4;
	}

	@Override
	public String toString() {
		return "Pharmacy [pharmacyId=" + pharmacyId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zip5=" + zip5
				+ ", zip4=" + zip4 + "]";
	}


	

	
	
}
