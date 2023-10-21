import acm.program.*;

public class problem25 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter first number: "); 
		int b = readInt("Enter second number: ");
		lowerNum(a , b);
		int c = 0;
		c = c + lowerNum(a,b);
		while (c % higherNum(a,b) !=0) {
			c = c + lowerNum(a,b);
		}
		println(c);
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
	
}
