import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
        
public class JavaRegex3_UsernameChecker {
    public static void main (String[] args){
        String username = "alpha_naheed";
        String pattern = "^[a-z]{7,30}$";
        pattern = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
        
        Pattern r = Pattern.compile (pattern);
            Matcher m = r.matcher (username);
             
            if (m.find()){
                System.out.println ("Valid");
            }else{
                System.out.println("Invalid");
            }            
    }
}
