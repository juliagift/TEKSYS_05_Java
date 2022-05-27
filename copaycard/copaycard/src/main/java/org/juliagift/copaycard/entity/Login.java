package org.juliagift.copaycard.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "login")
public class Login implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_id", unique = true, nullable = false)
	private int patientId;
	
	@Column(name = "username", unique = false, nullable = false)
	private String username;
	
	@Column(name = "password", unique = false, nullable = false)
	private String password;

	public Login() {
		
	}

	public Login(int patientId, String username, String password) {
		this.patientId = patientId;
		this.username = username;
		this.password = password;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
