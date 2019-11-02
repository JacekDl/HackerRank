package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sorting {

	public static void main(String[] args) {
		int[] a = {3,2,1};
		int n = a.length;
		int numSwaps = 0;
		int extra;
		
        // Write Your Code Here
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    extra = a[j+1];
                    a[j+1] = a[j];
                    a[j] = extra;
                    //swap(a[j], a[j + 1]);
                    numberOfSwaps++;
                    numSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.print("First Element: " + a[0]);
        System.out.println();
        System.out.print("Last Element: " + a[n-1]);
    }   
}
