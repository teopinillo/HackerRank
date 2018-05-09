import java.util.Arrays;

//https://www.hackerrank.com/challenges/make-it-anagram?h_r=next-challenge&h_v=zen
public class MakeItAnagram extends GameOfThronesI {

	static public int[] countChars(String a) {
		int[] cChars = new int[26];
		char[] chars = a.toLowerCase().toCharArray();
		for (int i : cChars)
			i = 0;
		Arrays.sort(chars);
		for (char ch : chars) {
			cChars[ch - 97]++;
		}
		return cChars;
	}

	static public int pairString(String a, String b) {
		int[] repA = countChars(a);
		int[] repB = countChars(b);
		int[] palind = new int[26];
		int deleted = 0;

		// Elimino los caracteres sobrantes, asi
		for (int i = 0; i < 26; i++) {			
				palind[i] = repA[i]-repB[i];
				deleted+=Math.abs(palind[i]);
		}
		
		
		while (true) {
			int odds = 0;
			for (int i = 0; i < 26; i++) {
				if (palind[i] % 2 != 0)
					odds++;
			}
			if (odds < 2) {
				//for (int i = 0; i < 26; i++) {
					//for (int j = 0; j < palind[i]; j++) {
						//System.out.print(Character.toChars(i + 97));
						// System.out.print((i+97)+" ");
					//}
				//}
				//System.out.println();
				return deleted;
			} else {
				// move i to the first odd found it.
				int i = 0;
				while (palind[i] % 2 == 0)
					i++;
				// delete 1 to make it even
				palind[i]--;
				// increase the deleted chars counter
				deleted++;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(pairString("aaaabbbbccccwwww", "cc"));

	}

}
