import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String valid = "Valid";
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
          try{
          Pattern p = Pattern.compile(pattern);
          }catch (PatternSyntaxException pE){
              valid = "Invalid";
          }
          System.out.println(valid);
      }
   }
    
}
