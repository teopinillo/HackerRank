import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/matrix-rotation-algo/forum
//before task:
//polong:
//rank:
//08/30/3016
//
//testing input
// 4 4 2 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//5 4 7 1 2 3 4 7 8 9 10 13 14 15 16 19 20 21 22 25 26 27 28
//2 2 3 1 1 1 1
//6 2 2 1 2 3 4 5 6 7 8 9 10 11 12

public class MatrixLayerRotation2 {
	static long [][] matrix;
	static int cols;
	static int rows;
	final static long EMPTY = -1;
	
	public static void printMatrix (){
		for (int i=0;i<rows;i++){
			for (int j=0;j<cols;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {		
		long rot;		
		Scanner sc = new Scanner (System.in);
		rows = sc.nextInt();
		cols = sc.nextInt();
		rot = sc.nextLong();
		matrix = new long [rows][cols];
		
		
		//reading the matrix
		for (int r=0;r<rows;r++){
			for (int c=0;c<cols;c++){
				matrix[r][c]=sc.nextLong();
			}
		}
						 
		ArrayList <ArrayList<Long>> lines = new ArrayList < ArrayList< Long >>();		
		ArrayList<Long> line;
		
		//min rows or cols are even
		int rSt = 0;
		int rEnd = rows;
		int cSt = 0;
		int cEnd = cols;		
		int lr;
		int lc;
		int itr=0;
		for (;;){
			line = new ArrayList <Long>();	
			if (itr<20) {
				   System.out.println(rSt+", "+rEnd+", "+cSt+", "+cEnd);
				   itr++;
			   } else break;
		
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
			  	   
			   
			if ((rSt==rEnd)) break;
			if ((cSt==cEnd)) break;			
		}
		//System.out.prlongln(rSt+", "+rEnd+", "+cSt+", "+cEnd);
		
		//testing linear matrix
		//System.out.prlongln("Before rotating " + rot + " times");
	    //prlongMatrix ();
	    //System.out.prlongln();	    
	    
	    //va por cada uno de las listas
	    long mRot;
	    for (int z=0; z < lines.size(); z++){			 
			 line = lines.get(z);
               //do only the rotates needed.
               if ( rot > line.size() ) mRot= rot % line.size();
                 else mRot=rot;
               
		        for (long r = 0; r < mRot; r++){
		        	//put the last in the front
		        	long lst = line.remove(line.size()-1);
		        	line.add(0, lst);		        	   	    
		        }
		}
				
		//Constructing the matrix
		rSt = 0;
		rEnd = rows;
		cSt = 0;
		cEnd = cols;			
		
		for (int z=0; z < lines.size(); z++){
			line = lines.get(z);
			int index = 0;
			
			//left column
			for (int r=rSt;r<rEnd;r++){					
				matrix [r][cSt]=line.get(index++);
			}
			//bottom
			for (int c=cSt+1;c<cEnd;c++){				
				matrix[rEnd-1][c]=line.get(index++);
			}
			//right
			lr = rEnd - 2;
			lc = cEnd - 1;
			for (int r=lr; r > rSt; r--){				
				matrix [r][lc] = line.get(index++);
			}
			//top
			for (int c=lc; c > cSt;c--){				
				matrix [rSt][c] = line.get(index++);
			}
			  rSt++;
			   rEnd--;
				cSt++;
				 cEnd--;			
				
				
		}//End For		
		printMatrix();
	}//End Main

}//End Class
