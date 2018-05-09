
//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies?h_r=internal-search

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	public static int reverseX(int x) {
		String xRev = "";
		int n;
		while (x > 0) {
			n = x % 10;
			x = x / 10;
			xRev += n;
		}
		return Integer.parseInt(xRev);
	}

	public static void main(String[] args) {
		int rX, k, j, i;
		int days = 0;
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		j = scan.nextInt();
		k = scan.nextInt();

		for (int day = i; day <= j; day++) {
			rX = day - reverseX(day);
			if (rX % k == 0) {
				days++;
			}
		}
		System.out.println(days);
	}

}
