import acm.program.*;
import acm.util.RandomGenerator;
public class problem38 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int currMoney = 1000;
		int betMoney = readInt("How much you want to bet: ");
		int numChoose = readInt("Choose number from 0 to 36: ");
		int roulettNum = rgen.nextInt(0 , 36); 
		if(winLose(numChoose, roulettNum) == true) {
				currMoney += betMoney;
				println("Your number won roulette and you have: " + currMoney);
		} else {
			currMoney -= betMoney;
			println("Your number lost roulette and you have: " + currMoney);
		}
	}
	private boolean winLose(int numChoose , int roulettNum) {
		if(numChoose == roulettNum) {
			return true;
		}
		return false;
	}
}
