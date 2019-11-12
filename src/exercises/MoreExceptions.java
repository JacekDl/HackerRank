package exercises;

//https://www.hackerrank.com/challenges/30-more-exceptions/problem
public class MoreExceptions {
	
	public static void main(String[] args) {
		int n = -3;
		int p = 5;
		
		Calculator myCalculator = new Calculator();
		
		try {
			int ans = myCalculator.power(n,p);
			System.out.println(ans);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

	

}
