import acm.program.*;
import acm.util.RandomGenerator;
public class problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int n = readInt("Choose number from 0 to 36: ");
		int a = rgen.nextInt(0,36);
		println(a);
		if(n==a) {
			println("You won ");
		} else {
			println("You lost: ");
		}
	}
}
