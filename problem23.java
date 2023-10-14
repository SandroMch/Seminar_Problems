import acm.program.*;

public class problem23 extends ConsoleProgram {
	
	public void run() {
		int n = readInt("Enter number: ");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int total = sum + i;
		}
		println("Total is: " + sum);
	}
}
