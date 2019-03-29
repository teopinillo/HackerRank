//https://www.hackerrank.com/challenges/java-currency-formatter/problem
package me.theofrancisco;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;


public class Java_Currency_Formatter {

	public static void main(String[] args) {		 
	        double payment = 12324.134;     
	        
	        // Write your code here.
	        NumberFormat nf_us = NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat nf_ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat nf_fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        NumberFormat nf_in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));    
	        
	        String india = nf_in.format(payment);
	        String us = nf_us.format(payment);	        
	        String china = nf_ch .format(payment);
	        String france = nf_fr.format(payment);
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);

	}

}
