/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.util.*;

/**
 *
 * @author tfrancisco
 */
public class JavaStringToken {
    
     
     public static void main(String[] args) 
        {
            
             
      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
          String[] r = s.split("[ !,?._'@]+");
          int np=0;
          for (String p:r) {
              if (p.isEmpty())np++;
          } 
            System.out.println(r.length-np);
             for (String p:r){
                 if (!p.isEmpty()) System.out.println(p);
             }
          
          
          /*
           while (j++<s.length()){
             char i = s.charAt(j);
              if ((i==' ')|(i=='!')|(i==',')|(i=='.')|(i=='?')|(i=='\'')|(i=='@'))
                   System.out.println("");
              else System.out.print(i);
           }
                  */
        //Complete the code

        }
    
}
