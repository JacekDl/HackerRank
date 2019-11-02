package exercises;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker{
	public static void main(String[] args){
		
		String pattern = "([A-Z])(.+)";
		//Write your code
		try {
			Pattern pat = Pattern.compile(pattern);
			System.out.println("Valid");
		}
		catch(PatternSyntaxException exc) {
			System.out.println("Invalid");
		}
	}
}
