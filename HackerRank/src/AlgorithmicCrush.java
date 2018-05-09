import java.util.Scanner;
//7 6 1 4 2 3 6 3 2 3 4 4 5 6 5 1 2 6 7 7 20
//20 4 1 2 1 3 4 2 5 6 3 7 8 4
public class AlgorithmicCrush {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n;
		int m;		
				
		 n = sc.nextInt();
         long [] list = new long[n];
		 m = sc.nextInt();
		 int a;
		 int b;
		 long k;
		 long result = 0;  	
         
		 
         for (int z=0;z<n;z++) System.out.print(list[z]+ " ");System.out.println();
              
		 for (int r=0;r<m;r++){
			 a = sc.nextInt();
			 b = sc.nextInt();
			 k = sc.nextLong();
			
			 a--;
             for (int p=a;p<b;p++) {
            	 list[p]+=k;
            	 if (list[p]>result)result=list[p];
             }
                 
             for (int z=0;z<n;z++) System.out.print(list[z]+ " ");
                  System.out.println();                  
		 }            
		 
		System.out.println(result);
	}
	
}
