import stanford.karel.*;

public class Problem_Maze extends SuperKarel {
	public void run() {
		while(noBeepersPresent()) {
			findWay();
		}
	}
	private void findWay() {
		while(leftIsBlocked()) {
			if(frontIsClear()) {
				move();
			}
			turnLeft();
			if(frontIsBlocked()) {
				while(frontIsBlocked()) {
					turnLeft();
					if(frontIsClear()) {
						move();
					}
				}
			} else {
				while(frontIsClear()) {
					move();
				}
			}
		}
	}
}
