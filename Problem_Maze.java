import stanford.karel.*;

public class Problem_Maze extends SuperKarel {
	public void run() {
		while(noBeepersPresent()) {
			if(rightIsClear()) {
				turnRight();
			}else {
				while(frontIsBlocked()) {
					turnLeft();
				}
			}
			move();
		}
	}
}
