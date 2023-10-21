import acm.program.*;

public class problem27 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter first number: ");
		int m = readInt("Enter second number: ");
		int c = n ^ m;
		println(c);
	}
}
