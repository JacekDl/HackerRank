package exercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int numberOfSocks, int[] socks) {
		int answer = 0;
		Set<Integer> socksTypes = new HashSet<>();
		for(int i = 0; i < numberOfSocks; i++) {
			Integer current =  socks[i];
			if(socksTypes.contains(current)) {
				socksTypes.remove(current);
				answer++;
			}else {
				socksTypes.add(current);
			}
		}
		return answer;
    }


    public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in);
    	int numberOfSocks = sc.nextInt();
    	int[] socks = new int[numberOfSocks];
    	for(int i = 0; i < numberOfSocks; i++) {
    		socks[i] = sc.nextInt();
    	}
    	/*System.out.println("Number of socks: " + numberOfSocks);
    	System.out.println("Array length: " + socks.length);
    	for(int j = 0; j < numberOfSocks; j++) {
    		System.out.print(socks[j] + " ");
    	}
    	System.out.println();*/
    	sc.close();
    	
    	int answer = sockMerchant(numberOfSocks, socks);
    	System.out.println(answer);
    }
}

