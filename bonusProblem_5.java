import stanford.karel.SuperKarel;

public class bonusProblem_5 extends SuperKarel {
	public void run() {
		setBeepersEverywhere();
		gatherOneRow();
	}
	private void setBeepersEverywhere() {
		fillOneRow();
		while(leftIsClear()) {
			turnLeft();
			move();
			turnRight();
			fillOneRow();
		}
		turnRight();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}
	private void fillOneRow() {
		putBeeper();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnAround();
	}
	private void gatherOneRow() {
		while(frontIsClear()) {
			pickBeeper();
			while(frontIsClear()) {
				move();
			}
			putBeeper();
			turnAround();
			while(beepersPresent()) {
				move();
			}
			turnAround();
			move();
		}
	}
}







