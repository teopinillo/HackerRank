import java.math.BigInteger;
import java.util.Scanner;

public class Kaprekar {

 public static boolean isKaprekar (int n){
		if (n==1) return true;		
		long left = 0;
		long right = 0;
		BigInteger po = new BigInteger (Integer.toString(n));
		po=po.multiply(po);
		//convierto el numero en String
		String strN = Integer.toString(n);
		//convierto la potencia en String
	    String strPo = po.toString();
		//calculo d
		int d = strN.length();
		//el lado derecho debe ser d o d-1
		int div = d-1;
		int dPo = strPo.length();
		
		 while (div <= d ){
			 String strLeft = strPo.substring(0, dPo-div);
			 String strRight = strPo.substring(dPo-div);			 
			 //System.out.println( strLeft+" : "+ strRight);
			 if  ((strLeft.length()==d) || (strLeft.length()==d-1)) {
				 if (strRight.length()==d)
				 try{
				 left = Integer.parseInt(strLeft);				  
				 right = Integer.parseInt(strRight);
				  } catch (java.lang.NumberFormatException E) {
					  left = 0;
					  right = 0;
				  }
				 //System.out.println(left+right);
				 if ( ((left+right)==n) && (right>0) ) {	
					 //System.out.print(strLeft+" + "+strRight+" ->"); 
					 return true;
				 }
			 }
			div++;					 
		 }
	 return false;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
        int st = sc.nextInt();
        int en = sc.nextInt();
         for (int i=st;i<=en;i++){
             if (isKaprekar(i)) System.out.print(i+" ");
         }

	}
}

