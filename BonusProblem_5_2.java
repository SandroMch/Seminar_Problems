import stanford.karel.SuperKarel;

public class BonusProblem_5_2 extends SuperKarel {
	public void run() {
		arrangeLength();
		arrangeWidth();
		takeLengthBack();
		takeWidthBack();
		multiplyBeepers();
		takeToFinalPosition();
	}
	private void arrangeLength() {
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
