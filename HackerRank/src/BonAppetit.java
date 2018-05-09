//https://www.hackerrank.com/challenges/bon-appetit
import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int n,k,p,pK,t,split;
		pK=0;t=0;
		
		
		n = scanner.nextInt();
		k = scanner.nextInt();
		
		 for (int r=0;r<n;r++){
			 p = scanner.nextInt();			 
			 if (r==k) pK=p; else t+=p;
		 }
		 t/=2;
		 
		 split = scanner.nextInt();
		 if (split==t) {
			 System.out.println("Bon Appetit");
		 }else {
			 System.out.println(split-t);
		 }

	}

}
