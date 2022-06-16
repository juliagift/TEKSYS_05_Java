package org.juliagift.copaydrugprogram.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Zip4Validator implements ConstraintValidator<Zip4, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(value == null) {
			return true;
		}
		
		if(value.trim().equals("")) {
			return true;
		}
		
		if(value.matches("\\d{4}")) {
			return true;
		}
		 return false;
	}

}
