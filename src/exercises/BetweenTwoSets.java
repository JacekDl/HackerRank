package exercises;

import java.util.ArrayList;
import java.util.List;

//	https://www.hackerrank.com/challenges/between-two-sets/problem
//	class name = name of problem
public class BetweenTwoSets {

	//TODO Jacek naming conventions - at least l1, l2, or list1, list2. a or a tells you nothing.
	private static int getTotal(List<Integer> a, List<Integer> b) {
		int answer = 0;
		
		int aMax = 0;
		
		//TODO Jacek - in Java please always use {...} after if/else/for/... statements, even if there is only one line. Same for all files/occurrences in repository.
		
		//TODO Jacek - what will happen (conversion Integer -> int), if a or b contains null and you iterate like for(int i : a)? (not the case in this exercise, but general note)
		for(int i : a) if(i > aMax) aMax = i;
			
		int bMin = 100;
		for(int i : b) if(i < bMin) bMin = i;
		
		for(int i = aMax; i <= bMin; i++) {
			boolean isFactor = true;
			for(int j : a) {
				if(i % j != 0) isFactor = false;
			}
			for(int k : b) {
				if(k % i != 0) isFactor = false;
			}
			if(isFactor) answer++;
		}
		return answer;
	} 
	
	public static void main(String[] args) {
		
		//TODO Jacek - another useful library to use: Google Guava
		// using it, you can e.g. initialize list in singe line like
		// Lists<Integer> = Lists.newArrayList(3,4) - add .jar or like in Maven/Gradle project
		List<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		List<Integer> b = new ArrayList<Integer>();
		b.add(24);
		b.add(48);
		
		int total = getTotal(a, b);
		System.out.println(total);
		
	}
}
