//https://www.hackerrank.com/challenges/30-bitwise-and?utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
public class Day29BitwiseAnd {

	public static void main(String[] args) {
		//int[] n = {955,132,178,394,773,159,928,250,730,601}; 
		//int [] k = {236,107,104,378,29,117,443,146,468,278};
		int[] n = {132}; 
		int [] k = {107};
		
		int andOp;
		
		for (int i=0;i<n.length;i++){
					
			int max = 0;
			for (int s=1;s<=n[i]-1;s++){
				for (int t=s+1;t<=n[i];t++){
					andOp = s & t;
					System.out.println (s+" & "+t+" = "+andOp);
					if ((andOp>max)&&(andOp<k[i])) max  = andOp;
				}				
			}
			System.out.println(max);
		}

	}

}
