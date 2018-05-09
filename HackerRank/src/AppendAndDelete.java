import java.util.Scanner;

//https://www.hackerrank.com/challenges/append-and-delete?h_r=next-challenge&h_v=zen

public class AppendAndDelete {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			String output = scan.next();
			String input = scan.next();
			int operations = scan.nextInt();
			
			String answ = "No";		
			int add = 0;
			
			int iLen = input.length();        
			int oLen = output.length();
	        
			if ((iLen*2)<=operations) answ="Yes";
			
			int i=0;	
			while ((i < iLen) && (i < oLen) && (input.charAt(i)==(output.charAt(i)))) {i++;}
			int del = iLen-i;
	        
			if (oLen>=iLen) {			
				add=oLen-i;
				if ((del*2)==operations) answ="Yes";
				if ((del+add)==operations) answ="Yes";
	            if (del==0){
					if (add>0){                    
						if (((operations-add)%2)==0) answ="Yes";
					}
					if (add==0){
						if ((operations%2)==0) answ="Yes";
					}
				} 
			}
			if (oLen<iLen) {						
				if (del<=operations){				
					int remaining = operations - del;				
					if ((remaining % 2)==0) answ = "Yes";
				}			
			}				
			System.out.println(answ);	
			scan.close();
	}

}
