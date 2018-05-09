/**
 * problem statement: https://www.hackerrank.com/challenges/cut-the-sticks/problem
 * @author tfrancisco
 */
public class CutTheSticks {
    
    public static void main (String args[]){  
        int arr[] ={5,4,4,2,2,8};
         //find the smallest and bigger than zero
        while (true){
        int count = 0;
        //count the numbers bigger than zero
        for (int i =0;i<arr.length;i++) if (arr[i]>0) count++;
        if (count>0){
            System.out.println(count);            
        }     else break;
        int smallest = 1001;
        for (int i =0;i<arr.length;i++){
            if ((arr[i]>0)&&(arr[i]<smallest)) smallest = arr[i];            
        }
        //cut the numbers with the smallest
        for (int i =0;i<arr.length;i++) arr[i]-=smallest;        
        
        }        
    }
    
}
