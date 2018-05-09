import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/matrix-rotation-algo/forum
//before task:
//point:
//rank:
//08/30/3016
//
//testing input
// 4 4 2 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//5 4 7 1 2 3 4 7 8 9 10 13 14 15 16 19 20 21 22 25 26 27 28
//2 2 3 1 1 1 1
//6 2 2 1 2 3 4 5 6 7 8 9 10 11 12

public class MatrixLayerRotation {
	
	public static void printMatrix (int[][] m, int r, int c){
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printMatrix (ArrayList<ArrayList<Integer>> l){
		for (int i=0;i<l.size();i++){
			ArrayList <Integer> iL = l.get(i);
			
			for (int j=0;j<iL.size();j++){
				System.out.print(iL.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void printMatrix (LinkedList<LinkedList<Integer>> l){
		for (int i=0;i<l.size();i++){
			LinkedList <Integer> iL = l.get(i);
			
			for (int j=0;j<iL.size();j++){
				System.out.print(iL.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int rows;
		int cols;
		int rot;
		
		Scanner sc = new Scanner (System.in);
		rows = sc.nextInt();
		cols = sc.nextInt();
		rot = sc.nextInt();
		if (rot>cols) rot=rot % cols;
		
		int [][] matrix = new int[rows][cols];
		
		
		//reading the matrix
		for (int r=0;r<rows;r++){
			for (int c=0;c<cols;c++){
				matrix[r][c]=sc.nextInt();
			}
		}
		//testing matrix reading
		System.out.println("matrix read");
		printMatrix (matrix,rows,cols);
				 
		LinkedList<LinkedList<Integer>> lines = new LinkedList<LinkedList<Integer>>();		
		LinkedList<Integer> line;
				
		//min rows or cols are even
		int rSt = 0;
		int rEnd = rows;
		int cSt = 0;
		int cEnd = cols;		
		int lr;
		int lc;
		for (;;){
			line = new LinkedList <Integer>();			
		
	    //left		
		for (int r=rSt;r<rEnd;r++){
			line.add(matrix [r][cSt]);			
		}
		
		//Bottom
		for (int c=cSt+1;c<cEnd;c++){
			line.add(matrix[rEnd-1][c]);
		}
		//right
		lr = rEnd - 2;
		lc = cEnd - 1;
		for (int r=lr; r > rSt; r--){
			line.add( matrix [r][lc]);
		}
		//top
		for (int c=lc; c > cSt;c--){
			line.add(matrix [rSt][c]);
		}
		
		 lines.add(line);
		  rSt++;
		   rEnd--;
			cSt++;
			 cEnd--;			
			
			if ((rSt==cEnd)) break;
			if ((cSt==cEnd)) break;			
		}
		//System.out.println(rSt+", "+rEnd+", "+cSt+", "+cEnd);
		
		//testing linear matrix
		System.out.println("Before rotating " + rot + " times");
	    printMatrix (lines);
	    System.out.println();	    
	    
	    //va por cada uno de las listas
	    int mRot;
	    for (int z=0; z < lines.size(); z++){			 
			 line = lines.get(z);
               //do only the rotates needed.
               if ( rot> line.size() ) mRot= rot % line.size();
                 else mRot=rot;
		        for (int r = 0; r < mRot; r++){
		    	    line.addFirst(line.pollLast());		//at the last to the front    	    
		        }
		}
		
		System.out.println("After rotating " + rot + " times");
		printMatrix (lines);
		
		//Constructing the matrix
		rSt = 0;
		rEnd = rows;
		cSt = 0;
		cEnd = cols;		
		
		for (int z=0; z < lines.size(); z++){
			line = lines.get(z);
			
			//left column
			for (int r=rSt;r<rEnd;r++){					
				matrix [r][cSt]=line.removeFirst();
			}
			//bottom
			for (int c=cSt+1;c<cEnd;c++){				
				matrix[rEnd-1][c]=line.removeFirst();
			}
			//right
			lr = rEnd - 2;
			lc = cEnd - 1;
			for (int r=lr; r > rSt; r--){				
				matrix [r][lc] = line.removeFirst();
			}
			//top
			for (int c=lc; c > cSt;c--){				
				matrix [rSt][c] = line.removeFirst();
			}
			
			 
			  rSt++;
			   rEnd--;
				cSt++;
				 cEnd--;			
				
				//if ((rSt==cEnd)) break;
				//if ((cSt==cEnd)) break;	
		}//End For
		System.out.println("Matrix rotated " + rot + " times");
		printMatrix(matrix, rows, cols);
	}//End Main

}//End Class
