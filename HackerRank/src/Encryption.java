import java.util.Scanner;

/**
 *
 * @author tfrancisco
 * problem statement: https://www.hackerrank.com/challenges/encryption/problem
 */
public class Encryption {
	
    static String encryption(String s) {
        StringBuilder output = new StringBuilder ();
		int p = 0;
		int l = s.length();
		int c = (int) Math.round(Math.sqrt(l));
		int r = l / c;
		if ((r * c) < l)
			r++;
		if (r > c) {
			int t = r;
			r = c;
			c = t;
		}
		// Initializate the array to avoid empty chars;
		char[][] encrypt = new char[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; (p < l) && (j < c); j++)
				encrypt[i][j] = '~';

		for (int i = 0; i < r; i++) {
			for (int j = 0; (p < l) && (j < c); j++) {
				encrypt[i][j] = s.charAt(p++);
			}
		}

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++)
				if (encrypt[j][i] != '~') {
					char ch =encrypt[j][i];
					 output.append(ch);
				}
            output.append(" ");
		}
        return output.toString();
    }

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = encryption(s);
        System.out.println(result);
        in.close();	
	}

}
