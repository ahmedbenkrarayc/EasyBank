package main.utils;

import java.time.LocalDate;
import java.util.Scanner;

public class InputHelper {
	
	public static float readFloat(String inputName) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			try {
				System.out.println("Enter "+inputName+" : ");
				float value = scan.nextFloat();
				ValidationUtils.isPositiveNumber(value, inputName);
				return value;
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				scan.close();
			}
		}
	}
	
	public static LocalDate readDate() {
		while(true) {
			Scanner scan = new Scanner(System.in);
			try {
				System.out.println("Enter operation date dd/mm/yyyy : ");
				String date = scan.nextLine();
				ValidationUtils.isDateFormatValid(date);
				return DateUtils.parseDate(date);
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				scan.close();
			}
		}
	}
	
	public static String readString(String inputName) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			try {
				System.out.println("Enter "+inputName+" : ");
				String value = scan.nextLine();
				ValidationUtils.requiredString(value, 3, inputName);
				return value;
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				scan.close();
			}
		}
	}
	
}
