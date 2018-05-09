import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/luck-balance
public class LuckBalance {
	
	
	public static void main(String[] args) {
		
		 int val; 
		 int imp;
		 ArrayList<Integer> impVal;
		 
		 Scanner sc = new Scanner (System.in);
		
		 int n = sc.nextInt();
		 int k = sc.nextInt();		 
		 int maxLuck = 0;
		 impVal = new ArrayList<Integer>();
		 
		 for (int r=0;r<n;r++){			
			 val = sc.nextInt();
			 imp = sc.nextInt();
			 if (imp==1) impVal.add( val );			 
			 maxLuck+=val;	//if loose all the contest			 
		 }
		 
		 //sort all the values
		 Collections.sort(impVal);
		 int win=impVal.size()-k;
		 int revLuck = 0;
			 for (int i=0;i<win;i++)
				 revLuck+=impVal.get(i);
		 System.out.println(maxLuck -2*revLuck);			 
	}

}
