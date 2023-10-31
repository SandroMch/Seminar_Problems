import acm.program.*;
import acm.util.RandomGenerator;
public class problem35 extends ConsoleProgram {
	public void run() {
		int c = 0;
		int head = 1;
		int tails = 2;
		RandomGenerator rgen = RandomGenerator.getInstance();
		for(int i = 0; i < 10000; i++) {
			double random = rgen.nextInt(head,tails);
			if(random == head) {
				c = c + 1;
			}
		}
		println(c);
		println("average head: " + (c / 10000));
	}
}
