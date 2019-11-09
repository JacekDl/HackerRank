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
    	
    	//TODO Jacek read/think about
    	//1. Catching exceptions like catch(Exc1 | Exc2 | Exc3 e){}
    	//2. How looks the hierarchy of exceptions, starting from Throwable
    	//3. Why, if catching multiple kinds of exceptions, you should
    	// put more specific ones before more general ones? 
    	//4. Why just catch(Exception e) or catch(Throwable t) is generally bad idea?
    	//5. Why some exceptions you need to explicitly catch, and others not (e.g. NullPointerException/IndexOutOfBoundException)
    	
    	catch(InputMismatchException e) {
    		System.out.println(e.getClass().getName());	//gets name of the class (here: the name of exception error)
    	}
    	
    	catch(ArithmeticException e) {
    		System.out.println(e);
    	}
    }
}

