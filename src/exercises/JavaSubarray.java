package exercises;

import java.util.Scanner;

public class JavaSubarray {

	//private static final Scanner scanner = new Scanner(System.in);
	
	private static int sumSubarray(int[] arr, int i, int j) {
		int sum = 0;
		for(int s = i; s <= j; s++) {
			sum += arr[s];
		}
		return sum;
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	/*int n = scanner.nextInt();
    	scanner.nextLine();
    	int[] myArray = new int[n];
    	for(int i = 0; i < n; i++) {
    		myArray[i] = scanner.nextInt();
    	}
    	scanner.close();*/
    	
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