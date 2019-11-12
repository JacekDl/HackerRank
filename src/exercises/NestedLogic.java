package exercises;

//https://www.hackerrank.com/challenges/linkedin-practice-nested-logic/problem
public class NestedLogic {

	public static void main(String[] args) {
		int currentDay = 9;
		int currentMonth = 6;
		int currentYear = 2015;
		int expectedDay = 6;
		int expectedMonth = 6;
		int expectedYear = 2015;
		
		int fine = 0;
		
		//compare years
		if(currentYear < expectedYear) {
			fine = 0;
		}
		else if (currentYear > expectedYear) {
			fine = 10000;
		}
		else {
			//compare months
			if(currentMonth < expectedMonth) {
				fine = 0;
			}
			else if (currentMonth > expectedMonth) {
				fine = (currentMonth - expectedMonth)*500;
			}
			else {
				//compare days
				if(currentDay <= expectedDay) {
					fine = 0;
				}
				else {
					fine = (currentDay - expectedDay) * 15; 
				}
			}
		}
		
		System.out.println(fine);
	}
}
