//https://www.hackerrank.com/challenges/strange-code

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 long q = sc.nextInt();
		 long t,v,l;
		  t=1;
		  v=3;
		  l=(t+v)-1;
		  System.out.println ("t: "+t+" v: "+v);
		  while (q>l){
			  t=l+1;
			  v=v*2;
			  l=(t+v)-1;
			  //System.out.println ("t: "+t+" v: "+v+" l: "+l);
		  }
		  //System.out.println (v-(q-t));

	}

}
