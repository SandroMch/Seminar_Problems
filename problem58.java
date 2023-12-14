import java.util.Arrays;

import acm.program.*;

public class problem58 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = readInt(); 
			}
		}
		int[] newMatrix = new int[n * n];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				newMatrix[i] = matrix[i][j];
			}
		}
		println(Arrays.toString(newMatrix));

	}

	private int[] arr(int n) {
		int[] arr = new int[n * n];
		for (int i = 0; i < n * n; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}
	
}
