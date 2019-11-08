package exercises;

import java.util.Scanner;


//https://www.hackerrank.com/challenges/java-negative-subarray/problem?h_r=internal-search
public class JavaSubarray {

	private static int sumSubarray(int[] arr, int i, int j) {
		int sum = 0;
		for(int s = i; s <= j; s++) {
			sum += arr[s];
		}
		return sum;
	}
	
    public static void main(String[] args) {
    	int[] arr = {1,-2,4,-5,1};
    	int n = arr.length;
    	int numberOfNegativeSubarrays = 0;
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			int answer = sumSubarray(arr, i, j);
    			if(answer < 0) numberOfNegativeSubarrays++;
    		}
    	}
    	System.out.println(numberOfNegativeSubarrays);
    }
}