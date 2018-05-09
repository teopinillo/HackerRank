//https://www.hackerrank.com/challenges/circular-array-rotation

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		int[] queries = new int[q];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		// reading the queries
		for (int a0 = 0; a0 < q; a0++) {
			queries[a0] = in.nextInt();
		}

		try {
			ArrayList elements = new ArrayList();
			 for (int e:a){
				 elements.add(e);
			 }
			 for (int e:a){
				 elements.add(e);
			 }
			int start = n;
			if ((k%n)>0) start = start - (k%n);				
			
			// answering queries
			for (int querie : queries) {
				System.out.println(elements.get(start+querie));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
