package exercises;

import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {

    
    static int pageCount(int bookLength, int page) {
        int numberOfTwoPages = bookLength/2 + 1; //using division: 6/2+1 = 7/2+1 = 4 !!!
    	int stepsFromFront = 0;
        
    	for(int i = 1; i <= bookLength; i++) {
    		if(i % 2 == 0) {
    			stepsFromFront++;
    		}
    		if(i == page) {
    			break;
    		}
    	}
    	
    	int stepsFromBack = numberOfTwoPages - stepsFromFront - 1;
    
    	if(stepsFromFront < stepsFromBack) {
    		return stepsFromFront;
    	}else {
    		return stepsFromBack;
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int bookLength = scanner.nextInt();
        int page = scanner.nextInt();
        
        System.out.println(pageCount(bookLength, page));
    	
    	/*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}

