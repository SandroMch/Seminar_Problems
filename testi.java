import stanford.karel.*;

public class testi extends SuperKarel {
	public void run() {
		firstStep();
		while(frontIsClear()) {
			secondStep();
			
		
}	
}		
	
	
	private void firstStep() {
		putBeeper();
		while(frontIsClear()) {
			move();
		}
		putBeeper();
		turnAround();
		pickBeeper();
		if(frontIsClear()) {
			move();
		}
		putBeeper();
		while(frontIsClear()) {
			move();
		}
		turnAround();
		pickBeeper();
		if(frontIsClear()) {
			move();
		}
		putBeeper();
		if(frontIsClear()) {
		move();
		}
	}
	private void secondStep() {
		while(noBeepersPresent()) {
			if(frontIsClear()) {
				move();
			}
		}
		turnAround();
		pickBeeper();
		if(frontIsClear()) {
			move();
		}
		if(noBeepersPresent()) {
			putBeeper();
		}
		if(frontIsClear()) {
			move();
		}
		while(noBeepersPresent()) {
			if(frontIsClear()) {
			move();
			}
		}
		pickBeeper();
		turnAround();
		if(frontIsClear()) {
			move();
		}
		if(noBeepersPresent()) {
			putBeeper();
		}
		if(frontIsClear()) {
		move();
		}
	}
		
}
	

