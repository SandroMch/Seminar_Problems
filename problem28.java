import acm.program.*;

public class problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		int a = 0;
		int c = 0;
		while(true) {
			int b = readInt("Enter number: ");
			a = a + b;
			c = a/a + 1;
			if( b == SENTINEL) {
				break;
			}
		}
		println(c);
	}
}
