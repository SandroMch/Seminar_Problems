import stanford.karel.SuperKarel;

public class bonusProblem_5 extends SuperKarel {
	public void run() {
		setBeepersEverywhere();
		gatherAllRows();
		takeBeepersBack();
	}
	private void takeBeepersBack() {			//and this last method takes all the beepers to the 1x1
		while(beepersPresent()) {				// after last command we gatherd beepers at the last 
			pickBeeper();						// right column so we take this gathered beepers one by one
			turnAround();
			while(frontIsClear()) {
				move();
			}
			turnLeft();
			while(frontIsClear()) {
				move();
			}
			putBeeper();
			turnAround();
			while(frontIsClear()) {
				move();
			}
			turnRight();
			while(frontIsClear()) {
				move();
			}
			if(noBeepersPresent()) {
				turnRight();
				while(noBeepersPresent()) {
					if(frontIsClear()) {
						move();
					}
				}
				turnLeft();
			}
		}
	}
	private void gatherAllRows() {              //we have beepers everywhere so this method will gather 
		gatherOneRow();                         // beepers in their row's "corner" for example 
		while(leftIsClear()) {                  // row 1 's beepers will go at the end of row 1 
			turnLeft();
			move();
			turnRight();
			gatherOneRow();
		}
		while(frontIsClear()) {
			move();
		}
	}
	private void setBeepersEverywhere() {        //populates whole world with beepers
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
	private void gatherOneRow() {					// this method takes beepers at the end of row 
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
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnAround();
	}
}







