import stanford.karel.*;

public class Problem_7 extends SuperKarel {
	public void run() {
		while(leftIsClear()) {
			fillRow();
		}
		if(leftIsBlocked()) {
			fillLastRow();
		}
		
	}
	private void fillRow() {
		if(noBeepersPresent()) {
			putBeeper();
		}
		while(frontIsClear()) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			}
		}
		turnLeft();
		if(frontIsClear()) {
			move();
		}
		turnLeft();
		if(noBeepersPresent()) {
			putBeeper();
		} 
		while(frontIsClear()) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			}
		}
		turnRight();
		if(frontIsClear()) {
			move();
		}
		turnRight();
	}
	private void fillLastRow() {
		if(noBeepersPresent()) {
			putBeeper();
		}
		while(frontIsClear()) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			}
		}
	}
}
