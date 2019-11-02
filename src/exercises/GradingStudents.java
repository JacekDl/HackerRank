package exercises;

import java.util.*;

class Result{
	
	public static List<Integer> gradingStudents(List<Integer> ar){
		List<Integer> answer = new ArrayList<Integer>();
		for(int i : ar) {
			if(i > 37 && (i % 5 > 2)) {
				i = i / 5 * 5 + 5;
			}
			answer.add(i);
		}
		System.out.println();
		return answer;
		
	}
}

public class GradingStudents {

	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(73);
		ar.add(67);
		ar.add(38);
		ar.add(33);
		
		List<Integer> result = Result.gradingStudents(ar);
		for(int i : result) {
			System.out.print(i + " ");
		}
	}

}
