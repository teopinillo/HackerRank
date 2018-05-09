

import java.util.Scanner;

/**
 *
 * @author tfrancisco
 */
public class CandyReplenishingRobot {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        int candies=n;
        int refill=0;
        for (int time=0; time<t-1;time++){
            System.out.print (candies+" - "+c[time]);
          candies-=c[time];
          if (candies<5) {
              refill+=(n-candies);
              candies = n;     
              System.out.print(" refill: "+refill);
          }
          System.out.println();
        }
        System.out.println (refill);
        
    }
    
}
