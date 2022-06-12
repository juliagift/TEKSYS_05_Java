package org.juliagift.copaydrugprogram.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;
	
	@NotNull
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull
	private char gender;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@NotNull
	private String email;
	
	@NotNull
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@NotNull
	private String address1;
	
	private String address2;
	
	@NotNull
	@Column(name = "city")
	private String city;
	
	@NotNull
	private String state;
	
	@NotNull
	private Integer zip5;
	
	private Integer zip4;
	
	@OneToOne(targetEntity = Login.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "login_id")
	private Login login;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
	           name = "users_roles",
	           joinColumns = @JoinColumn(
	                   name = "user_id"),
	           inverseJoinColumns = @JoinColumn(
	                   name = "role_id"))
	private Collection<Role> roles;


	
	
	
	
}
