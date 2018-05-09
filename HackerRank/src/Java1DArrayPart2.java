
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tfrancisco
 */
/*
You are playing a game on your cellphone. You are given an array of length nn, indexed from 00 to n−1n−1. Each element of the array is either 00 or 11. You can only move to an index which contains 00. At first you are at the 0th0th position. In each move you can do one of the following things:

    Walk one step forward or backward.
    Make a jump of exactly length mm forward.

That means you can move from position xx to x+1x+1, x−1x−1 or x+mx+m in one move. The new position must contain 0. Also you can move to any position greater than n-1.

You can't move backward from position 00. If you move to any position greater than n−1n−1, you win the game.

Given the array and the length of the jump, you need to determine if it's possible to win the game or not. 
*/
public class Java1DArrayPart2 {
    
    public static void main (String args[]) throws FileNotFoundException{
        
    String inputF = "C:\\Users\\tfrancisco\\Desktop\\temp\\test19.txt";   
    String outputF = "C:\\Users\\tfrancisco\\Desktop\\temp\\test19A.txt";
    
    int [] answer = new int [6000];
    Scanner sc = new Scanner (new BufferedReader(new FileReader(outputF))); 
    int answ = 0;
    String solution;
     while (sc.hasNext()){
         solution = sc.next();
          if (solution.equalsIgnoreCase("YES"))
            answer[answ++]= 1; else
               answer[answ++]= 0;
     }
     sc.close();
        System.out.println("Read solutions total: "+answ);        
    sc = new Scanner (new BufferedReader(new FileReader(inputF)));    
        
    int t = sc.nextInt();     
    for (int j=0;j<t;j++){
        //length of array
        int n = sc.nextInt();
        
        //jump
        int m = sc.nextInt();
        int [] arr = new int[n]; 
        
        //reading the array
        for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        
        int pred=-1;        
        int index = 0;
        int jump = 1;
        while ((jump!=0)&&(index<n-1)){   
            jump=0;         
            if (index+m>=n) jump = m; 
             else             
                 if ( (index+m < n) &&( arr[index+m]==0)) jump = m; 
                   else          
                        if ((index+1!=pred)&&(index+1<n)&&(arr[index+1]==0)) jump=1; 
                        else                
                          if ( (index-1!=pred) &&( index-1 > 0) && (arr[index-1]==0)) jump = -1; 
            
            pred = index;            
            index+=jump;
            //System.out.println("p: "+pred+" - index: "+index);
        }    
        //System.out.println("index: " + index);   
        if (index >= n-1){
                if (answer[t]!=1) {
                    System.out.println("YES: Error en la respuesta: "+t);
                     for (Integer f:arr){
                         System.out.print(f+", ");
                         
                     }
                    System.out.println("salto: "+ m);
                    System.exit(1);
                    
                }
                System.out.println("YES");
            }else{
                if (answer[t]!=0) {
                    System.out.println("NO: Error en la respuesta: "+t);
                    System.exit(1);
                }
            
                System.out.println("NO");
        }
    }
}    
}
