import stanford.karel.*;

public class Problem_9 extends SuperKarel {
	public void run() {
		move();
	}
	private void multplyBeepers() {
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
	}
}
