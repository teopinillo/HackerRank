import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IsPrime {

	static boolean bruteForce (int n){
		for (int d=2;d<n;d++){
			if (n%d==0) {				
				return false;
			}
		}
		return true;
	}
	
	static boolean isPrime (int n){
		if (n==1)return false;
		for (long i = 2; i*i <= n; i++){
            //if divisible
            if (n % i == 0)  return false;  
            }
		return true;
	}
	
	public static void main(String[] args) {
		int test = 30;
		System.out.println("is prime :");   
		
        Scanner sc = new Scanner (System.in);
         int t = sc.nextInt();
         for (int r=0;r<t;r++){
            int n = sc.nextInt(); 
             if (isPrime(n))  
                 System.out.println("Prime");
                  else System.out.println("Not prime");	       
        }
	}

}
