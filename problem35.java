import acm.program.*;
import acm.util.RandomGenerator;
public class problem35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int MAXSIMULATIONS = 10;
	public void run() {
		double numSimulation = 0;
		for(int i = 0; i < MAXSIMULATIONS; i++) {
			numSimulation += simulation(); 
		}
		println(numSimulation / MAXSIMULATIONS);
	}
	private int simulation() {
		int num = 0;
		while(true) {
			boolean isHeads = rgen.nextBoolean();
			num += 1;
			if(isHeads) {
				break;
			}
		}
		return num;
	}
}
