import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-2d-arrays
public class Day112DArrays {

	public static int hourgGlassSum(int[][] matrix, int dim, int sY, int sX){
		int xD[] = {0,1,2,1,0,1,2};
		int yD[] = {0,0,0,1,2,2,2};
		int result = 0;
		
		 for (int m=0;m<xD.length;m++){
			 if ((sX+xD[m]>dim) || (sY+yD[m]>dim)) {
				 result = Integer.MIN_VALUE;
				 break;
			 }
			 result+=matrix[sY+yD[m]][sX+xD[m]];
		 }
		return result;
	}
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        
	        int max=-64;
	        int v;
	        for (int row=0;row<4;row++)
	        	for (int col=0;col<4;col++){
	        		v=hourgGlassSum(arr,6,row,col);
	        		if (v>max) max= v;
	        	}
	        System.out.println(max);
	        
	}

}
