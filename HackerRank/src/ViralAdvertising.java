import java.util.Scanner;

//https://www.hackerrank.com/challenges/strange-advertising?h_r=next-challenge&h_v=zen

public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = scan.nextInt();
		int persons = 5;
		int currentDay = 1;
		int liked = 0;
		int totalLiked = 0;
		while (currentDay <= days) {
			liked = (persons / 2);
			currentDay++;
			persons = (liked * 3);
			totalLiked += liked;
		}
		System.out.println(totalLiked);
	}

}
