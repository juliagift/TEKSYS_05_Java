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

import org.juliagift.copaycard.dto.UserDTO;

@Entity
@Table (name = "patient")
public class Patient extends UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id", unique = true, nullable = false)
	private int patientId;
	
	@Column(name = "first_name", unique = false, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", unique = false, nullable = false)
	private String lastName;
	
	@Column(name = "gender", unique = false, nullable = false)
	private char gender;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dob", unique = false, nullable = false)
	private Date dob;
	
	@Column(name = "email", unique = false, nullable = false)
	private String email;
	
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
	
	@OneToOne(targetEntity = Login.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "login_id")
	private int loginId;

	public Patient() {
		
	}

	public Patient(int patientId, String firstName, String lastName, char gender, Date dob, String email,
			String phoneNumber, String address1, String address2, String city, String state, int zip5, int zip4,
			int loginId) {
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip5 = zip5;
		this.zip4 = zip4;
		this.loginId = loginId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	
	
}
