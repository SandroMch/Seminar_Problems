import stanford.karel.*;

public class Problem_Maze extends SuperKarel {
	public void run() {
		goIntoMaze();
	}
	private void goIntoMaze() {
		while(leftIsBlocked()) {
			if(frontIsClear()) {
				move();
			}
		}
		turnLeft();
		if(frontIsClear()) {
			move();
		}
		turnRight();
	}
	private void findWay() {
		while(frontIsClear()) {
			move();
		}
	}
}
