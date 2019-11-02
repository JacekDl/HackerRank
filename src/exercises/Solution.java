package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static String findDay(int month, int day, int year) {
		String answer = "NOTHING";
		LocalDate myDate = LocalDate.of(year, month, day);
		DayOfWeek number = myDate.getDayOfWeek();
		int myDay = number.getValue();
		
		switch(myDay) {
			case(1): answer = "MONDAY";
				break;
			case(2): answer = "TUESDAY";
				break;
			case(3): answer = "WEDNESDAY";
				break;
			case(4): answer = "THURSDAY";
				break;
			case(5): answer = "FRIDAY";
				break;
			case(6): answer = "SATURDAY";
				break;
			case(7): answer = "SUNDAY";
				break;
		}
		
		//Calendar cal = new Calendar.Builder().setDate(year, month, day).build();
		//System.out.println("year: " + cal.get(Calendar.YEAR));
		//System.out.println("month: " + cal.get(Calendar.MONTH));
		//System.out.println("day: " + cal.get(Calendar.DAY_OF_MONTH)); //System.out.println(date.get(Calendar.DATE));
		//System.out.println("day of week: " + cal.get(Calendar.DAY_OF_WEEK));
		//System.out.println("day of year: " + cal.get(Calendar.DAY_OF_YEAR));
		//System.out.println("day of week in month: " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //number of week starting from day 1 in month
		//System.out.println("month: " + cal.get(Calendar.MONTH));
		//System.out.println();
		
		return answer;
	}
	
	public static void main(String[] args) {
		int year = 2015;
		int month = 8;
		int day = 5;		//Wednsday	
		
		findDay(month, day, year);
		System.out.println(findDay(month, day, year));
		
		//String nameOfDay = findDay(month, day, year);
		//System.out.print(nameOfDay);
		
		//Calendar cal = new Calendar.Builder().setDate(year, month, day).build();
		
		
		/*LocalDate date = LocalDate.of(year, month, day);
		String answer = date.getDayOfWeek().toString();
		//String answer = obj.toString();
		//System.out.println(date.getDayOfWeek());
		System.out.println(answer);*/
		
	}//end of main

}//end of class



