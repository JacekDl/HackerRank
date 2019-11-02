package exercises;

import java.util.ArrayList;
import java.util.List;

//
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
		//b.add(96);
		
		int total = getTotal(a, b);
		System.out.println(total);
		
		/*List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(6);
		List<Integer> b = new ArrayList<Integer>();
		a.add(24);
		a.add(36);
		int[] a = new int[] {1,2,4};//{2,4};
		int[] b = new int[] {16,32,64,96};//{16,32,96};
		
		int i = a[a.length-1];
	
		List<Integer> possibleFact = new ArrayList<Integer>();
		//int[] possibleFact = new int[10];
		//int m = 0;
		
		while(i <= b[0]) {
			boolean isFactor = true;
			for(int j = 0; j < a.length; j++) {
				if(i % a[j] != 0) isFactor = false;
			}
			if(isFactor) {
				possibleFact.add(i);
				//possibleFact[m] = i;
				//m++;
			}
			i++;
		}
		//for(int k = 0; k < m; k++) System.out.print(possibleFact[k] + " ");
		for(int k : possibleFact) System.out.print(k + " ");
		System.out.println();
		
		int answer = 0;
		for(int p : possibleFact) {
			boolean isFactor = true;
			for(int r = 0; r < b.length; r++) {
				if (b[r] % p != 0) isFactor = false;
			}
			if(isFactor) answer++;
		}
		
		System.out.println(answer);*/
		
		
	}

	

}
