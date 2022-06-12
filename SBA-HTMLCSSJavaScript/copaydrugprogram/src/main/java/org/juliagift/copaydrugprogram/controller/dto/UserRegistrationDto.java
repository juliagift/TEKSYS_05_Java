package org.juliagift.copaydrugprogram.controller.dto;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.juliagift.copaydrugprogram.model.Login;
import org.juliagift.copaydrugprogram.model.Role;

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

	@NotEmpty
	private String password;

	@NotEmpty
	private String confirmPassword;

	@Email
	@NotEmpty
	private String email;

	@Email
	@NotEmpty
	private String confirmEmail;

	@AssertTrue
	private Boolean terms;

}
