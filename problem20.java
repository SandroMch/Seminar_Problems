import acm.program.*;

public class problem20 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter how many numbers you want to sum: ");
		int total = 0;
		for (int i = 0; i < n; i++) {
			int a = readInt("Enter number: ");
			total = total + a;	
		}
		println("Sum of all numbers are: " + total);
	}
}
