package exercises;

import java.io.*;
import java.math.*;
import java.util.*;

//https://www.hackerrank.com/challenges/java-biginteger/problem
public class JavaBigInteger {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		BigInteger a = new BigInteger("1234");
		BigInteger b = new BigInteger("20");
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
    }
}