import stanford.karel.*;

public class Problem_1 extends Karel {
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			move();
		}
		for(int i = 0; i < 10; i++) {
			pickBeeper();
		}
		move();
		for(int i = 0; i < 10; i++) {
			putBeeper();
		}
	}
}
