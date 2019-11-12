package exercises;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
public class PatternSyntaxChecker{
	public static void main(String[] args){
		
		String pattern = "([A-Z])(.+)";
		try {
			@SuppressWarnings("unused")
			Pattern pat = Pattern.compile(pattern);
			System.out.println("Valid");
		}
		catch(PatternSyntaxException exc) {
			System.out.println("Invalid");
		}
	}
}
