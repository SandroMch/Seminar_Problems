import acm.program.*;

public class problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int a = 0;
		for(int i = 1; i < n; i++) {
			a = a + i - 1;
		}
		println(a);
	}
}
