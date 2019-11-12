package exercises;

//https://www.hackerrank.com/challenges/linkedin-practice-bitwise-and/problem
public class BitwiseAND {

	public static void main(String[] args) {
		
		int sizeOfSet = 2;
		int givenInteger = 2;
		int numberToInsert = 1;
		int[] mySet = new int[sizeOfSet];
		
		for(int i = 0; i < sizeOfSet; i++) {
			mySet[i] = numberToInsert++;	
		}
		
		int max = 0;
		for(int i = 0; i < sizeOfSet-1; i++) {
			for(int j = i + 1; j < sizeOfSet; j++) {
				int calc = mySet[i] & mySet[j];
				if(calc > max && calc < givenInteger) max = calc;
			}
		}
		System.out.println(max);
	}
}
