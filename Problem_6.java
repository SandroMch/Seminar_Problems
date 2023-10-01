import stanford.karel.*;

public class Problem_6 extends SuperKarel {
	public void run() {
		move();
		firstStep();
	}
	private void firstStep() {
		while(beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}
}
