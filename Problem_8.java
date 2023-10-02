import stanford.karel.*;

public class Problem_8 extends SuperKarel {
	public void run() {
		move();
		move();
	}
	private void Substraction() {
		while(beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			pickBeeper();
			turnAround();
			move();
		}
	}
}
