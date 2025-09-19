package main.utils;

import java.time.LocalDate;
import java.util.Scanner;

public class InputHelper {
	
	public static float readFloat(String inputName) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter "+inputName+" : ");
				float value = scan.nextFloat();
				ValidationUtils.isPositiveNumber(value, inputName);
				return value;
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static LocalDate readDate() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter operation date dd/mm/yyyy : ");
				String date = scan.nextLine();
				ValidationUtils.isDateFormatValid(date);
				return DateUtils.parseDate(date);
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("Date isn't valid please respect the requested pattern !");
			}
		}
	}
	
	public static String readString(String inputName) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter "+inputName+" : ");
				String value = scan.nextLine();
				ValidationUtils.requiredString(value, 3, inputName);
				return value;
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static String readType() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Account Type : ");
			String value = scan.nextLine();
			if(value.trim().equalsIgnoreCase("courant") || value.trim().equalsIgnoreCase("epargne")) {					
				return value;
			}else {
				System.out.println("Account Type Must Either be 'courant' or 'epargne' !");
			}
		}
	}
}
