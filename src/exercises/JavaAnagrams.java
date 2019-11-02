package exercises;

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
		
		//for(int k : alphabet) System.out.print(k + " ");
		
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
	
	/*private static int indexNumber(char i) {
		int answer = -1;
		switch(i) {
			case 'a': answer = 0;
				break;
			case 'b': answer = 1;
				break;
			case 'c': answer = 2;
				break;
			case 'd': answer = 3;
				break;
			case 'e': answer = 4;
				break;
			case 'f': answer = 5;
				break;
			case 'g': answer = 6;
				break;
			case 'h': answer = 7;
				break;
			case 'i': answer = 8;
				break;
			case 'j': answer = 9;
				break;
			case 'k': answer = 10;
				break;
			case 'l': answer = 11;
				break;
			case 'm': answer = 12;
				break;
			case 'n': answer = 13;
				break;
			case 'o': answer = 14;
				break;
			case 'p': answer = 15;
				break;
			case 'q': answer = 16;
				break;
			case 'r': answer = 17;
				break;
			case 's': answer = 18;
				break;
			case 't': answer = 19;
				break;
			case 'u': answer = 20;
				break;
			case 'v': answer = 21;
				break;
			case 'w': answer = 22;
				break;
			case 'x': answer = 23;
				break;
			case 'y': answer = 24;
				break;
			case 'z': answer = 25;
				break;
		}
		return answer;
		
	}*/

	public static void main(String[] args) {
		String a = "anagram";
		String b = "margana";
		
		boolean anagram = isAnagram(a, b);
		if(anagram) System.out.println("Anagram");
		else System.out.println("Not Anagram");
		
		/*LinkedList<Character> list = new LinkedList<>();
		
		char[] aList = a.toCharArray();
		char[] bList = b.toCharArray();
		
		for(char current : aList) list.add(current);
		for(char current : bList) {
			if(list.removeFirstOccurrence(current) == false) break;
		}
		
		if(list.isEmpty()) System.out.println("Anagrams");
		else System.out.println("Not Anagrams");*/
	}

}
