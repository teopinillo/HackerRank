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
public class SherlockAndTheBeast2 {
    
    public static void main (String args[]){
    int n = 100;
    int n5 = n;
    int n3 = 0;  
    boolean found = false;
    
    do {  
        if ((n5%3)!=0){
            n5--;
            n3++;
        }
        if ((n5%3==0)&&(n3%5==0)) {
            found = true;
        }else{
            n5--;n3++;
        }            
        if ((n5<0)&(n3>n)) break;
    }
    while (!found);      
    
    if ((n5<0)&(n3>n)){
        System.out.print("-1");
    }else {
        for (int i=0;i<n5;i++){
            System.out.print("5");
    }
        for (int i=0;i<n3;i++){
            System.out.print("3");
    }
    }
    System.out.println("");
}
    
}
