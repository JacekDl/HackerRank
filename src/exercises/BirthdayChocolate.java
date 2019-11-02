package exercises;

import java.util.*;

public class BirthdayChocolate {

	private static int birthday(List<Integer> s, int d, int m) {	//m = lenght of subarray	d = sum of subarray elements
		int answer = 0;
		int begin = 0;
		int end = begin + (m - 1);
		
		int sum = 0;
		for(int i = begin; i <= end; i++) {
			sum = sum + s.get(i);
		}
		if(sum == d) answer++;
		begin++;
		end++;
		
		while(end < s.size()) {
			sum = sum - s.get(begin) + s.get(end);
			if(sum == d) answer++;
			/*int sum = 0;
			
			for(int i = begin; i <= end; i++) {
				sum = sum + s.get(i);
			}
			if(sum == d) answer++;*/
			begin++;
			end++;
		}
		/*int answer = 0;
		int end;
		if(m == 1) end = s.size();
		else end = s.size() - m;
		
		for(int i = 0; i < end; i++) {
			int sum = 0;
			for(int j = 0; j < m; j++) {
				sum = sum + s.get(i + j);
			}
			if(sum == d) answer++;
		}*/
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
