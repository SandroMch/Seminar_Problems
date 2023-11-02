import stanford.karel.SuperKarel;

public class karel extends SuperKarel {
	public void run() {
		turnAround();
		while(beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();		
		}
	}
}
