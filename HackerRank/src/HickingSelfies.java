//https://www.hackerrank.com/contests/walmart-codesprint-algo/challenges/emma-and-her-camera/submissions/code/7568114

import java.util.Scanner;

import org.junit.*;
public class HickingSelfies {

	public long factorial (long n){
		long r = n;
		 for (long i=n-1; i> 1;i--){
			 r*=i;
		 }
		 return r;
	}
	
	public long combinations (int n, int r){
		switch (n){
		case 0:
		case 1:
		case 2: return n;
		}
		
		try {
			
		return ( factorial(n) / (factorial(n-r)*factorial(r)));
		}
		catch (java.lang.ArithmeticException e){
			return 0;
		}
	}
	
	public long permutations (int n, int r){
		return  factorial(n) / factorial(n-r);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		HickingSelfies myClass = new HickingSelfies();
		
		int friends = sc.nextInt();
		int frames = sc.nextInt();
		int comb = 1;
		 for ( int i=1;i<friends;i++){
			 comb+=myClass.combinations(friends,i);
		 }		
		int answ = frames - comb;
		 System.out.println(Math.abs(answ));
		 
		 sc.close();
				
	}

}
