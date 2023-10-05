import stanford.karel.*;

public class Problem_Maze extends SuperKarel {
	public void run() {
		goIntoMaze();
		findWay();
		
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
		while(frontIsBlocked()) {
			turnLeft();
		}
	}
}
