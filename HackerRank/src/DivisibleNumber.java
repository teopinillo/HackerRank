import java.util.ArrayList;

public class DivisibleNumber {

	
	
	public  int getDigits (int n) throws Exception {
	  ArrayList<Integer> d = new ArrayList<>();
	   int num = n;
	   int rest = 0;
	   int sum = 0;
	   int prod = 1;
	    while (num!=0){
	    	 rest=num % 10;
	    	 d.add(rest);
	    	 sum+=rest;
	    	 prod*=rest;
	    	 if (rest==0) throw new Exception ("invalid number. Has 0!");
	    	 num /= 10;
	    }	    
	    if (prod>sum) throw new Exception ("product is higher that sum!");
	    return d.size();
	}
	
	public static void main(String[] args) {
		DivisibleNumber dn = new DivisibleNumber();
		int digits;
		
		int test = 23;
		if (test==1) System.out.println(1);
		 for (int n=1; n<test; n++){
			 if ((test%n)==0){
				 try{
					 digits = dn.getDigits(n);
					 System.out.println(digits);
					 return;
				 }catch (Exception e){
					 System.out.println(e);
				 }
			 }
		 }
		
		 

	}

}
