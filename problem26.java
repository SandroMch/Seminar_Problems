import acm.program.*;

public class problem26 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter first number: ");
		int b = readInt("Enter second number: ");
		int multiplication = a * b;
		int USG = multiplication / USJ(a,b);
		println(USG);
	}
	private int lowerNum(int a , int b) {
		if(a < b) {
			return a;
		}
		return b;
	}
	private int higherNum(int a , int b) {
		if(a > b) {
			return a;
		}
		return b;
	}
	private int USJ(int a , int b) {
		int c = 0;
		c = 0 + lowerNum(a , b);
		while(c % higherNum(a , b) != 0) {
			c = c + lowerNum(a,b);
		}
		return c;
	}
}
