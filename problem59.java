import acm.program.*;

public class problem59 extends ConsoleProgram {
	public void run() {
		int n = readInt("Column: ");
		int m = readInt("Row: ");
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = readInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				println(matrix.toString());
			}
		}
	}
}
