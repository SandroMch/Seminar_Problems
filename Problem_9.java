import stanford.karel.*;

public class Problem_9 extends SuperKarel {
	public void run() {
		move();
		multyplyBeepers();
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
		
	}
}
