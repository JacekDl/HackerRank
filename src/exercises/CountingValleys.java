package exercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    /*static int countingValleys(int numberOfSteps, String steps) {
		int answer = 0;
		int[] level = new int[numberOfSteps];
		int currentLevel = 0;
		for(int i = 0; i < numberOfSteps; i++) {
			if(steps.charAt(i) == 'U') {
				currentLevel++;
			}else if(steps.charAt(i) == 'D') {
				currentLevel--;
			}
			level[i] = currentLevel;
		}
		for(int i = 0; i < level.length; i++) {
			System.out.print(level[i] + " ");
		}
    	return answer;


    }*/
    
    static int countingValleys(int numberOfSteps, String steps) {
		int answer = 0;
		int previousLevel = 0;
		int currentLevel = 0;
		for(int i = 0; i < numberOfSteps; i++) {
			if(steps.charAt(i) == 'U') {
				currentLevel++;
			}else {
				currentLevel--;
			}
			if(currentLevel < 0 && previousLevel == 0) {
				answer++;
			}
			previousLevel = currentLevel;
		}
    	return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int numberOfSteps = scanner.nextInt();
        String steps = scanner.next();
        
        System.out.println(countingValleys(numberOfSteps, steps));
    }
}

