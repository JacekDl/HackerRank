package exercises;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
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
		System.out.println(isPrime(1));
	}

	

}
