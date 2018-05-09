import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class RecursiveDigitSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String n = scan.next();
		int k = scan.nextInt();
		scan.close();
		char digits[] = n.toCharArray();
		Arrays.sort(digits);
		
		BigInteger reduce = recursiveDigitSum ( new BigInteger(n));
		reduce = reduce.multiply( BigInteger.valueOf(k));
		try {
		System.out.println (recursiveDigitSum(reduce));
		} catch (RuntimeErrorException e){
			System.out.println(1);
		}

	}

	static public BigInteger recursiveDigitSum(BigInteger n) {
		BigInteger nine = BigInteger.valueOf(9);
		if (n.mod(nine)==BigInteger.ZERO) return nine;
		
		
		if (n.compareTo(nine) < 0 ) return n;
			BigInteger r = BigInteger.ZERO;
			char[] digits = (n.toString()).toCharArray();
			for (char d : digits) {
				int v = d - 48;
				r=r.add( BigInteger.valueOf(v));		
			}
			return  recursiveDigitSum(r);
			
		}
		
	

}
