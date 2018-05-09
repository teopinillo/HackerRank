import java.util.Random;

public class Day27testing {

	public static String inputFor (boolean yes){
		String output;
		Random r = new Random();
		 int n = Math.abs(r.nextInt(10));
		 if (n<3)n=3;
		 
		 int k = r.nextInt(r.nextInt(n));
		 if (k==0) k=1;
		 output = n+" "+k+"\n"+"-1 ";
		  for (int t=0;t<n-1;t++){
			  int min = r.nextInt(10);
			  if (yes) min*=-1; 
			  output += min + " ";
		  }
		  output+="\n";
		
		return output;
	}
	public static void main(String[] args) {
		String test = "5\n";
		test += "6 4\n-1 0 -1 3 4\n"; //no class
		test += "8 4\n-1 0 1 -5 -6 -7 -8 -9\n";//class
		test += "5 3\n-1 0 1 1 1\n"; //no class
		test += "9 5\n-1 0 -1 -1 -1 -1 1 1 1\n"; //class
		test += "10 3\n-1 0 1 1 1 1 1 2 2 2";//no class
		System.out.println(test);
	}

}
