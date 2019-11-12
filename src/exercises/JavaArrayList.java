package exercises;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

//https://www.hackerrank.com/challenges/java-arraylist/problem
public class JavaArrayList {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		
		//TODO Jacek always initialize with interface, whenever possible
		//List<List<Integer>> mrArray = ... --> OK I have tried to do this in this way, but I get message: Cannot convert form List to Arraylist
		//--> OK2 Now it is done properly
		List<List<Integer>> myArray = new ArrayList<List<Integer>>();
		for(int i = 0; i < arrayLength; i++) {
			List<Integer> subArray = new ArrayList<Integer>();
			myArray.add(subArray);
		}
		
		for(int i = 0; i < arrayLength; i++) {
			List<Integer> subArray = myArray.get(i);
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
				List<Integer> subArray = myArray.get(x);
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
