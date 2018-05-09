import java.util.Scanner;

//https://www.hackerrank.com/challenges/beautiful-triplets
public class BeautifulTriplets {

	public static void main(String[] args) {
		//reading the data
		Scanner sc = new Scanner (System.in);
		 int n = sc.nextInt();
		 int d = sc.nextInt();
		 int [] l = new int[n];
		 for (int r=0;r<n;r++){
			 l[r]=sc.nextInt();
		 }
		 //iterarte over three inners loop for i,j,k
		 int t=0;
		 for (int i=0;i<n-2;i++){
			 for (int j=i+1;j<n-1;j++){
				 if (l[j]-l[i]==d){
				 for (int k=j+1;k<n;k++){
					 if ( (l[k]-l[j]==d) ) t++;
				 }
				 }
			 }
		 }
		 
		 System.out.println(t);		 
	}
}
