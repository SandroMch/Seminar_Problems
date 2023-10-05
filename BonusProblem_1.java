import stanford.karel.SuperKarel;

public class BonusProblem_1 extends SuperKarel {
	public void run() {
		if(frontIsClear()) {
			move();
		} else {
			turnAround();
			move();
		}
	}
}
