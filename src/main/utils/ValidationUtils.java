package main.utils;

import java.time.format.DateTimeParseException;

public class ValidationUtils {
	public static final String CODE_REGEX = "^CPT\\-[0-9]{5}$";
	
	public static Boolean isAccountCodeValid(String code) throws IllegalArgumentException {
		if(code.matches(CODE_REGEX))
			return true;
		
		throw new IllegalArgumentException("Account code must start with CPT-XXXXX and followed by 5 digitls (X) !");
	}
	
	public static Boolean isPositiveNumber(float number, String fieldName) throws IllegalArgumentException {
		if(number >= 0)
			return true;
		
		throw new IllegalArgumentException(fieldName+" must be greater than or equals to zero !");
	}
	
	public static Boolean isDateFormatValid(String date) {
		try {			
			DateUtils.parseDate(date);
			return true;
		}catch(DateTimeParseException e) {
			return false;
		}
	}
	
	public static Boolean requiredString(String value, int minSize, String fieldName) throws IllegalArgumentException {
		if(value == null || value.trim().isEmpty()) {
			throw new IllegalArgumentException(fieldName+" is required !");
		}
		
		if(value.trim().length() < minSize) {
			throw new IllegalArgumentException(fieldName+" is required !");
		}
		
		return true;
	}
}
