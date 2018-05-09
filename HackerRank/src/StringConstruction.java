//https://www.hackerrank.com/challenges/string-construction
import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            char[] pCh = s.toCharArray();
            char[] sCh = s.toCharArray();
            char[] m = new char[s.length()];
            for (int i=0;i<s.length();i++)
            	m[i]='.';
            //we need to move the first ch
            int cost = 1;
            m[0]=sCh[0];
            boolean found;
            
            for (int i=0;i<s.length()-1;i++){
            	found=false;
            	for (int j=i+1; j<s.length();j++){
            		if (pCh[j]==pCh[i]){
            			m[j]=pCh[j];
            			found=true;
            			break;
            		}
            	}		
            	//if not found then add 
                if (!found) {
                	cost++;
                	m[i]=sCh[i];
                	}
            }
            System.out.println(cost);
        } 
        
	}
}
