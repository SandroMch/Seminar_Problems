import stanford.karel.*;

public class Problem_9 extends SuperKarel {
	public void run() {
		move();
		multplyBeepers();
	}
	private void multplyBeepers() {
		while(beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
			pickBeeper();
			move();
			putBeeper();
			
		}
	}
}
