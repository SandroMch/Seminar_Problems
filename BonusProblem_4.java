import stanford.karel.SuperKarel;

public class BonusProblem_4 extends SuperKarel {
	public void run() {
		for(int i = 0; i < 8; i++ ) {
			runOneLap();
		}
	}
	private void runOneLap() {
		for (int i = 0; i < 4; i++ ) {
			runSide();
			turnLeft();
		}
	}
	private void runSide() {
		while(frontIsClear()) {
			move();
		}
		putBeeper();
	}
}
