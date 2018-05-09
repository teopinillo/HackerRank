 /*
You are given an array of nn integers. A sub-array is "Negative" if sum of all
the integers in that sub-array is negative. Count the number of
"Negative sub-arrays" in the input array.

Note: Subarrays are contiguous chunks of the main array. For example if the
array is {1,2,3,5} then some of the subarrays are 
{1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc. 
But {1,2,5} is not an subarray as it is not contiguous.

Input Format

The first line consists an integer nn. The next line will contain nn space
separated integers. Value of n will be at most 100. The numbers in the array
will range between -10000 to 10000.
        */


import java.util.Scanner;


public class Java1DArray {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner (System.in);
        //int cases = sc.nextInt();
        /*int [] arr = new int[cases];
        int t= 0;
         while (t<cases){
           arr[t++] = sc.nextInt();
         }
        */
       
        //int [] arr = {1,2,3,4,5,6,7,8,9}; 
        int [] arr = {1, -2, 4, -5, 1};
        
        int cases = arr.length;
        
        int start = 0;
        int total = 1;
        int n;
        int sum;
        int neg=0;
        
        while (start<cases){
        
        sum = 0;
        for (int i=start; i<( start + total ); i++){
            n = arr[i];  
            sum+=n;
            //System.out.print(n + " , ");            
         }
        if (sum<0) neg++;
        //System.out.println("");
        total++;
        if ((total+start)>cases){
            total=1;
            start++;
        }
        
        }
        System.out.println(neg);
       }
    
}
