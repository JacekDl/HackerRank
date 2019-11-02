package exercises;

public class JavaSubstringComparison {

	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		
		int begin = s.length() - k;
		System.out.println("begin = " + begin);
		
		
		String min = s.substring(begin);
		String max = min;
		System.out.println(min + " " + max);
		
		begin--;
		int end = s.length() - 1;
		System.out.println("end = " + end);
		
		for(int i = begin; i >= 0; i--) {
			String current = s.substring(i, end);
			System.out.println(current);
			int ansMin = current.compareTo(min);
			if(ansMin < 0) min = current;
			int ansMax = current.compareTo(max);
			if(ansMax > 0) max = current;
			end--;
		}
		
		System.out.println("MIN: " + min);
		System.out.println("MAX: " + max);

	}

}
