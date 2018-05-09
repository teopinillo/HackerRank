import java.util.Scanner;

//https://www.hackerrank.com/challenges/compare-the-triplets
public class CompareTheTriplets {

	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[3];
		Scanner sc = new Scanner (System.in);
		 for (int r=0;r<3;r++){
			 a[r]=sc.nextInt();
		 }
		 for (int r=0;r<3;r++){
			 b[r]=sc.nextInt();
		 }
		 int aS=0;
		 int bS=0;
		 for (int r=0;r<3;r++){
			 if (a[r]>b[r]) aS++;
			 if (a[r]<b[r]) bS++;			 
		 }
		 System.out.println(aS+" "+bS);
	}

}
