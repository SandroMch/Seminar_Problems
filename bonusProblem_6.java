import stanford.karel.SuperKarel;

public class bonusProblem_6 extends SuperKarel {
	public void run() {
		move();
		move();
		buildHouse();
//		for(int i = 0; i < 5; i++) {
//			buildHouse();
//			move();
//			move();
//		}
	//	drawSun();
	}

	private void buildHouse() {
		buildWalls();
		buildDoor();
//		buildWindows();
//		buildChimney();
	}

	private void buildDoor() {
		turnRight();
		move();
		move();
		turnRight();
		putBeeper();
		for(int i = 0; i < 3; i++) {
			move();
			putBeeper();
		}
		turnLeft();
		move();
		putBeeper();
		move();
		putBeeper();
		turnLeft();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
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
		turnRight();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
	}
	
	
	
}
