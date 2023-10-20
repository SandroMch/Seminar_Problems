import acm.program.*;

public class problem25 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter first number: "); 
		int b = readInt("Enter second number: ");
		lowerNum(a , b);
		int c = a * b;
		int d = 0;
		for(int i = 2; i < lowerNum(a,b); i++) {
			d = d + c/i ; 
		}
		if(d % a !=0) {
			
		}
	}

	private int lowerNum(int a , int b) {
		if(a < b) {
			return a;
		}
		return b;
	}
}
