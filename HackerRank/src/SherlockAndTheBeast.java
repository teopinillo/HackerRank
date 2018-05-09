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
public class SherlockAndTheBeast {
    
    public static void main (String args[]) {
        
    int n = 8;  
    
    long m,num;
    long n5=5;
    long n3=3;
    int s3,s5;
    boolean valid=false;  
    
    num = n;
     for (int z=1; z<num; z++){         
        n5=(n5*10)+5;        
        n3=(n3*10)+3;          
    }
     
    for (long i=n5;i>=n3;i--){       
         num=i;s3=0;s5=0;
         valid = !(num%2==0);
         while ((valid)&&(num>0)){
             m = num % 10;
             if (m==3) s3++;
             if (m==5) s5++;
             if ((m!=3)&&(m!=5)) valid = false;             
             num/=10;
         }
         //if (valid){
             //System.out.println("? valido: "+i+ " 3: "+s3+ " 5: "+s5);             
         //}
         if (valid) {
            //valid = false; 
            if (((s3 % 5==0) ) && ((s5 % 3==0) )) {
                System.out.println(i);
                break;
            }
            else {
                valid = false;
            }
         }                
         }
         if (!valid) System.out.println("-1");
    
         
         
         
         } 
    } 
    


