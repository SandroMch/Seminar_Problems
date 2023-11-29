import acm.program.*;
import acm.util.RandomGenerator;

public class midter7 extends ConsoleProgram {
	RandomGenerator rgen = RandomGenerator.getInstance();
	int startingMoney = 20;
	public void run() {
		int win = 0;
		int lose = 1;
		startingMoney = 20;
		startPlaying(win,lose);
		
	}
	 private void startPlaying(int win , int lose) {
		 while(startingMoney <= 0) {
			 if(winOrLose(win,lose)) {
				 startingMoney+=3;
			 }else {
				 startingMoney-=2;
			 }
		 }
	 }
	
	private boolean winOrLose(int win , int lose) {
		int gerbi = rgen.nextInt(0 , 1);
		if(gerbi == win) return true;
		else {
			return false;
		}
	}
}
