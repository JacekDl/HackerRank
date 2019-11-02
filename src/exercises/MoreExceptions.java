package exercises;

class Calculator{
	
	int power(int n, int p) throws Exception{ 
		if(n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		return (int)Math.pow(n, p);
	}
	
}

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
