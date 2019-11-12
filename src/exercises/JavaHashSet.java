package exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://www.hackerrank.com/challenges/java-hashset/problem
public class JavaHashSet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfPairs = scan.nextInt();
		String[] pair_left = new String[numberOfPairs];
		String[] pair_right = new String[numberOfPairs];

		for (int i = 0; i < numberOfPairs; i++) {
			pair_left[i] = scan.next();
			pair_right[i] = scan.next();
		}

		scan.close();
		//TODO Jacek initialize with interface --> DONE Hashset changed to Set
		Set<String> mySet = new HashSet<String>();	
		for(int i = 0; i < numberOfPairs; i++) {
			String name = pair_left[i] + " " + pair_right[i];		//concatenate strings
			mySet.add(name);										//add newly created string to hashset, 
			System.out.println(mySet.size());						//print no. of elements currently hold in hashset
		}


	}
}
