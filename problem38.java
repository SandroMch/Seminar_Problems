import acm.program.*;
import acm.util.RandomGenerator;
public class problem38 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int currMoney = 1000; 
		println("You have: " + currMoney + "$");
		while(true) {
			int roulettNum = rgen.nextInt(0 , 36);
			int betMoney = readInt("how much you want to bet: ");
			int numChoose = readInt("Choose number from 0 to 36: ");
			if(roulettNum == numChoose) {
				currMoney += 2 * betMoney;
				println("You won: " + 2* betMoney + "$" + ". You have: " + currMoney + "$");
			} else {
				currMoney -= betMoney;
				println("You lost: " + betMoney + "$" + ". You have: " + currMoney + "$");
			}
			if(currMoney == 0) {
				break;
			}
		}
	}
	
}
