package exercises;

import java.util.*;

//https://www.hackerrank.com/challenges/migratory-birds/problem
public class MigratoryBirds {

	 static int migratoryBirds(List<Integer> arr) {
	        int[] types = new int[5];
	        for(int i : arr) {
	        	types[i-1]++;
	        }

	        int max = 0;
	        int answer = 0;
	        for(int j = 0; j < 5; j++){
	            if(types[j] > max){
	                max = types[j];
	                answer = j + 1;
	            }
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		//TODO Jacek - Google Guava jar
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(3);
		arr.add(1);
		arr.add(5);
		arr.add(5);

		System.out.println(migratoryBirds(arr));
	}

}
