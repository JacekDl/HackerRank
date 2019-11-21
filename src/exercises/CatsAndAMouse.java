package exercises;

import java.io.IOException;
import java.util.Scanner;

public class CatsAndAMouse {

    static String catAndMouse(int catAPos, int catBPos, int mouseCPos) {
		String answer = null;
		int aC = Math.abs(catAPos - mouseCPos);
		int aB = Math.abs(catBPos - mouseCPos);
		
		if(aC < aB) {
			answer = "Cat A";
		}else if (aC > aB){
			answer = "Cat B";
		}else {
			answer = "Mouse C";
		}
		return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	int numberOfQueries = scanner.nextInt();
    	while(numberOfQueries-- > 0) {
    		int catA = scanner.nextInt();
    		int catB = scanner.nextInt();
    		int mouseC = scanner.nextInt();
    		System.out.println(catAndMouse(catA, catB, mouseC));
    	}

        scanner.close();
    }
}

