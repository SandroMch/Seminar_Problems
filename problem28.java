import acm.program.*;

public class problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		int a = 0;
		while(true) {
			int b = readInt("Enter number: ");
			a = a + b;
			if( b == SENTINEL) {
				break;
			}
		}
		int c = a/a + 1;
		println(c);
	}
}
