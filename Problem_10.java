import stanford.karel.*;

public class Problem_10 extends SuperKarel {
	public void run() {
		move();
		devide();
	}
	private void devide() {
		while(beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			if(beepersPresent()) {
				pickBeeper();
			}
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}
}
