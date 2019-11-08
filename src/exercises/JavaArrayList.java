package exercises;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

//https://www.hackerrank.com/challenges/java-arraylist/problem
public class JavaArrayList {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> myArray = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < arrayLength; i++) {
			ArrayList<Integer> subArray = new ArrayList<Integer>();
			myArray.add(subArray);
		}
		
		for(int i = 0; i < arrayLength; i++) {
			ArrayList<Integer> subArray = myArray.get(i);
			int subArrayLenght = sc.nextInt();
			
			for(int j = 0; j < subArrayLenght; j++) {
				int value = sc.nextInt();
				subArray.add(value);
			}
		}
		
		int numberOfQueries = sc.nextInt();
		int x;
		int y;
		while(numberOfQueries-- > 0) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			
			try {
				ArrayList<Integer> subArray = myArray.get(x);
				Integer answer = subArray.get(y);
				System.out.println(answer);
			}
			catch(IndexOutOfBoundsException e){
				System.out.println("ERROR!");
			}
		}
		sc.close();
	}
}
