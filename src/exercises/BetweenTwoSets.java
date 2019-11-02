package exercises;

import java.util.ArrayList;
import java.util.List;

//	https://www.hackerrank.com/challenges/between-two-sets/problem
//	class name = name of problem
public class BetweenTwoSets {

	private static int getTotal(List<Integer> a, List<Integer> b) {
		int answer = 0;
		
		int aMax = 0;
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
