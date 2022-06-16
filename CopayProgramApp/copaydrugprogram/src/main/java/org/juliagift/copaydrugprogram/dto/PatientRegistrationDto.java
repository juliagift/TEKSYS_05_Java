package org.juliagift.copaydrugprogram.dto;

import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.validation.constraints.Size;

import org.juliagift.copaydrugprogram.validator.Address2;
import org.juliagift.copaydrugprogram.validator.BirthDate;
import org.juliagift.copaydrugprogram.validator.FieldMatch;
import org.juliagift.copaydrugprogram.validator.Zip4;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@FieldMatch.List({
		@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
		@FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match") })
//@BirthDate(message = "You must be 18 years or older")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PatientRegistrationDto {

	@NotEmpty(message = "First name is required.")
	@Size(min = 2, max = 15, message = "First name must be between 2 and 10 characters.")
	//@Pattern(regex = )
	private String firstName;

	@NotEmpty(message = "Last name is required.")
	@Size(min = 2, max = 15, message = "Last name must be between 2 and 10 characters.")
	private String lastName;
	
	//custom validation
	@NotNull(message = "DOB is required.")
	@Past(message = "Date of Birth must be in the past.")
	@BirthDate(message = "You must be 18 years or older. You cannot enroll in this copay program.")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	private String gender;
	
	@NotEmpty
	@Pattern(regexp = "\\d{10}", message = "phone number format 1234567890")  
	private String phoneNumber;
	
	@NotEmpty(message = "Address is required.")
	//alphanumeric with space and dot
	@Pattern(regexp = "^[a-zA-Z0-9 .]+$", message = "Invalid! Address can be an alphanumeric with either space and/or dot.")
	private String address1;
	
	@Address2(message = "Invalid! Address can be an alphanumeric with either space and/or dot.")
	private String address2;
	
	@NotEmpty(message = "City is required.")
	@Pattern(regexp = "[a-zA-Z]+", message = "Only letters of the alphabet allowed.")  
	private String city;
	
	@NotEmpty(message = "State is required.")
	private String state;
	
	@NotNull
	//@Pattern(regexp = "^\\d{1,5}$", flags = { Flag.CASE_INSENSITIVE, Flag.MULTILINE }, message = "The Zip code is invalid.")
	@Pattern(regexp = "\\d{5}", message = "Invalid! Enter a 5-digit zip code.")
	private String zip5;
	
	@Zip4(message = "Invalid! 4-digit zip code or no input allowed.")
	private String zip4;
	
	@Email
	private String email;

	@Email
	@NotEmpty
	private String confirmEmail;

	@NotEmpty
	private String password;

	@NotEmpty
	private String confirmPassword;

	@AssertTrue
	private Boolean terms;

}
