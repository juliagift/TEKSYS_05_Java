package org.juliagift.copaydrugprogram.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = Zip4Validator.class)
@Documented
public @interface Zip4 {
	
	String message() default "{org.juliagift.copaydrugprogram.validator.Zip4.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
