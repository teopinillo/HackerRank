import java.util.Scanner;
//7 6 1 4 2 3 6 3 2 3 4 4 5 6 5 1 2 6 7 7 20
//4-ok
//20 4 1 2 1 3 4 2 5 6 3 7 8 4
//200 - ok
//5 3 1 2 1 2 5 1 3 4 1
//104
//7 6 1 3 3 3 4 9 2 3 8 5 7 4 4 5 20 6 7 100   
//6 3 1 3 5 3 5 5 3 6 4
//8 3 2 4 1 1 5 2 5 8 40
//7 3 1 3 1 4 5 2 6 7 20

public class AlgorithmicCrush2 {

	public static void main(String[] args) {

	       
	     long m,k,result,x;
	     int n,b,a;
	     Scanner sc = new Scanner (System.in);
	     result=0;
	     x=0;
	     n = sc.nextInt();
	     long[] line = new long [n+1];   
	     m = sc.nextLong();  
	        
	    for(int i=0;i<m;i++)
	    {
	        a = sc.nextInt();
	        b = sc.nextInt();
	        k = sc.nextLong();
	        line[a]+=k;
	        if((b+1)<=n) line[b+1]-=k;
	        
	        for (int j=1;j<=n;j++)
	        	System.out.print(line[j]+" ");
	         System.out.println();
	    }

	    for(int i=1;i<=n;i++)
	    {
	       x=x+line[i];
	       if(result<x) result=x;
	       System.out.println("x: "+x );
	    }

		System.out.println(result);
	}
	
}
