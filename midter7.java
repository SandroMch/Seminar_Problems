import acm.program.*;
import acm.util.RandomGenerator;

public class midter7 extends ConsoleProgram {
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int win = 0;
		int lose = 1;
		println(winOrLose(win , lose));
	}
	private boolean winOrLose(int win , int lose) {
		int gerbi = rgen.nextInt(0 , 1);
		if(gerbi == win) return true;
		return false;
		
	}
}
