import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameOfThronesI {
	
	
	static int[] positions;
	static boolean[] beenHere;
	
	
	// Hiper Fast only one method
	static public boolean isPalindrome_3 (String source) {
		if (source.length()==1) return true;
		if (source.length()==0) return false;
		char[]  chars = source.toLowerCase().toCharArray();
		//26 chars in the alphabet
		int[] repChars = new int[26];
		for (int i:repChars)i=0;
		
		Arrays.sort(chars);
		 for ( char ch:chars) {			 
			 repChars[ch-97]++;
		 }
		 int odd=0;
		 for (int i:repChars){
			 if (i%2!=0) odd++;
			 if (odd>1) return false;
		 }		 
		 return true;
	}
	
	//______________________________________________________________________________________________________________
	
	static public boolean hasPair (char[] source, boolean[] marked, int index){
		 for (int i=index+1; i<source.length; i++){
             //char are ordered alphabetically, so if the next char is different then
             //stop looking because is not going to appear
             if (source[index]!=source[i]) return false;
			 if (!marked[i]){
				 marked[i]=true;
				 return true;
			 }
		 }
		 return false;
	}
	
	//faster version, only use one more method
	static public boolean isPalindrome2 (String source){
		if (source.length()==1) return true;
		if (source.length()==0) return false;
		
		char[]  chars = source.toLowerCase().toCharArray();
		Arrays.sort(chars);
		System.out.println(chars);
		boolean[] marks = new boolean[source.length()]; 
		for (boolean b:marks) b=false;	
		int s = source.length();
		for (int i=0;i<source.length();i++){
			if ( (!marks[i]) && (hasPair(chars, marks, i))) s=s-2;
		}
		if (s<2) return true;  // 0 or 1
		return false;
	}
	
	//____________________________________________________________________________________________________________________
	
	static public boolean isPalindrome (String source){
     int l = source.length();		
	 char[] forward = source.toLowerCase().toCharArray();
	 char[] backward = new char [l];
	 int j=0;
	  for (int i = l-1;i>-1;i--){
		  backward[j++]=forward[i];
	  }
	  return source.equals( new String(backward));
	}
	
	static public void setPositions (String phrase){
	  int l = phrase.length();
	  positions = new int [l];	  
	  beenHere = new boolean [l];
	    for (int i=0; i<l;i++){
	    	positions[i]=i;		    	
	    }	 	   
	}
	
	
	
	static boolean validPositions(){
     int l = positions.length;		
	 for (int i=0; i<l-1;i++)
		 for (int j=i+1;j<l;j++){
			 if (positions[i]==positions[j]) return false;
		 }
	 return true;
	}
	
	static public int movePos (int last, int iPos){
		int exitCode = iPos;
		if ((positions[0]==last) && (iPos==0) )return -1;
		  positions[iPos]++;
		  if (positions[iPos]>last) {
			  positions[iPos]=0;
			  iPos--;
			  exitCode = movePos (last,iPos);
		  }
		return exitCode;
	}
	
	static public String getString (String source ){
		String result="";
		if (validPositions()){
		   for (int i=0; i<source.length(); i++){			    				 
					 result+=source.charAt(positions[i]);					
		   }
		}
	  return result;
	}
	
	public static void main(String[] args) {
		
		 //level, noon, civic, radar, rotor,kayak,reviver, racecar, redder, madam, refer
		String inputString = "madam";
		System.out.println( inputString + " is palindrome? -"+ isPalindrome_3(inputString));
		System.exit(0);
		int datalen = inputString.length();	
		setPositions (inputString);
		int mp = 0;		
		while ( mp > -1 ){
			if (true) {
			String result = getString(inputString);
			 if (result!="") {
				 System.out.print(result );
				 if (isPalindrome(result)) {
					 System.out.println("--->Palindrome");
					 //return;
				 }else {
					 System.out.println();
				 }
			 }
			}
			mp = movePos (datalen - 1, datalen - 1);
		}

	}

}
