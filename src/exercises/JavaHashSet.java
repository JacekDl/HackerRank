package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/java-hashset/problem
public class JavaHashSet {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //TODO Jacek initialize with interface
        HashSet<String> mySet = new HashSet<String>();	
        for(int i = 0; i < t; i++) {
        	String name = pair_left[i] + " " + pair_right[i];		//concatenate strings
        	mySet.add(name);										//add newly created string to hashset
        	System.out.println(mySet.size());						//print no. of elements currently hold in hashset
        }
        
        
   }
}
