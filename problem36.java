import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
public class problem36 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUMSIMULATIONS = 10000;
	public void run() {
		double flipCounter = 0;
		for(int i = 0; i < NUMSIMULATIONS; i++) {
			flipCounter += flipNums();
		}
		println(flipCounter/NUMSIMULATIONS);
	}
	
	private int flipNums() {
		int num = 0;
		int headNum = 0;
		while(true) {
			boolean isHeads = rgen.nextBoolean();
			num += 1;
			if(isHeads) {
				headNum += 1;
			} else {
				headNum = 0;
			}

		}
		return num;
	}
}
