package exercises;

//https://www.hackerrank.com/challenges/java-string-compare/problem
public class JavaSubstringComparison {

	public static void main(String[] args) {
		String stringToCheck = "welcometojava";
		int lengthOfSubstring = 3;
		
		int begin = stringToCheck.length() - lengthOfSubstring;
		System.out.println("begin = " + begin);
		
		String min = stringToCheck.substring(begin);
		String max = min;
		System.out.println(min + " " + max);
		
		begin--;
		int end = stringToCheck.length() - 1;
		System.out.println("end = " + end);
		
		for(int i = begin; i >= 0; i--) {
			String current = stringToCheck.substring(i, end);
			System.out.println(current);
			int ansMin = current.compareTo(min);
			if(ansMin < 0) {
				min = current;
			}
			int ansMax = current.compareTo(max);
			if(ansMax > 0) {
				max = current;
			}
			end--;
		}
		
		System.out.println("MIN: " + min);
		System.out.println("MAX: " + max);
	}
}
