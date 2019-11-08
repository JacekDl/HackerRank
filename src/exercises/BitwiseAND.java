package exercises;

//https://www.hackerrank.com/challenges/linkedin-practice-bitwise-and/problem
public class BitwiseAND {

	public static void main(String[] args) {
		
		int n = 2;
		int k = 2;
		int numberToInsert = 1;
		int[] s = new int[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = numberToInsert++;	
		}
		
		int max = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				int calc = s[i] & s[j];
				if(calc > max && calc < k) max = calc;
			}
		}
		System.out.println(max);
	}

}
