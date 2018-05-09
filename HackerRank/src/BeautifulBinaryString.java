import java.util.Scanner;

//https://www.hackerrank.com/challenges/beautiful-binary-string?h_r=next-challenge&h_v=zen

public class BeautifulBinaryString {
	
	public static void main(String[] args) {
		int n;
		String B;
		Scanner scanner = new Scanner (System.in);
		n = scanner.nextInt();
		B = scanner.next();	
		System.out.println((B.length() - B.replaceAll("010", "").length())/3);
	}

}
