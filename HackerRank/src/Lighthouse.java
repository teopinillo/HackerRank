import java.util.Scanner;

//www.hackerrank.com/contests/w23/challenges/lighthouse
public class Lighthouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 //int n = sc.nextInt();
		 //char[][] grid = new char [n][n];
		 
		  //for (int l=0;l<n;l++){
			  //String line = sc.next();
			  
		  //}
		int r = sc.nextInt();
		int d = r*2;
		 char [][] xGrid = new char[d][d];	
		 
		 
		 for (int i=0;i<d;i++){
			 java.util.Arrays.fill(xGrid[i], '.');			 
		 }
		 
		 
		 for (double a=0;a<(360);a++){
		  int x=(int)Math.round(Math.cos(a)*r);
		  int y=(int)Math.round(Math.sin(a)*r);
		  int row = r+y;
		  int col = r+x;
		  if (row>=d)row=d-1;
		  if (col>=d)col=d-1;
		 
		  xGrid[row][col]='*';		  
		 }
		 for (int i=0;i<d;i++){
			 String l = new String (xGrid[i]);
			 System.out.println(l);
		 }
   
	}

}
