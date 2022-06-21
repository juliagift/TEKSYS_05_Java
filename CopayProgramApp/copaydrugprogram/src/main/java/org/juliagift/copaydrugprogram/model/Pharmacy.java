package org.juliagift.copaydrugprogram.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String name;
	
	@NotNull
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@NotNull
	private String address1;
	
	private String address2;
	
	@NotNull
	private String city;
	
	@NotNull
	private String state;
	
	@NotNull
	private Integer zip5;
	
	private Integer zip4;

	public Pharmacy(@NotNull String name, @NotNull String phoneNumber, @NotNull String address1, String address2,
			@NotNull String city, @NotNull String state, @NotNull Integer zip5, Integer zip4) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip5 = zip5;
		this.zip4 = zip4;
	}

//	public Pharmacy(String name) {
//		this.name = name;
//	}
//	
	
	
	
}
