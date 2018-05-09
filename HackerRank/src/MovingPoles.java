import java.util.Arrays;
import java.util.HashSet;

public class MovingPoles {
	static int n;
	static int stacks;
	static Integer[] alt = { 0, 1, 2, 3, 4 };
	static long[] weigth = { 2, 4, 10, 1, 1 };
	static Long[] initialAlt = { 10L, 20L, 30L, 40L, 50L };
	static long[] cost;

	public static void main(String[] args) {
		n = 5;
		stacks = 3;
		HashSet<Integer> stackSet = new HashSet<>();

		cost = new long[n];

		// setting costs
		cost[0] = 0;
		for (int i = 1; i < n; i++)
			cost[i] = weigth[i] * (initialAlt[alt[i]] - initialAlt[alt[i] - 1]);
		print();
		stackSet.addAll(Arrays.asList(alt));
		int minCost = 0;

		while (stackSet.size() > stacks) {
			int ii = getLowerCost();
			minCost += cost[ii];
			//bajo uno la altitud
			alt[ii]--;
			if ((alt[ii] - 1) >= 0) {
				System.out
						.println("cost = " + weigth[ii] + " ," + initialAlt[alt[ii]] + " ," + initialAlt[alt[ii]-1]);
				cost[ii] = calcCost(weigth[ii], initialAlt[alt[ii]], initialAlt[alt[ii]-1]);
			} else
				cost[ii] = 0;
			stackSet.clear();
			stackSet.addAll(Arrays.asList(alt));
			System.out.println("stack: " + stackSet.size());
			print();

		}
		System.out.println("min cost: " + minCost);
	}

	private static long calcCost(long w, Long a, long p) {
		long r = 0;
		if ((p > 0) && (a >= p))
			r = w * (a - p);
		return r;
	}

	public static void print() {
		// printing altitude
		// for (long p : initialAlt)
		// System.out.print(p + "\t");
		// System.out.println();

		for (Integer l : alt)
			System.out.print(initialAlt[l] + "\t");
		System.out.println();

		for (long w : weigth)
			System.out.print(w + "\t");
		System.out.println();

		for (long c : cost)
			System.out.print(c + "\t");
		System.out.println("\n");
	}

	public static int getLowerCost() {
		int i = 1;
		int j = 1;
		Long lower = Long.MAX_VALUE;
		while (i < n) {
			if (cost[i] != 0) {
				if (lower > cost[i]) {
					lower = cost[i];
					j = i;
				}
			}
			i++;
		}

		System.out.println("low cost: " + j);
		return j;
	}

	// System.out.println()

}
