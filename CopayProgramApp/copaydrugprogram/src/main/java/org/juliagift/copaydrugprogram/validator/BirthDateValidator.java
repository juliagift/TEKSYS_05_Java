package org.juliagift.copaydrugprogram.validator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BirthDateValidator implements ConstraintValidator<BirthDate, Date> {

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		Calendar dateInCalendar = Calendar.getInstance();
		dateInCalendar.setTime(value);

			
		return Calendar.getInstance().get(Calendar.YEAR) - dateInCalendar.get(Calendar.YEAR) >= 18;
	}

}
