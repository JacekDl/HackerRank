package exercises;

import java.io.*;
import java.math.*;
import java.util.*;

//https://www.hackerrank.com/challenges/java-biginteger/problem
public class JavaBigInteger {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		BigInteger firstInt = new BigInteger("1234");
		BigInteger secondInt = new BigInteger("20");
		
		System.out.println(firstInt.add(secondInt));
		System.out.println(firstInt.multiply(secondInt));
    }
}