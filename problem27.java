import acm.program.*;

public class problem27 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter first number: ");
		int m = readInt("Enter second number: ");
		int c = 1;
		for(int i = 0; i < m; i++) {
			c = c * n;
		}
		println("n^m is: " + c);
	}
}
