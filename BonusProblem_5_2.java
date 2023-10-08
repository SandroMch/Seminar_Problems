import stanford.karel.SuperKarel;

public class BonusProblem_5_2 extends SuperKarel {
	public void run() {
		arrangeWidth();
		takeWitdhBack();
		arrangeLength();
		
//		takeLengthBack();
//		multiplyBeepers();
//		takeToFinalPosition();	
		
		
	}
	private void arrangeLength() {
		
	}
	private void arrangeWidth() {
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
	private void takeWitdhBack() {
		pickBeeper();
		while(frontIsClear()) {
			move();
		}
		putBeeper();
		turnAround();
		while(beepersPresent()) {
			move();
			turnAround();
			move();
		}
	}
}







