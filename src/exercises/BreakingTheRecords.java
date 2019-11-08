package exercises;

//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class BreakingTheRecords {

	public static void main(String[] args) {
		int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		int max = scores[0];
		int min = scores[0];
		
		int[] count = new int[2]; //count[0]: max	count[1]: min
		for(int i : scores) {
			if(i > max) {
				max = i;
				count[0]++;
			}
			if(i < min) {
				min = i;
				count[1]++;
			}
		}
		
		for(int i : count) System.out.print(i + " ");
		
		

	}

}
