package org.juliagift.copaydrugprogram.dto;

import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.juliagift.copaydrugprogram.model.Drug;
import org.juliagift.copaydrugprogram.validation.FieldMatch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@FieldMatch.List({
		@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
		@FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match") })
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRegistrationDto {

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;
	
//	@NotEmpty
//	private Date dob;
	
//	@NotEmpty
	private String gender;
	
	@NotEmpty
	private String phoneNumber;
	
	@NotEmpty
	private String address1;
	
	private String address2;
	
	@NotEmpty
	private String city;
	
	@NotEmpty
	private String state;
	
	@NotNull
	private Integer zip5;
	
	private Integer zip4;
	
	@Email
	@NotEmpty
	private String email;

	@Email
	@NotEmpty
	private String confirmEmail;

	@NotEmpty
	private String password;

	@NotEmpty
	private String confirmPassword;
	
//	@NotEmpty
//	private Drug drug;

	@AssertTrue
	private Boolean terms;

}
