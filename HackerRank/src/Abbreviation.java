import java.util.Scanner;

public class Abbreviation {

	public static void main(String[] args) {

        String a;
		String b;
		Scanner sc = new Scanner (System.in);
		
		int r=sc.nextInt();
		for (int k=0;k<r;k++){
		a = sc.next();
		a = a.toUpperCase();		
		b = sc.next();
		char[] aL = a.toCharArray();
		char[] bL = b.toCharArray();
		
		int f=0;
		int p=0;
		 for (int ib=0;ib<b.length();ib++){
			  int j=p;
			   while (j<aL.length){
				if (bL[ib]==aL[j]) {						
							f++;	
	                        p=j+1;    
	                        //System.out.println("ib: "+ib+" j:"+j);
	                        //System.out.println(bL[ib]);
	                        j=a.length()+1;							
				}else j++;					
				}			   
			}		
			if (f==b.length())
					System.out.println("YES");
			else System.out.println("NO");
			}
		
	}
}
