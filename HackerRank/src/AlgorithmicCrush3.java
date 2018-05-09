//TIMEOUT

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//7 6 1 4 2 3 6 3 2 3 4 4 5 6 5 1 2 6 7 7 20
//4-ok
//20 4 1 2 1 3 4 2 5 6 3 7 8 4
//200 - ok
//5 3 1 2 100 2 5 100 3 4 100
//104
//7 6 1 3 3 3 4 9 2 3 8 5 7 4 4 5 20 6 7 100   
//6 3 1 3 5 3 5 5 3 6 4
//8 3 2 4 1 1 5 2 5 8 40
//7 3 1 3 1 4 5 2 6 7 20

public class AlgorithmicCrush3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);				
		 int n = sc.nextInt();         
		 int m = sc.nextInt();		 
		 long result = 0;  	
		 int [] gA = new int[m];
		 int [] gB = new int[m];
		 long [] gK = new long[m];	
		 TreeSet <Integer> scale = new TreeSet<Integer>();
              
		 //read the next m operations
		 long t=0;
		 for (int r=0; r<m; r++){
			 gA[r]=sc.nextInt();
			 gB[r]=sc.nextInt();
			 gK[r]=sc.nextLong();
			 scale.add(gA[r]);
			 scale.add(gB[r]);
         }	
		 
		 //Cretate the scale mixing the two matrix
		    long[]matrix = new long[scale.size()];	
		     
		    Integer[] ruler = new Integer[scale.size()];
		    ruler = scale.toArray(ruler);		    
		    
		    //--test
		    for (int i=0;i<ruler.length;i++)
		    	 System.out.print((int)ruler[i]+" ");
		         System.out.println();
		    
		    
		    for (int iOp=0;iOp < m; iOp++){
		     int p=0;
		     int a=gA[iOp];		      
		      while (ruler[p]!=a)p++;
		       //--test
		       System.out.println(a+" found at pos: " + p);
		       
		     int q=0;
			 int b=gB[iOp];
			   while (ruler[q]!=b)q++;
			     //--test
			     System.out.println(b+" found at pos: " + q);
			     
			//fill the spaces with k
			for (int f=p; f<=q;f++){
				matrix[f]+=gK[iOp];
				if (result<matrix[f]) result = matrix[f];
			}
			//-testing
			for (int f=0;f<scale.size();f++){
				System.out.print(matrix[f]+" ");
			}
			System.out.println();		   
		    }	  
		  
		System.out.println(result);
	}
	
}
