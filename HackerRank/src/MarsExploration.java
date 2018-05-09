import java.util.Scanner;

//https://www.hackerrank.com/challenges/mars-exploration
public class MarsExploration {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        
	        int lost =0;
	        char[] letters = S.toCharArray();
	         for (int i=0;i<letters.length;){
	        	 if (letters[i++]!='S')  lost++;
	        	 if (letters[i++]!='O')  lost++;
	        	 if (letters[i++]!='S')  lost++;
	         }
	         System.out.println(lost);
	}

}
