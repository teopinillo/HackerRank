import java.util.Scanner;

/**https://www.hackerrank.com/challenges/counting-valleys
 * 
 */

/**
 * @author theofrancisco.me
 *
 */
public class CountingValleys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		String s = scan.nextLine();
		s = s.trim();
		
		char steps[] = s.toCharArray();
		int level = 0;
		int valleys = 0;
		for (char c:steps){
			if (c == 'U') level++; else level--;
			if (level==0) valleys++;
			System.out.printf("c %S, level %d, valleys: %d %n",c,level,valleys);
		}
		//System.out.printf("valleys %d, level: %d",valleys, level);
		scan.close();
	}

}
