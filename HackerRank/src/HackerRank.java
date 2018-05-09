

import java.util.Scanner;

/**
 *
 * @author tfrancisco
 */
public class HackerRank {

    
    public static long repunit (int k){
        int p=1;
         long r = 0;
         for (int i=0;i<k;i++){             
             r = (p) + r;
             p= p*10;
         }
         return r;
    }
    
    public static int gcd (int l, int r){
        //find the biggest between l and r
        if (r<l) {
            int t = l;
            l = r;
            r = t;
        }
         int mod;
         mod = (l % r);
          while (mod!=0){
              l = r;
              r = mod;
              mod = l % r;
          }
          return r;              
    }
    
    ///less comund denominator of a number
    public static int lcd (int n, int m){
        int l = 1;
        for (int i=n; i>m; i--){
          if (0==(n % i)) l = i;  
        }
        return l;
    }
     
    //return k where  R(k) / n = 0
    public static int A(int n){
        int p = 1;
         while ((repunit(p) % n)!=0){
             p++;
             if (p>12) break;
         }
         return p;
    }
    
    public static void main(String[] args) {
        
        for (int i =6; i<11; i++){
            long r = repunit (i);
            System.out.print("\nfor R("+i+"): "+r+" , ");
             for (int j=91; j<1000;j++){
                 if ( ((r%j==0)) && (((j-1)%i)==0) ) System.out.print(j+ " ,");                        
             } 
        }
            
         //System.out.println("A(703)=? " + A(703));
         //System.out.println("A(41)=5? " + A(41));
         //System.out.println("A(91)=5? " + A(91));
         //System.out.println(lcd (111111,5));
         //System.out.println("41? " + lcd (11111,5));
         //System.out.println("gcd(5,7): "+ gcd(10,12));
         System.exit(1);
         
         //Scanner scan = new Scanner (System.in);
         //int L = scan.nextInt();
         //int R = scan.nextInt();            
        
         //loop over all the number in the range
         for (int i = 2; i< 6000; i++){
             //first axioma: Given that i is a positive integer and gcd(i,10)=1
             if (gcd (i,10)==1){                 
                  int a = A(i); 
                  if (a>4 & a<12) {
                  if ((i-1)%a==0) System.out.println("A( "+i+" )= " + A(i));
                  }
             }                  
         }
    }        
        
}
    

