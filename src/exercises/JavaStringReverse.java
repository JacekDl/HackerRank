package exercises;

//https://www.hackerrank.com/challenges/java-string-reverse/problem
public class JavaStringReverse {

	public static void main(String[] args) {
		String stringToCheck = "kobylamamalybok";
		
		String isPalindrome = "Yes";
		for(int i = 0; i < stringToCheck.length() / 2; i++) {
			if(stringToCheck.charAt(i) != stringToCheck.charAt(stringToCheck.length() - 1 - i)) {
				isPalindrome = "No";
			}
		}
		System.out.println(isPalindrome);
	}
	
}
