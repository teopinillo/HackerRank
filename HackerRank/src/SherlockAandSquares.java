/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author tfrancisco
 */
public class SherlockAandSquares {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    public static void main (String[] args) {   
   
         
        
             int a = 1;
             int b = 36;
             int c= 1;
             
             int i = (int)Math.round (Math.sqrt(a));             
             //if (i<2) i=2;
             if ((i*i)<a) i++;
             while ((i*i++)<=b) c++;                         
             System.out.println(--c);
         }
    
}
