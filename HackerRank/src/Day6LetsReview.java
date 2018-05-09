import java.util.Scanner;

public class Day6LetsReview {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner (System.in);
	   int cases = scanner.nextInt();
	    String [] str = new String[cases];
	    for (int q=0;q<cases;q++){
	    	str[q]=scanner.next();
	    }
	    
	    for (int q=0;q<cases;q++){
	    	int l = str[q].length();
	    	int p = 0;
	    	String even = "";
	    	String odd = "";
	    	while (p<l){
	    		even += str[q].charAt(p++);
	    		if (p<l) odd+= str[q].charAt(p++);
	    	}
	    	System.out.println (even+" "+odd);
	    }

	}

}
