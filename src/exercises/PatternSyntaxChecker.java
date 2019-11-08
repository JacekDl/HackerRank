package exercises;

import java.util.Scanner;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
public class PatternSyntaxChecker{
	public static void main(String[] args){
		
		String pattern = "([A-Z])(.+)";
		try {
			Pattern pat = Pattern.compile(pattern);
			System.out.println("Valid");
		}
		catch(PatternSyntaxException exc) {
			System.out.println("Invalid");
		}
	}
}
