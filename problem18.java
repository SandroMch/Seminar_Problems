import acm.program.*;

public class problem18 extends ConsoleProgram {
	public void run() {
		int a = readInt("first Number: ");
		int b = readInt("Second Number: ");
		if(a > b) {
			println(a);
		} else {
			println(b);
		}
	}	
}
