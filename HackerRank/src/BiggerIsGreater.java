import java.util.ArrayList;

public class BiggerIsGreater {

	private static ArrayList <String> variations (String w){
		int l = w.length();
		char[][] simblings = new char[l*l][l];		
		ArrayList <String> result = new ArrayList <String>();
		simblings[0]=w.toCharArray();
		int i = 1; 
		String prev ="";
		String current="";
		while (!prev.equals(w)){			
			simblings[i]=simblings[i-1];
			//System.out.println ("i: "+ i);
			//System.out.println ("current: "+ String.valueOf(simblings[i]));
			//System.out.println ("pre: "+ String.valueOf(simblings[i-1]));
			//System.out.println ("current: "+ String.valueOf(simblings[i]));
			for (int c=(l-1); c>0;c--){
				char t = simblings[i][c];
				simblings[i][c]=simblings[i][c-1];
				simblings[i][c-1]=t;
				current = String.valueOf(simblings[i]);
				prev = String.valueOf(simblings[i-1]);
				//System.out.println ("prev: "+prev);
				System.out.println (current);
				result.add(current);
			}
			i++;
			System.out.println ("i: "+ i);
		}
		return result;
	}
	public static void main(String[] args) {
		String w; // word
		int t; // test cases
		ArrayList<String> words = new ArrayList<>();
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			w = scanner.next();
			words.add(w);
		}
		
		for ( String ss:words) {
			ArrayList <String> v = variations (ss);
			for (String s:v){
				System.out.println(s);
			}
		}

		System.exit(0);
		char[] letters;
		char[] smallest;

		for (int i = 0; i < t; i++) {
			letters = words.get(i).toCharArray();
			smallest = words.get(i).toCharArray();
			java.util.Arrays.sort(smallest);
			
			int l = letters.length;
			int p = l-1;
			String result = "";
			while (result == "") {
				if (p - 1 > 0) {
					if (letters[p] > letters[p - 1]) {
						char tmp = letters[p];
						letters[p] = letters[p - 1];
						letters[p - 1] = tmp;
						result = String.valueOf(letters);
					}else {
						p--;
					}
				} else {
					result = "no answer";
				}
			}
			System.out.println(result);
		}
	}

}
