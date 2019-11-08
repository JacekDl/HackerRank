package exercises;

import java.util.*;

//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
public class Java1DArray {

    public static void main(String[] args) {
	   
        
        int[] a = new int[5];
        int n = a.length;
        int number = 10;
        for(int i = 0; i < n; i++) {
        	a[i] = number;
        	number += 10;
        }
       

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}