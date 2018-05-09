import java.util.HashMap;
import java.util.Map;

/*
 * Teofilo Francisco
 * 05/07/2018
 * https://www.hackerrank.com/challenges/permutation-equation/problem
 */
public class SequenceEquation {

	static int[] permutationEquation(int[] p) {
		/*
		 * 5 2 1 3 4 input array Map val->pos 5->1 2->2 1->3 3->4 4->5
		 * 
		 * val pos x=1 m.1=3, m.3 = 4 x=2 m.2=2, m.2 = 2 x=3 m.3=4, m.4 = 5 x=4 m.4=5,
		 * m.5 = 1 x=5 m.5=1, m.1 = 3
		 */
		Map<Integer, Integer> mapPos = new HashMap<Integer, Integer>();
		for (int i = 1; i <= p.length; i++) {
			mapPos.put(p[i - 1], i);
		}

		int[] result = new int[p.length];
		for (int i = 1; i <= p.length; i++) {
			int first = mapPos.get(i);
			result[i - 1] = mapPos.get(first);
		}
		return result;
	}

	

	public static void main(String[] args) {
		

	}

}
