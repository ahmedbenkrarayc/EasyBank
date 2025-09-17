package main.tests;

import main.utils.DateUtils;

public class DateUtilsTest {
	public static void all() {
		String date = "27/10/2001";
		
		System.out.println(DateUtils.parseDate(date));
		System.out.println(DateUtils.formatDate(DateUtils.parseDate(date)));
	}
}
