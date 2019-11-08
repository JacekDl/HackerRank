package exercises;

//https://www.hackerrank.com/challenges/java-string-reverse/problem
public class JavaStringReverse {

	public static void main(String[] args) {
		String A = "kobylamamalybok";
		
		String isPalindrome = "Yes";
		for(int i = 0; i < A.length() / 2; i++) {
			if(A.charAt(i) != A.charAt(A.length() - 1 - i)) isPalindrome = "No";
		}
		System.out.println(isPalindrome);
	}
}
