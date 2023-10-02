import stanford.karel.*;

public class Problem_10 extends SuperKarel {
	public void run() {
		move();
		devide();
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
			turnAround();
			pickBeeper();
			move();
			move();
			putBeeper();
			move();
			putBeeper();
		}
		turnAround();
		move();
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
