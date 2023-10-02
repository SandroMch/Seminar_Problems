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
			move();
			putBeeper();
			turnAround();
			while(beepersPresent()) {
				pickBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				turnAround();
			}
			
		}
//		turnAround();
//		move();
//		while(beepersPresent()) {
//			pickBeeper();
//			move();
//			putBeeper();
//			turnAround();
//			move();
//			turnAround();
//		}
	}
}
