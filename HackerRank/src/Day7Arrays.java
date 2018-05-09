import java.util.Scanner;

public class Day7Arrays {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for (int i=n-1;i>=0;i--){
        	System.out.println(arr[i]+" ");
        in.close();
    }

	}

}
