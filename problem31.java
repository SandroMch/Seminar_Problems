import acm.program.*;
public class problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number you want to check:  ");
		if(n == 1) {
			println(n + " is neither Prime nor Composite");
		}
		if((n - nonDevisors(n) == 2)) {
			println(n + " is a prime number");

		}
		if((n - nonDevisors(n) > 2)) {
			println(n + " is a composite number");

		}
	}
	private int nonDevisors(int n) {
		int c = 0;
		for(int i = 1; i < n; i++) {
			if(n % i != 0) {
				c = c + 1;
			}
		}
		return c;
	}
}
