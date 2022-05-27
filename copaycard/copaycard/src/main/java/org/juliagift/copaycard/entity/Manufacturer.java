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

import org.juliagift.copaycard.dto.UserDTO;

@Entity
@Table (name = "manufacturer")
public class Manufacturer extends UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manufacturer_id", unique = true, nullable = false)
	private int manufacturerId;
	
	@Column(name = "name", unique = false, nullable = false)
	private String name;
	
	@OneToOne(targetEntity = Login.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "login_id")
	private int loginId;

	public Manufacturer() {
		
	}

	public Manufacturer(int manufacturerId, String name, int loginId) {
		this.manufacturerId = manufacturerId;
		this.name = name;
		this.loginId = loginId;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	
	
}
