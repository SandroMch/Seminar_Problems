import java.util.Arrays;

import acm.program.*;

public class problem58 extends ConsoleProgram {
	public void run() {
		int n = 5;
		int[][] matrix = new int[n][n];
		int [] arr = new int[n * n];
		for(int i = 0; i < n * n; i++) {
			arr[i] = i + 1;
		}
		println(Arrays.toString(arr));
	}
}
