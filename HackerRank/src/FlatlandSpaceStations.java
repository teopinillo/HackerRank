import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FlatlandSpaceStations {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cities = sc.nextInt();
		int mStations = sc.nextInt();

		ArrayList<Integer> stations = new ArrayList<Integer>();
		for (int s = 0; s < mStations; s++) {
			int st = sc.nextInt();
			stations.add(st);
		}
		if (mStations == cities)
			//if all the cities has stations then distance is cero
			System.out.println(0);
		else {
			//sort stations by cities
			stations.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer a, Integer b) {
					return a.compareTo(b);
				}

			});
			//distance from 0 to first city with station
			int maxD = stations.get(0);
			//distance from last city with station to last city
			int dTail = (cities - stations.get(mStations - 1)) - 1;
			//select the max
			if (dTail > maxD) maxD = dTail;
			//iterate beteewn all other cities and compare the distance
			for (int i = 0; i < stations.size() - 1; i++) {
				int g = stations.get(i + 1) - stations.get(i);
				g = (int) Math.round(Math.ceil(g / 2));
				if (g > maxD) maxD = g;
			}
			// System.out.println(stations);
			System.out.println(maxD);
		}
	}

}
