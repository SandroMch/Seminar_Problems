import stanford.karel.*;

public class Problem_Maze extends SuperKarel {
	public void run() {
		while(noBeepersPresent()) {
			findWay();
		}
	}
	private void findWay() {
		while(frontIsClear()) {
			move();
			if(frontIsBlocked()) {
				turnLeft();
			}
		}
	}
}
