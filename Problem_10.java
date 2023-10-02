import stanford.karel.*;

public class Problem_10 extends SuperKarel {
	public void run() {
		move();
		move();
		devide();
	}
	private void devide() {
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
			while(beepersPresent()) {
				pickBeeper();
				turnAround();
				move();
				putBeeper();
				turnAround();
				move();
			}
			turnAround();
			move();
			move();
			pickBeeper();
			turnAround();
			move();
			move();
			move();
			putBeeper();

			
			
			
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
