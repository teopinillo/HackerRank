import java.util.*;

public class RoadMaintenace2_TreeVer {



	
	public static void main(String[] args) {

		
		
		
		//int[] test = { 1, 2, 1, 3, 2, 3, 3, 4, 4, 5, 5, 6, 4, 6 };
		//int[] test = { 4,2,1,2,2,3,2,4 };
		//int[] test = {1,2,2,3,3,4,4,5,5,6,6,7};
		int[] test = {0,1,0,3,2,3};
		RoadMaintenace2_TreeVer rM = new RoadMaintenace2_TreeVer();
		
		int lstPoint = 0;
		for (int i = 0; i < test.length;) {
			int p1 = test[i++];
			 if (p1>lstPoint) ; lstPoint = p1;
			int p2 = test[i++];
			if (p2>lstPoint) ; lstPoint = p2;
		}	
		System.out.println("Last point: "+ lstPoint);
		int [][] paths = new int [lstPoint+1][lstPoint+1];
		//fill the matrix
		for (int i = 0; i < test.length;) {
			int p1 = test[i++];			
			int p2 = test[i++];
			paths[p1][p2] = 1;	
			paths[p2][p1] = 1;
		}
		//print the matrix
		int cl=0;
		for (int c=0;c<=lstPoint;c++)
			System.out.print(c+"\t");
		System.out.println("\n");
		for (int[] r: paths){
			for (int c:r){
				System.out.print(c+"\t");
			}
			System.out.println();
		}
		//number of routes
		int tPaths=0;
		for (int r=0; r<lstPoint;r++){
			for (int c=1; c<lstPoint; c++){
				if (paths[r][c]==1) {
					tPaths++;
					}
			}
		}
		System.out.println("Total paths: "+tPaths);
		
	}

}
