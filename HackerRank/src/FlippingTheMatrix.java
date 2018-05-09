import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FlippingTheMatrix {

	public void printMatrix(int[][] m) {
		int n = m.length;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(m[row][col] + " ");
			}
			System.out.println();
		}
	}

	void printCell(int[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

	public static void main(String[] args) {

		FlippingTheMatrix flipping = new FlippingTheMatrix();
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		for (int r = 0; r < q; r++) {
			int half = scanner.nextInt();

			int n = half * 2;
			int[][][] permut = new int[half][half][4];
			int[][] matrix = new int[n][n];
			for (int row = 0; row < n; row++) {
				for (int col = 0; col < n; col++) {
					int v = scanner.nextInt();
					matrix[row][col] = v;
				}
			}

			scanner.close();
			flipping.printMatrix(matrix);
			System.out.println();

			// left-top matrix
			for (int row = 0; row < half; row++) {
				for (int col = 0; col < half; col++) {
					permut[row][col][0] = matrix[row][col];
				}
			}

			// right-top matrix
			for (int row = 0; row < half; row++) {
				int p = n - 1;
				for (int col = 0; col < half; col++) {
					permut[row][col][1] = matrix[row][p - col];
				}
			}

			// left-bottom matrix
			for (int col = 0; col < half; col++) {
				int p = n - 1;
				for (int row = 0; row < half; row++) {
					permut[row][col][2] = matrix[p - row][col];
				}
			}

			// right-bottom
			for (int row = 0; row < half; row++) {
				int p = n - 1;
				for (int col = 0; col < half; col++) {
					permut[row][col][3] = matrix[p - row][p - col];
				}
			}

			for (int col = 0; col < half; col++) {
				for (int row = 0; row < half; row++) {
					flipping.printCell(permut[row][col]);
					System.out.println();
				}
			}

			int t = 0;
			for (int col = 0; col < half; col++) {
				for (int row = 0; row < half; row++) {
					Arrays.sort(permut[col][row]);
					t += permut[col][row][3];
				}
			}

			for (int col = 0; col < half; col++) {
				for (int row = 0; row < half; row++) {
					flipping.printCell(permut[col][row]);
					System.out.println();
				}

			}

			System.out.println(t);

		}

	}

}
