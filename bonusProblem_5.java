import stanford.karel.SuperKarel;

public class bonusProblem_5 extends SuperKarel {
	public void run() {
		setBeepersEverywhere();
	//	takeBeepersBack();
	}
	private void setBeepersEverywhere() {
		fillOneRow();
		while(leftIsClear()) {
			turnLeft();
			move();
			turnRight();
			fillOneRow();
		}
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
}
