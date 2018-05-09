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
public class LarrysArray {
    
    public static void main (String args[]){
        //int [] A = {1,6,5,2,4,3};
        //int [] A = {3,1,2};
        //int [] A = {1,3,4,2};
        int [] A = {1,2,3,5,4};
        
        //YES
        /*
        int [] A = {27, 43, 105, 58, 7, 2, 61, 111, 57, 76,
            12, 93, 72, 104, 53, 66, 99, 83, 109, 39, 29, 65, 86,
            6, 23, 82, 9, 68, 5, 48, 35, 102, 46, 107, 81, 51, 78, 26, 73,
            63, 24, 91, 31, 101, 112, 33, 77, 88, 70, 87, 56, 103, 37, 1, 16,
            41, 55, 54, 36, 80, 45, 10, 108, 97, 49, 8, 42, 20, 18, 62,
            50, 74, 106, 25, 28, 110, 3, 79, 92, 69, 52, 14, 90, 19, 15,
            13, 11, 98, 89, 94, 44, 100, 17, 21, 30, 71, 4, 34, 22,
            38, 60, 84, 67, 47, 64, 95, 59, 85, 32, 96, 75, 40};
        */
        //NO
        /*
        int [] A = {90, 76, 71, 32, 70, 100, 85, 46, 45, 59, 64, 25, 83,
                    78, 60, 26, 81, 5,0, 30, 86, 12, 38, 27, 69, 22, 10,
                    72, 23, 8, 49, 93, 99, 87, 41, 88, 95, 17, 84, 56,
                    31, 3, 74, 77, 36, 4 ,80, 14 ,29, 13, 53, 20, 61,
                    16, 63, 102, 48, 44, 5, 9, 7, 57, 51, 79, 15, 33,
                    18, 75, 65, 11, 94, 19, 66, 47, 62, 52, 73, 34,
                    55, 98, 92, 2, 28, 39, 89, 43, 96, 1, 97, 58, 82,
                    6, 42, 68, 21, 40, 91, 54, 24, 35, 67, 37, 101};

        */
        //int [] A = {27, 43, 105, 58, 7, 2, 61, 111, 57, 76};
        int l = A.length;
        int i =0;
        int r=0;
         System.out.println("initial array");
                         for (int j=0;j<l;j++) System.out.print(A[j]+" ");
                         System.out.println("\n");
                         
         while ((r<4)&&(i<l-2)){
             if ((A[i]<=A[i+1]) ){
                 i++;r=0;
            }else{                 
                 if ((i+2) < l) {
                    System.out.println("permutation at: "+(i));
                     
                     while ((r<3)&&(A[i]>A[i+1])){                     
                        int t = A[i+1];
                        A[i+1]=A[i+2];
                        A[i+2]=A[i];
                        A[i]=t;      
                        System.out.println("after permutation");
                         for (int j=0;j<l;j++) System.out.print(A[j]+" ");
                         System.out.println("\nr: "+ r); 
                         r++;
                     }             
                     if (r<3)i=0;   
                 }  else r=4;               
             }
             
         }
         if (r==4)System.out.println("NO");
                 else System.out.println("YES");
         
         
         
    }
    
}
