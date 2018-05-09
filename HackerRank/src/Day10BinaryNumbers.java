//https://www.hackerrank.com/challenges/30-binary-numbers

import java.math.BigInteger;
import java.util.Scanner;

public class Day10BinaryNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		BigInteger n = sc.nextBigInteger();
		int mBits  = 0;
		int cBits = 0;
		 for (int i=0; i<n.bitLength();i++){
			 if (n.testBit (i)) {
				 cBits++; 
				 if (cBits>mBits) mBits=cBits;
			 }
				 else {
					 cBits=0;
				 }
				 
				 
			 
		 }
		System.out.println(mBits);

	}

}
