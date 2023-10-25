import acm.program.*;
public class problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number you want to check:  ");
		if(n == 2) {
			println("Number " + n + " is Prime");
		}
		if(n == 1) {
			println(n + " is neither Prime nor Composite");
		}
//		if((n - nonDevisors(n) == 2)) {
//			println(n + " is a prime number");
//		} else {
//			println( n +  " is Composite");
//		}
		println(nonDevisors(n));
	}
	private int nonDevisors(int n) {
		int c = 0;
		for(int i = 3; i < n - 1; i++) {
			if((n - 1) % i != 0) {
				c = c + 1;
			}
		}
		return c;
	}
}
