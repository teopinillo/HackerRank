import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		java.util.Arrays.sort(c);
		for (int sockColor : c)
			System.out.print(sockColor + " ");
		System.out.println();

		int currentColor = c[0];
		int socks = 0;
		int pairs = 0;
		for (int sockColor : c) {

			if (sockColor == currentColor) {
				socks++;
			} else {
				pairs += (socks / 2);
				socks = 1;
				currentColor = sockColor;
			}
		}
		if (socks > 1)
			pairs += (socks / 2);
		System.out.println(pairs);

	}

}
