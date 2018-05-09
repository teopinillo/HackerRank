import java.util.Scanner;

//https://www.hackerrank.com/contests/w23/challenges/gears-of-war
public class GearsOfWars {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int q = sc.nextInt();
		  for (int r=0;r<q;r++){
			  long n = sc.nextLong();
			   if (n%2==0) System.out.println("Yes");
			    else System.out.println("No");
		  }

	}

}
