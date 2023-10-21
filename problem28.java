import acm.program.*;

public class problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		int c = 0;
		while(true) {
			int b = readInt("Enter number: ");
			if(b % 2 !=0) {
				c = c +0;
			} else {
				c = c + 1;
			}
			if( b == SENTINEL) {
				break;
			}
		}
		println("Quantity of even numbers are: " + c);
	}
}
