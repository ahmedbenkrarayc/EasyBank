package main.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	public final static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date, DATE_FORMAT);
	}
	
	public static String formatDate(LocalDate date) {
		return date.format(DATE_FORMAT);
	}
}
