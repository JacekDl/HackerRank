package exercises;

import java.io.IOException;
import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    static int beautifulDays(int start, int end, int divisor) {
		int answer = 0;
    	for (int i = start; i <= end; i++) {
			//String iString = Integer.toString(i);
			//String iStringReversed = new StringBuilder(iString).reverse().toString();
			//int iReversed = Integer.parseInt(iStringReversed);
			
			int iReversed = Integer.parseInt(new StringBuilder(Integer.toString(i)).reverse().toString());
			int difference = Math.abs(i-iReversed);
			if(difference % divisor == 0) {
				answer++;
			}
		}
    	return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divisor = scanner.nextInt();
        
        int answer = beautifulDays(start, end, divisor);
        System.out.println(answer);

        scanner.close();
    }
}

