package exercises;

import java.util.*;

// https://www.hackerrank.com/challenges/the-birthday-bar/problem
// class name = name of the problem
public class BirthdayChocolate {

	
	//TODO Jacek - naming of parameters --> DONE
	private static int birthday(List<Integer> chocolateArray, int sumOfSubarrayElem, int subarrayLength) {	//m = lenght of subarray	d = sum of subarray elements
		int answer = 0;
		int begin = 0;
		int end = begin + (subarrayLength - 1);
		
		int sum = 0;
		for(int i = begin; i <= end; i++) {
			sum = sum + chocolateArray.get(i);
		}
		if(sum == sumOfSubarrayElem) answer++;
		begin++;
		end++;
		
		while(end < chocolateArray.size()) {
			sum = sum - chocolateArray.get(begin) + chocolateArray.get(end);
			if(sum == sumOfSubarrayElem) answer++;
			begin++;
			end++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(1);
		s1.add(3);
		s1.add(2);
		int d1 = 3;
		int m1 = 2;
		int value = birthday(s1, d1, m1);
		System.out.println(value);
		
		List<Integer> s2 = new ArrayList<Integer>();
		s2.add(1);
		s2.add(1);
		s2.add(1);
		s2.add(1);
		s2.add(1);
		s2.add(1);
		int d2 = 3;
		int m2 = 2;
		value = birthday(s2, d2, m2);
		System.out.println(value);
		
		List<Integer> s3 = new ArrayList<Integer>();
		s3.add(4);
		int d3 = 4;
		int m3 = 1;
		value = birthday(s3, d3, m3);
		System.out.println(value);
	}
}
