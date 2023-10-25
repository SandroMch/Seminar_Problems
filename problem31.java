import acm.program.*;
public class problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number you want to check:  ");
		if(n == 2) {
			println("Number " + n + " is Prime");
		}
		if(n == 1) {
			println(n + " is neither Prime nor Composite");
		}
	}
}
