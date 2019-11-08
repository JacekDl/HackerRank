package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.math.*;
import java.util.regex.*;

//not sure about the name of the problem
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
		return answer;
	}
	
	public static void main(String[] args) {
		int year = 2015;
		int month = 8;
		int day = 5;		//Wednsday	
		
		findDay(month, day, year);
		System.out.println(findDay(month, day, year));
	}
}



