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
public class JavaStringReverse {

    public static void main (String[] args){
        
        String A = "mama";
        String reverse="";
         int l= A.length();
          for (int i=l-1;i>=0;i--){
              reverse+=A.substring(i, i+1);
          }          
          if (A.equals(reverse)) 
              System.out.println("Yes");
          else System.out.println("No");
        
    }
    
}
