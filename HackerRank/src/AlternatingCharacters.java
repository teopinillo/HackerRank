//https://www.hackerrank.com/challenges/alternating-characters?h_r=next-challenge&h_v=zen
import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		int t;
        String s,o;
        Scanner scanner = new Scanner (System.in);
        t = scanner.nextInt();
         for (int r=0;r<t;r++){             
		  s = scanner.next();
		  o = s;
		  while (s.contains("AA")) s = s.replaceAll("AA", "A");
		  while (s.contains("BB")) s = s.replaceAll("BB", "B");		  
		  System.out.println(o.length()-s.length()); 
         }
        }

}
