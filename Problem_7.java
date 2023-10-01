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
	private void fillRow() {			//This method fills first row than goes up and fills 
		if(noBeepersPresent()) {		//second row like a snake 
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
	private void fillLastRow() {		//if height number is odd and after filling one row 
		if(noBeepersPresent()) {		//karel can't go up it uses this method to fill last Row
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
