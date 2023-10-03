import stanford.karel.*;

public class Problem_4 extends SuperKarel {
	public void run() {
		putBeeper();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
	}
}
