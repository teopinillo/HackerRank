import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Day28RegExPatterns {

	private static String[] names = {"riya","julia","julia","julia","samantha","tanya"};
	private static String[] emails = {"riya@gmail.com",
								"julia@julia.me",
								"sjulia@gmail.com",
								"julia@gmail.com",
								"samantha@gmail.com",
								"tanya@gmail.com"};
	
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".+@gmail.com");
		Matcher m;
		ArrayList<String> sorted = new ArrayList<>();
		for (int i=0;i<names.length;i++){
			m = p.matcher (emails[i]);
			if (m.matches()) sorted.add(names[i]);			
		}
		Collections.sort(sorted);
		for (String s:sorted)
			System.out.println (s);
	
	}

}
