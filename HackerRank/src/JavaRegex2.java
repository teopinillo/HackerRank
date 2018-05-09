import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2 {
    
            //b boundary word
            //w word char
            //non word char
            //first group match
    public static void main (String args[]){
            String pattern = "([^\\W]\\w+\\W)(\\1)";
            Pattern r = Pattern.compile(pattern);
            //Scanner in = new Scanner(System.in);
            //int testCases = Integer.parseInt(in.nextLine());
            int testCases=1;
            while(testCases>0){
                //String input = in.nextLine();
                String input = "Rana is is the the best player in eye eye game";
                input = "Swapnil went went to to to his business";
                //input = "in inthe";
                //Rana the best player in is game
                Matcher m = r.matcher(input);
                boolean findMatch = true;
                while(m.find( )){
                    String g = m.group();
                    String w[] = g.split(" ");
                    input = input.replaceAll(g,w[0]+" ");
                    findMatch = false;
                }
                System.out.println(input);
                testCases--;
            }
    }
}
