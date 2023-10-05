import stanford.karel.*;

public class Problem_Maze extends SuperKarel {
	public void run() {
		while(noBeepersPresent()) {
			goIntoMaze();
		}
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
	}
}
