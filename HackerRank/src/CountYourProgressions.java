import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/contests/walmart-codesprint-algo/challenges/count-your-progressions

public class CountYourProgressions {

	public long factorial (long n){
		long r = n;
		 for (long i=n-1; i> 1;i--){
			 r*=i;
		 }
		 return r;
	}
	
	public static void main(String[] args) {
		CountYourProgressions myClass = new CountYourProgressions();
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		 int[] numbers = new int[t];
		 int[] steps = new int[t];
		 
		 Arrays.fill(steps, 0);
		 for ( int r =0; r<t;r++){
			 numbers[r]=sc.nextInt();
		 }
		 	
		 for (int i=t-1;i>0;i--)steps[i]=numbers[i]-numbers[i-1];		 
		 for ( Integer i:steps) System.out.print (i+" ");
		 
		 System.exit(0);
		 
		 for ( int r = 1; r<t;r++){
			 steps [r]= numbers[r]- numbers [r-1];
		 }
		 
		 for ( Integer i:steps) System.out.print (i+" ");
		 System.out.println();
		 
		 
		 int answ = t + 1;
		 int eqd = 1;
		 

		 System.out.println(answ);

	}

}
//8 3 6 9 12 5 10 15 20-