import acm.program.*;

public class problem32 extends ConsoleProgram {
	public void run() {
		int n = 1000000;
		for(int i = 2; i < n; i++) {
			if (isPrime(i) == true) {
				println(i);
			}
		}
	}
	private boolean isPrime(int i) {
		double a = Math.sqrt(i);
		a = (int)a;
	}
}
