import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
    
    public static void main (String args[]) {
        String pattern = "(?i)\\b([A-Za-z]+)\\b\\s+\\b\\1\\b";
        
        Pattern r = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
           
            while(testCases>0){
                String input = in.nextLine();
                Matcher m = r.matcher(input);   
                
                while(m.find( )){                    
                    input = input.replaceAll(m.group(),m.group(1));                   
                }
                System.out.println(input);
                testCases--;
            } 
    
}
}
/*
{
        public static void main(String[] args){

            String pattern = "(?i)\\b(\\w+)\\b\\s+\\b\\1\\b";
            Pattern r = Pattern.compile(pattern);
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
           
            while(testCases>0){
                String input = in.nextLine();
                Matcher m = r.matcher(input);                
                while(m.find( )){
                    // String g = m.group();
                    String w[] = m.group().split(" ");
                    input = input.replaceAll(g,w[0]); 
                    m = r.matcher(input);
                }
                System.out.println(input);
                testCases--;
            }
        }
    }
*/