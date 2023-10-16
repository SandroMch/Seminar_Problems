import acm.program.*;

public class problem23 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: "); {
			double a = (n + 1) / 2; 
			double b = a*n;
			println("Sum from 1 to n is: " + b);
		}
	}
}
