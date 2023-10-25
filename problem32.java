import acm.program.*;
public class problem32 extends ConsoleProgram {
	public void run() {
		println(2);
		println(3);
		int n = 1000000;
	}
	private int findPrimes(int n) {
		int c = 0;
		for(int i = 1; i < n; i++) {
			if(n % i !=0) {
				c = c + 1;
			}
			if((n - c) == 2) {
				return i;
			}
		}
	}
}
