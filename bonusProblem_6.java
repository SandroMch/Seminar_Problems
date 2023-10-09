import stanford.karel.SuperKarel;

public class bonusProblem_6 extends SuperKarel {
	public void run() {
		move();
		move();
		for(int i = 0; i < 5; i++) {
			buildHouse();
			move();
			move();
		}
	//	drawSun();
	}

	private void buildHouse() {
		buildWalls();
//		buildDoor();
//		buildWindows();
//		buildChimney();
	}

	private void buildWalls() {
		buildLeftWall();
		buildRoof();
		buildRightWall();
	}

	private void buildLeftWall() {
		turnLeft();
		for(int i = 0; i < 8; i++) {
			putBeeper();
			move();
		}
	}	
	private void buildRoof() {
		turnRight();
		putBeeper();
		for(int i = 0; i < 6; i++) {
			move();
			putBeeper();
		}
	}
	
	private void buildRightWall() {
		
	}
	
	
	
}
