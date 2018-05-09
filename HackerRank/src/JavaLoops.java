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
public class JavaLoops {
    
    static public void main (String args[]){
    int t,a,b, pow, r;  
    Scanner sc = new Scanner (System.in);
     t = sc.nextInt();    
    
    for (int i=0;i<t;i++){
     a = sc.nextInt();
     b = sc.nextInt();
     pow = sc.nextInt();
     
     for (int n=0;n<pow;n++){   
         r=0;
         for (int p=0;p<=n;p++){
            r+=(Math.pow(2, p)*b);
         }
         System.out.print(a+r+" ");
         
     }
        System.out.println("");
    }    
}
    
}
