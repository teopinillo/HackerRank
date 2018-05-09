//https://www.hackerrank.com/challenges/chocolate-feast?h_r=next-challenge&h_v=zen
import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t,n,c,m,x,w,mx;
		t = sc.nextInt();
		for (int r=0;r<t;r++){
			n = sc.nextInt();
			c = sc.nextInt();
			m = sc.nextInt();
			//
			x=n/c;
			w=x;
			while (w>=m){
				mx=w/m;
				x+=mx;
				w=mx+(w%m);
			}
			System.out.println(x);
		}

	}
}
