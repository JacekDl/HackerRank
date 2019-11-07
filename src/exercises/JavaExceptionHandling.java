package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
public class JavaExceptionHandling { 

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
   
    	int x = 0;
    	int y = 0;

    	try {
    		x = sc.nextInt();
    		y = sc.nextInt();
    		sc.close();
    		
    		if(x < 0 || y < 0) throw new InputMismatchException();
    		if(y == 0) throw new ArithmeticException("/ by zero");
    		System.out.println(x / y);
    	}
    	
    	catch(InputMismatchException e) {
    		System.out.println(e.getClass().getName());	//gets name of the class (here: the name of exception error)
    	}
    	
    	catch(ArithmeticException e) {
    		System.out.println(e);
    	}
    	
    	
    }
}

