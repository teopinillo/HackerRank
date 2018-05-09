/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author tfrancisco
 */
public class JavaIfElse {
    public static void main (String [] args){
        
        System.out.printf("%1$-15s","java");
        System.out.printf("%1$03d\n",1);
        int n = 0;
        String s = Integer.toString(n);
        String A = "java";
        String B = "java";
        
        
        int l = A.length()+B.length();
         
         System.out.println(l);
         
         if (A.compareTo(B)>=0){
             //String T = A;
             //A = B;
             //B = T;
             System.out.println("No");
         } System.out.println("Yes");
         
         System.out.print(A.substring(0, 1).toUpperCase());
         System.out.print(A.substring(1)+" ");
         System.out.print(B.substring(0, 1).toUpperCase());
         System.out.println(B.substring(1));
         
         System.exit(0);
         
        long l1 = Long.MAX_VALUE;
        if ((n<1)|(n>100)) System.exit(1);
        if (n%2!=0) System.out.println("Weird");
        else {
            if ((n>2)&(n<=5)) System.out.println("Not Weird");
            if ((n>6)& (n<=20)) System.out.println("weird");
            if (n>20)System.out.println("Not Weird");
        }
    }
}
