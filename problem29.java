import acm.program.*;

public class problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int firstNum = 0;
		int secondNum = 1;
		int last;
		if(n == 1) {
			println(firstNum);
		} 
		for(int i = 0; i <= n; i++) {
			last = firstNum + secondNum;
		}
	}
}
