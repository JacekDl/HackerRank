package exercises;

import java.util.*;



class Printer <T> {
	
	public void printArray(T[] obj) {
		for(T value : obj) System.out.println(value);
	}
}

//https://www.hackerrank.com/challenges/java-generics/problem
public class Generics {
    
    public static void main(String args[]){
    	Integer[] intArray = {1,2,3,4,5};
    	String[] stringArray = {"abc", "def", "ghi"};
    	
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}

