import java.util.Scanner;

//https://www.hackerrank.com/challenges/divisible-sum-pairs
public class DivisibleSumPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,k;
		n = sc.nextInt();
		k = sc.nextInt();
		int pairs =0 ;
		int[] list = new int[n];
		 for (int r=0; r<n;r++){
			 list[r]=sc.nextInt();
		 }
		for (int i=0;i<n-1;i++){
			for (int j=i+1;j<n;j++){
				if (((list[i]+list[j])%k)==0) pairs++;
			}
		}
		System.out.println(pairs);

	}
}
