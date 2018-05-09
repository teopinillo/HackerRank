//https://www.hackerrank.com/challenges/repeated-string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        
        long tR = n / s.length();	//repetitions total
        long parcial = n % s.length();
        int aF=0;
        
        long tA = s.length() - s.replaceAll("a", "").length();
        tA*=tR;
        if (parcial>0){
        	String sb = s.substring(0, (int) parcial);
        	aF = sb.length() - sb.replaceAll("a", "").length();        	
        }
        System.out.println(tA+aF);

	}

}
