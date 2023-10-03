import stanford.karel.*;

public class Problem_10 extends SuperKarel {
	public void run() {
		move();
		while(beepersPresent()) {
			devide();
			moveBeepers();
		}
	}
	private void devide() {
		move();
		while(beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			pickBeeper();
			turnAround();
			move();
		}
	}
	private void moveBeepers() {
		move();
		while(beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
		}
		move();
		putBeeper();
		turnAround();
		move();
		move();
		move();
		turnAround();
	}
 }
