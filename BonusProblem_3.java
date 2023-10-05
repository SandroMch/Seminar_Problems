import stanford.karel.SuperKarel;

public class BonusProblem_3 extends SuperKarel {
	public void run() {
		decorateWorld();
	}
	
	private void decorateWorld() {
		buildOneColumn();
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				move();
				buildOneColumn();
			}
		}
	}
	
	private void buildOneColumn() {
		turnLeft();
		putBeeper();
		for(int i = 0; i < 2; i++) {
			move();
			putBeeper();
		}
		turnRight();
		turnRight();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}
}
