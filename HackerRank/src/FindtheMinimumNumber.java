

import java.util.Scanner;

/**
 *
 * @author tfrancisco
 */
public class FindtheMinimumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String r="";
        String c="";
        for (int i=1;i<n;i++){
           r+="min(int, "; 
           c+=")";
        }
        r+="int"+c;
        System.out.println(r);
    }
}
