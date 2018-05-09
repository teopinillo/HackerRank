import java.util.Scanner;

//https://www.hackerrank.com/challenges/minimum-distances
public class MinimumDistances {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int A[] = new int[n];
	        for(int A_i=0; A_i < n; A_i++){
	            A[A_i] = in.nextInt();
	        }
	        
	        //====
	        int minD = n+1;
	         for (int i=0;i<n-1;i++){
	        	 for (int j=i+1;j<n;j++){
	        		if (A[i]==A[j]){
	        			if (minD > (j-i) ) minD = j - i;
	        		}
	        	 }
	         }
	        if (minD==n+1) minD=-1;
	        System.out.println(minD);
	        
	       //====

	}

}
