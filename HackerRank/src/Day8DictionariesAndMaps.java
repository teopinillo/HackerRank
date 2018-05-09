import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day8DictionariesAndMaps {

	public static void main(String[] args) {
		
		HashMap<String, Integer> phoneBook = new HashMap<>(); 

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        
       
        Integer ph;
        ArrayList<String> ans = new ArrayList<>();
        while(in.hasNext()){
            String s = in.next();
            ph = phoneBook.get(s);
            if (ph!=null){
            	ans.add(s+"="+ph);
            } else ans.add("Not found");
        }
        in.close();
        for (String s:ans) System.out.println(s); 
        
	}

}
