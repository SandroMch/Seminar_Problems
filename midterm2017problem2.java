import acm.program.*;

public class midterm2017problem2 extends ConsoleProgram {
	public void run() {
		int x = readInt();
		if(x == 1) {
			println("1 is not a prime or a composite");
		}
		if(x != 1) {
			println(isPrime(x));
		}
	}
	private boolean isPrime(int x) {
		double root = Math.sqrt(x);
		if(x == 2) return true;
		for(int i = 2; i <= root + 1; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
