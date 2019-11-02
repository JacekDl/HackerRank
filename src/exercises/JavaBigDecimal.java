package exercises;

import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for(int i = 0; i < n ; i++){
            s[i] = sc.next();
        }
      	sc.close();

      	for(int i = 0; i < n; i++){
            System.out.print(s[i] + " ");
        }
      	System.out.println();
      	
        //Write your code here
      	
      	
	    for(int k = 0; k < n - 1; k++) {
	      	boolean sorted = true;
	      	for(int i = 0; i < n - 1 - k; i++) {
	      		BigDecimal current = new BigDecimal(s[i]);
	      		BigDecimal next = new BigDecimal(s[i+1]);
	      		String extra;
	      		if(current.compareTo(next) 	< 0) {
	      			sorted = false;
	      			extra = s[i];
	      			s[i] = s[i+1];
	      			s[i+1] = extra;
	      		}
	      	}
	      	
	      	System.out.print("Loop nr " + (k+1) + ": ");
	      	for(int i = 0; i < n; i++){
	      		System.out.print(s[i] + " ");
	        }
	      	System.out.println();
	      	if(sorted == true) break;
	    }
      	
        //Output
        for(int i = 0; i < n; i++){
            System.out.print(s[i] + " ");
        }
    }
}
