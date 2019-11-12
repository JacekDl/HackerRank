package exercises;

import java.util.Scanner;

class MyCalculator2 {
	 
	public long power(int n, int p) throws Exception{
		if(n < 0 || p < 0) {
			throw new Exception("n or p should not be negative");
		}
		if(n == 0 && p == 0) {
			throw new Exception("n and p should not be zero");
		}
		return (long) Math.pow(n, p);
	}
     
}

//https://www.hackerrank.com/challenges/java-exception-handling/problem
public class JavaExceptionHandling2 {
    public static final MyCalculator2 my_calculator = new MyCalculator2();
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
