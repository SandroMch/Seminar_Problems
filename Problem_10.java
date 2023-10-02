import stanford.karel.*;

public class Problem_10 extends SuperKarel {
	public void run() {
		move();
		while(beepersPresent()) {
			devide();
		}
		
	}
	private void devide() {
		move();
		pickBeeper();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		pickBeeper();
		turnAround();
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround();
		
	}
}
