import stanford.karel.*;

public class Problem_Maze extends SuperKarel {
	public void run() {
		while(noBeepersPresent()) {
			findWay();
		}
	}
	private void findWay() {
		if(frontIsClear()) {
			move();
		} else {
			turnLeft();
			if(frontIsClear()) {
				move();
			} else {
				turnLeft();
				if(frontIsClear()) {
					move();
				}
			}
		}
	}
}
