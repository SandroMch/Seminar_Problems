import stanford.karel.SuperKarel;

public class bonusProblem_5 extends SuperKarel {
	public void run() {
		setBeepersEverywhere();
		gatherAllRows();
		takeBeepersBack();
	}
	private void takeBeepersBack() {
		while(beepersPresent()) {
			pickBeeper();
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
					move();
				}
				turnLeft();
			}
		}
	}
	private void gatherAllRows() {
		gatherOneRow();
		while(leftIsClear()) {
			turnLeft();
			move();
			turnRight();
			gatherOneRow();
		}
		while(frontIsClear()) {
			move();
		}
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
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnAround();
	}
}







