import stanford.karel.Karel;

public class Problem_3 extends Karel {
	public void run() {
		while(frontIsClear()) {
			move();
		}
	}
}
