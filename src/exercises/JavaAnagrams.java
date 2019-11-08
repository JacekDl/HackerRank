package exercises;


//https://www.hackerrank.com/challenges/java-anagrams/problem
public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		boolean answer = true;
		if(a.length() != b.length()) return false;
		
		char[] aList = a.toLowerCase().toCharArray();
		char[] bList = b.toLowerCase().toCharArray();
		
		
		int[] alphabet = new int[26];
		for(char i : aList) {
			alphabet[indexNumber(i)]++;
		}
		
		for(char i : bList) {
			alphabet[indexNumber(i)]--;
		}
		
		for(int k : alphabet) {
			if(k != 0) answer = false;
		}
		
		return answer;
	}
	
	private static int indexNumber(char c) {
		int answer = -1;
		char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i = 0; i < abc.length; i++) {
			if(abc[i] == c) {
				answer = i;
				break;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		String a = "anagram";
		String b = "margana";
		
		boolean anagram = isAnagram(a, b);
		if(anagram) System.out.println("Anagram");
		else System.out.println("Not Anagram");
	}
}
