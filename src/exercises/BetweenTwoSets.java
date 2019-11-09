package exercises;

import java.util.ArrayList;
import java.util.List;

//	https://www.hackerrank.com/challenges/between-two-sets/problem
//	class name = name of problem
public class BetweenTwoSets {

	//TODO Jacek naming conventions - at least l1, l2, or list1, list2. a or a tells you nothing. --> DONE
	private static int getTotal(List<Integer> listA, List<Integer> listB) {
		int answer = 0;
		int listAMax = 0;
		
		//TODO Jacek - in Java please always use {...} after if/else/for/... statements, even if there is only one line. Same for all files/occurrences in repository.
		
		//TODO Jacek - what will happen (conversion Integer -> int), if a or b contains null and you iterate like for(int i : a)? (not the case in this exercise, but general note)
		for(int i : listA) {
			if(i > listAMax) {
				listAMax = i;
			}
		}
			
		int listBMin = 100;
		for(int i : listB) {
			if(i < listBMin) {
				listBMin = i;
			}
		}
		
		for(int i = listAMax; i <= listBMin; i++) {
			boolean isFactor = true;
			for(int j : listA) {
				if(i % j != 0) isFactor = false;
			}
			for(int k : listB) {
				if(k % i != 0) isFactor = false;
			}
			if(isFactor) {
				answer++;
			}
		}
		return answer;
	} 
	
	public static void main(String[] args) {
		
		//TODO Jacek - another useful library to use: Google Guava
		// using it, you can e.g. initialize list in singe line like
		// Lists<Integer> = Lists.newArrayList(3,4) - add .jar or like in Maven/Gradle project
		List<Integer> listA = new ArrayList<Integer>();
		listA.add(3);
		listA.add(4);
		List<Integer> listB = new ArrayList<Integer>();
		listB.add(24);
		listB.add(48);
		
		int total = getTotal(listA, listB);
		System.out.println(total);
		
	}
}
