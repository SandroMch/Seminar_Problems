import acm.program.*;

public class problem18 extends ConsoleProgram {
	public void run() {
		int a = readInt("first Number: ");
		int b = readInt("Second Number: ");
		if(a > b) {
			println("Higher number is: " + a);
		} else {
			println(b);
		}
	}	
}
