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
			while(beepersPresent()) {
				pickBeeper();
				turnAround();
				move();
				putBeeper();
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
