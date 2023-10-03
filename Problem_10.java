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
			pickBeeper();
			turnAround();
			move();
		}
	}
}
