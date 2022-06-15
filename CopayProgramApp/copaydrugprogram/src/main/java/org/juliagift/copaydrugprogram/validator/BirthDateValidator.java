package org.juliagift.copaydrugprogram.validator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BirthDateValidator implements ConstraintValidator<BirthDate, Date> {

	
	public boolean isValidDob(final Date value) {
		Calendar dateInCalendar = Calendar.getInstance();
		dateInCalendar.setTime(value);

			
		return Calendar.getInstance().get(Calendar.YEAR) - dateInCalendar.get(Calendar.YEAR) >= 18;
	}

//	@Override
//	public void initialize(final BirthDate constraintAnnotation) {
//
//	}
//
//	
//	public boolean isValidDob(final Date value) {
//		
//
//		
//		Calendar dateInCalendar = Calendar.getInstance();
//		dateInCalendar.setTime(value);
//
//			
//		return Calendar.getInstance().get(Calendar.YEAR) - dateInCalendar.get(Calendar.YEAR) >= 18;
//
////		//Date Now
////		 Calendar currentDate = Calendar.getInstance();
////		 currentDate.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
////		 
////		 //Date of Birth
////		 Calendar dateInCalendar = Calendar.getInstance();
////		 dateInCalendar.setTimeInMillis(valueToValidate.getTime());
////		 
////		 //age = current date - date of birth
//
//	}
//
//
	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
