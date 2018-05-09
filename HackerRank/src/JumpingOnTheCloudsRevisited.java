//https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        //-------------------------------
        
        int E,i=k;
         if (c[0]==1) E = 97; else E = 99;
         while (i<c.length) {
        	 E--;
        	 if (c[i]==1) E-=2;        	
        	 i+=k;          	 
         }
        System.out.println(E);
        //--------------------------------

	}

}
