import java.util.Scanner;

//https://www.hackerrank.com/challenges/the-hurdle-race
public class TheHurdlerace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
       java.util.Arrays.sort (height);
       int r=0;
       if (k<height[n-1]) r = height[n-1]-k;
       System.out.println(r);
	}

}
