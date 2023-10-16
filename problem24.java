import acm.program.*;

public class problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int a = 0;
		for(int i = 1; i < n; i++) {
			if((n %i != 0)) {
				 a = a + 1;
			}
			println(a);
		}
	}
}
