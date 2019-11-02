package exercises;

import java.util.Scanner;

public class RunningTimeAndComplexicity {
	
	private static String isPrime(int value) {
		 
		double sqrtValue = Math.sqrt(value);
		String answer = "Prime";
		if(value == 1) return answer;
		for(int i = 2; i <= sqrtValue; i++) {
			if(value % i == 0) {
				answer = "Not prime";
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int numberOfTests = sc.nextInt();
		Integer[] intArray = new Integer[numberOfTests];
		for(int i = 0; i < numberOfTests; i ++) {
			intArray[i] = sc.nextInt();
		}
		
		for(int i : intArray) {
			System.out.println(isPrime(i));
		}*/
		System.out.println(isPrime(1));
	}

	

}
