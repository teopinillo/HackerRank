//https://www.hackerrank.com/challenges/designer-pdf-viewer?h_r=next-challenge&h_v=zen
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
         Map<Character,Integer> heights = new HashMap<>();
         int i=0;
         for (char c=97;c<123;c++){
        	 heights.put(c, h[i++]);
         }
         char[] letters = word.toCharArray();
         int t=0;
         for ( char c:letters){
        	 if (heights.get(c)> t) t=heights.get(c);
         }
         System.out.println(t*(letters.length));
         
	}

}
