package org.juliagift.copayprogram.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patient")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private Long patientId;

	@NotNull
	@Column(name = "first_name")
	private String firstName;

	@NotNull
	@Column(name = "last_name")
	private String lastName;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;

	@NotNull
	private String gender;

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

	@OneToOne(targetEntity = Login.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "login_id")
	private Login login;

	@OneToOne(targetEntity = Drug.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "drug_id")
	private Login drug;

}
