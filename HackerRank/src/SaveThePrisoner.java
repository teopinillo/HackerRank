//https://www.hackerrank.com/challenges/save-the-prisoner
import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		 int t = sc.nextInt();
		  for (int r=0;r<t;r++){
			  long n,m,s;
			  n = sc.nextLong();
			  m = sc.nextLong();
			  s = sc.nextLong();   
             if ((n==m)&&(s==1)) {System.out.println(n);break;}
			  long p = (m % n) + (s-1);			  
			  if (p>n) p-=n;              
			  System.out.println(p);
		  }
	}

}
