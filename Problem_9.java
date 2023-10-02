import stanford.karel.*;

public class Problem_9 extends SuperKarel {
	public void run() {
		move();
		while(beepersPresent()) {
			multyplyBeepers();
		}
		move();
		while(beepersPresent()) {
			pickBeeper();
		}
	}
	private void multyplyBeepers() {
		while(beepersPresent()) {
			pickBeeper();
			move();
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
			while(beepersPresent()) {
				pickBeeper();
				move();
				putBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				turnAround();
			}
		}
		move();
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
		turnAround();
		move();
		move();
		move();
		turnAround();
	}
}
