import stanford.karel.*;

public class Problem_Maze extends SuperKarel {
	public void run() {
		while(noBeepersPresent()) {
			findWay();
		}
	}
	private void findWay() {
		while(leftIsBlocked()) {
			move();
		}
		if(leftIsClear()) {
			while(frontIsClear()) {
				move();
			}
		}
	}
}
