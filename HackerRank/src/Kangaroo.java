import java.util.Scanner;

//https://www.hackerrank.com/challenges/kangaroo
public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        String result="NO";
        if (v1==v2) {
        	if (x1==x2) result = "YES";
        } else{
        	int p = (x1-x2)/(v2-v1);
        	int m = (x1-x2)%(v2-v1);
        	if ((p>0)&&(m==0)) result="YES";        	
           }
        System.out.println(result);
        }
	}


