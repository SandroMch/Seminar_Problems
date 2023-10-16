import acm.program.*;

public class problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		for(int i = 0; i < n; i++) {
			if((n % i !=0)) {
				println(i);
			}
		}
	}
}
