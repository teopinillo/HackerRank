
import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/electronics-shop

public class ElectronicShop {

	private static int kbBrands;
	private static int mouseBrands;
	private static int _dollars;
	private static int[] _keyboards;
	private static int[] mouses;
	
	static int getMoneySpent(int[] keyboards, int[] drives, int s) {
		int answer = -1;
		// Sorting the data
		Arrays.sort(keyboards);
		Arrays.sort(drives);

		// add every keyboard to every mouse
		int i = keyboards.length - 1;

		lookup: while (i >= 0) {

			// if the price of the keyboard is equal or less
			// than the amount of dollars then:
			if (keyboards[i] < s) {
				int j = drives.length - 1;
				while (j >= 0) {
					// check if the mouse price is less than the dollars amount
					if ((drives[j] < s) && ((drives[j] + keyboards[i]) < s)) {
						if (drives[j] + keyboards[i] > answer)
							answer = drives[j] + keyboards[i];
						if (answer == s)
							break lookup;
					}
					j--;
				}
			}
			i--;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		// read the data
		Scanner input = new Scanner(System.in);
		_dollars = input.nextInt();
		kbBrands = input.nextInt();
		mouseBrands = input.nextInt();

		_keyboards = new int[kbBrands];
		mouses = new int[mouseBrands];

		// reading keyboard prices
		for (int i = 0; i < kbBrands; i++)
			_keyboards[i] = input.nextInt();

		// reading mouses price
		for (int i = 0; i < mouseBrands; i++)
			mouses[i] = input.nextInt();

		System.out.println(getMoneySpent(_keyboards,mouses , _dollars));
		input.close();
	}

}
