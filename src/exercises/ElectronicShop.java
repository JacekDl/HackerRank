package exercises;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectronicShop {

    
    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
		int answer = -1;
    	for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				int sum = keyboards[i] + drives[j];
				if(sum <= budget && sum > answer) {
					answer = sum;
				}
			}
		}
    	return answer;
    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	try {
    		int budget = scanner.nextInt();
    		int keyboardInShop = scanner.nextInt();
    		int drivesInShop = scanner.nextInt();
    		if(keyboardInShop <= 0 || drivesInShop <= 0) {
    			throw new NegativeArraySizeException("Number of item must be greater than zero.");
    		}
    	
    		int[] keyboards = new int[keyboardInShop];
    		int[] drives = new int[drivesInShop];
    	
    		for (int i = 0; i < keyboards.length; i++) {
    			keyboards[i] = scanner.nextInt();
    			if(keyboards[i] <= 0) {
    				throw new InputMismatchException();
    			}
    		}
    	
    		for (int i = 0; i < drives.length; i++) {
    			drives[i] = scanner.nextInt();
    			if(drives[i] <= 0) {
    				throw new InputMismatchException();
    			}
    		}
    		int moneySpend = getMoneySpent(keyboards, drives, budget);
    		System.out.println(moneySpend);
    	}
    	catch(NegativeArraySizeException exc) {
			System.out.println(exc.getMessage());
		}
    	catch(InputMismatchException exc){
    		System.out.println("Wrong input");
    	}
        scanner.close();
    }

	
}

