package exercises;

import java.math.BigInteger;
import java.util.Scanner;


//https://www.hackerrank.com/challenges/java-primality-test/problem
public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String myString = scanner.nextLine();
        BigInteger value = new BigInteger(myString);
        boolean answer = value.isProbablePrime(1);
        if(answer) {
        	System.out.print("prime");
        }else {
        	System.out.print("not prime");
        }
    }
}

