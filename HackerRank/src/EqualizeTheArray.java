
//https://www.hackerrank.com/challenges/equality-in-a-array

import java.util.Arrays;
import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		int [] numbers = new int[t];
		for (int i=0;i<t;i++){
			numbers[i]=scan.nextInt();
		}
		Arrays.sort(numbers);
		int eq,max;
		eq=max=0;
		int prev = numbers[0];
		for (int n:numbers){
			if (n==prev){
				eq++;
				if (eq>max) max=eq;
		}else{			
			eq=1;
			prev=n;
		}
		}		
		System.out.println(t-max);
	}
}
