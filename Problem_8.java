import stanford.karel.*;

public class Problem_8 extends SuperKarel {
	public void run() {
		move();
		move();
		substraction();
		moveBeepers();
	}
	private void substraction() {
		while(beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			pickBeeper();
			turnAround();
			move();
		}
	}
	private void moveBeepers() {
		turnAround();
		move();
		while(beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
		}
	}
}
