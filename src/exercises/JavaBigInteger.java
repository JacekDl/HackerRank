package exercises;

import java.io.*;
import java.math.*;
import java.util.*;

public class JavaBigInteger {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		//String str = scanner.nextLine();
		BigInteger a = new BigInteger("1234");
		//str = scanner.nextLine();
		BigInteger b = new BigInteger("20");
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
    }
}