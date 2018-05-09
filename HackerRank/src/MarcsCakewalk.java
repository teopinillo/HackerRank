import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//https://www.hackerrank.com/challenges/marcs-cakewalk?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

public class MarcsCakewalk {

	class CalCount implements Callable<BigInteger> {
		private int[] calories;
		private int start;
		private int end;

		@Override
		public BigInteger call() throws Exception {
			BigInteger result = BigInteger.valueOf(0);
			for (int i = start; i <= end; i++) {
				BigInteger panque = BigInteger.valueOf((long) Math.pow(2, i));
				System.out.println("panque: " + panque);
				panque = panque.multiply(BigInteger.valueOf(calories[i]));
				System.out.println("panque: " + panque);
				result = result.add(panque);
				System.out.println("result: " + result);				
			}
			return result;
		}

		CalCount(int[] _calories, int _start, int _end) {
			calories = _calories;
			start = _start;
			end = _end;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * int n = in.nextInt(); int[] calories = new int[n]; for(int
		 * calories_i=0; calories_i < n; calories_i++){ calories[calories_i] =
		 * in.nextInt(); }
		 */

		int[] calories = { 1, 3, 2 };
		int n=3;

		Arrays.sort(calories);
		int[] sortedCal = new int[n];
		int c = 0;
		for (int i = n - 1; i >= 0; i--) {
			sortedCal[c++] = calories[i];
		}

		int mid = n / 2;
		MarcsCakewalk myApp = new MarcsCakewalk();
		Callable<BigInteger> th1 = myApp.new CalCount(sortedCal, 0, mid - 1);
		Callable<BigInteger> th2 = myApp.new CalCount(sortedCal, mid, n - 1);
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<BigInteger> f1 = es.submit(th1);
		Future<BigInteger> f2 = es.submit(th2);
		try {
			BigInteger v1 = f1.get();
			BigInteger v2 = f2.get();
			v2 = v2.add(v1);
			System.out.println(v2.toString());

		} catch (Exception e) {
			System.out.printf("Error %s", e);

		}

		es.shutdown();

	}

}
