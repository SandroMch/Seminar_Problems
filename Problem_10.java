import stanford.karel.*;

public class Problem_10 extends SuperKarel {
	public void run() {
		move();
		devide();
	}
	private void devide() {
		while(beepersPresent()) {
			move();
			pickBeeper();
			turnAround();
			move();
			pickBeeper();
			turnAround();
			move();
			move();
			putBeeper();
		}
	}
}
