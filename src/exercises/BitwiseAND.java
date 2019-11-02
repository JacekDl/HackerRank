package exercises;

public class BitwiseAND {

	public static void main(String[] args) {
		/*int a = 1;
		int b = 4;
		System.out.println(a&b);*/
		
		int n = 2;
		int k = 2;
		int numberToInsert = 1;
		int[] s = new int[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = numberToInsert++;
			//System.out.print(s[i] + " ");			//OK
		}
		
		int max = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				int calc = s[i] & s[j];
				if(calc > max && calc < k) max = calc;
			}
		}
		System.out.println(max);
	}

}
