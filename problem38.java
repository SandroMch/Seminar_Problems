import acm.program.*;
import acm.util.RandomGenerator;
public class problem38 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int currMoney = 1000;
		int betMoney = readInt("How much you want to bet: ");
		int numChoose = readInt("Choose number from 0 to 36: ");
		int roulettNum = rgen.nextInt(0 , 36); 
		println(currMoney);
		while(currMoney != 0) {
			if(winLose(numChoose, roulettNum) == true) {
					currMoney += betMoney;
					println("roulette number is: " + roulettNum);
					println("Your number won  and you have: " + currMoney);
			} else {
				currMoney -= betMoney;
				println("roulette number is: " + roulettNum);
				println("Your number lost  and you have: " + currMoney);
			}
		}
	}
	private boolean winLose(int numChoose , int roulettNum) {
		if(numChoose == roulettNum) {
			return true;
		}
		return false;
	}
}
