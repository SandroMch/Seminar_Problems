import stanford.karel.SuperKarel;

public class BonusProblem_5_2 extends SuperKarel {
	public void run() {
		arrangeWidth();
//		arrangeLength();
		takeWitdhBack();
//		takeLengthBack();
//		multiplyBeepers();
//		takeToFinalPosition();	
		
		
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
		move();
		putBeeper();
		move();
		pickBeeper();
		turnAround();
		move();
		putBeeper();
		turnAround();
		move();
		while(noBeepersPresent()) {
			move();
		}
		if(beepersPresent()) {
			pickBeeper();
			turnAround();
		}
	}
}







