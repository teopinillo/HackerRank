import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

	public static void main(String[] args) {
	    //Scanner in = new Scanner(System.in);
        //String s = in.next();
		String s;
        s="aaaAbbbB";
        char[] txt = s.toCharArray();
        System.out.println(s);
        int c=1;
         for (int i=0;i<s.length();i++){
        	 if ((txt[i]>64)&&(txt[i]<91)) c++;
         }
         System.out.println(c);
	}

}
