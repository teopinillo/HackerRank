import java.util.Scanner;

public class CavityMap {

	public static void printMap(int n, char[][] map) {
		for (int i=0;i<n;i++){
			
			 for (int j=0;j<n;j++){
				 System.out.print(map[i][j]);			 				 
			 }
			 System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int d =0;
		int c = 0;
		char originalMap[][] = new char[n][n];
		char borderMap[][] = new char  [n][n];
		
		 for (int i=0;i<n;i++){			 
		  String line = sc.next();
			for (int ch=0;ch<line.length();ch++){
			  originalMap[i][ch] = line.charAt(ch);	
			  borderMap[i][ch] =  originalMap[i][ch];
			 }
		 }
		 
		 //summ all adyecent cells
		 int m = n-1;
		 int x;
		 for (int i=1;i<m;i++)
			 for (int j=1;j<m;j++){
				 x=originalMap[i][j];				 
				 if ((x > originalMap[i] [j+1]) &&
				     (x > originalMap[i] [j-1]) &&
				     (x > originalMap[i+1][j])  &&
				     (x > originalMap[i-1][j]))  borderMap[i][j]='X';
					 
			 }		 
		 printMap(n, borderMap);	 

	}

}
