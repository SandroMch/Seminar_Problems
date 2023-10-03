import stanford.karel.*;

public class Problem_6 extends SuperKarel {
	public void run() {
		move();
		firstStep();
		move();
		secondStep();
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
	private void secondStep() {
		while(beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
	}
}
