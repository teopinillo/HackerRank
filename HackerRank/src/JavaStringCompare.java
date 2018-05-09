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
public class JavaStringCompare {
    
    public static void main (String args[]){
      
      Scanner sc = new Scanner (System.in);
       
      //String s=sc.nextLine();
      //int n=sc.nextInt();
      String s="ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
      int n=240;
      int l = s.length();
      int start = 0;
      String minStr=s.substring(0,n);
      String maxStr=s.substring(0,n);
      String cStr;
       while (start+n<l){           
        cStr=s.substring(start,start+n); 
        if (cStr.compareTo(minStr)<0) {
            minStr=cStr;
            System.out.println("min is: "+minStr);
        }
        if (cStr.compareTo(maxStr)>0) maxStr=cStr;
           //System.out.println(cStr);
        start++;
       }
       cStr=s.substring(start);
       if (cStr.compareTo(minStr)<0) minStr=cStr;
       if (cStr.compareTo(maxStr)>0) maxStr=cStr;
        //System.out.println("last:" +cStr);
        System.out.println(minStr);
        //System.out.println(maxStr);
    }
    
    
    
    
    
}
