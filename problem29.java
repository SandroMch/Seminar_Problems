import acm.program.*;

public class problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int firstNum = 0;
		int secondNum = 1;
		int last = 0;
		if(n == 1) {
			last = 0;
		} 
		if(n == 2) {
			last = 1;
		}
		for(int i = 3; i <= n; i++) {
			last = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = last;
			
		}
		println("n'th member = " +last);
	}
}
