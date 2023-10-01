import stanford.karel.*;

public class Problem_7 extends SuperKarel {
	public void run() {
		fillRow();
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
	}
}
