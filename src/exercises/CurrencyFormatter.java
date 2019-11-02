package exercises;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

	public static void main(String[] args) {
		double payment = 12324.134;
		
		
		//Locale INDIA = new Locale("en", "IN");
		//Locale INDIA = new Locale.Builder().setUnicodeLocaleKeyword("Rs.", "INDIA").build();
		//Locale INDIA = new Builder().build();
		//Locale[] supportedLocales = NumberFormat.getAvailableLocales();
		//for(Locale i : supportedLocales) System.out.println(i);
		//System.out.println(NumberFormat.getCurrencyInstance().format(payment));
		//System.out.println(NumberFormat.getCurrencyInstance(new Locale("in", "INDIA")).format(payment));
		
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
