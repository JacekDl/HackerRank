package exercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//https://www.hackerrank.com/challenges/java-primality-test/problem
public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String myString = "";
        BigInteger value = new BigInteger(myString);
        boolean answer = value.isProbablePrime(1);
        if(answer) {
        	System.out.print("prime");
        }else {
        	System.out.print("not prime");
        }
    }
}

