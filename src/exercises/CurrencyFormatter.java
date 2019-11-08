package exercises;

import java.text.NumberFormat;
import java.util.Locale;


//https://www.hackerrank.com/challenges/java-currency-formatter/problem
public class CurrencyFormatter {

	public static void main(String[] args) {
		double payment = 12324.134;
		
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		
		System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

	}

}
