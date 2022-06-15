package org.juliagift.copaydrugprogram.validator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BirthDateValidator implements ConstraintValidator<BirthDate, Date> {
	
	@Override
	public void initialize(BirthDate constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(Date valueToValidate, ConstraintValidatorContext context) {
		 Calendar dateInCalendar = Calendar.getInstance();
		    dateInCalendar.setTime(valueToValidate);
		    
		    

		    return Calendar.getInstance().get(Calendar.YEAR) - dateInCalendar.get(Calendar.YEAR) >= 18;
		    
//		//Date Now
//		 Calendar currentDate = Calendar.getInstance();
//		 currentDate.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
//		 
//		 //Date of Birth
//		 Calendar dateInCalendar = Calendar.getInstance();
//		 dateInCalendar.setTimeInMillis(valueToValidate.getTime());
//		 
//		 //age = current date - date of birth
		 
		
		
	}

}
