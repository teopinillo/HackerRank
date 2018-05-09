/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author tfrancisco
 */
public class Anagram {
    
    static String sortChars (String str){      
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String (arr);        
   }
    
   static boolean isAnagram(String A, String B) {
      //Complete the function
       if (A.equals(B)) return true;
       if (A.length()!=B.length()) return false;
       return sortChars(A.toUpperCase()).equals(sortChars(B.toUpperCase()));
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        sc.close();
        
    }
    
}
