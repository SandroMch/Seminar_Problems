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
		drawSun();
	}

	private void drawSun() {
		while(frontIsClear()) {
			move();
		}
		turnLeft();
		for(int i = 0; i < 17; i++) {
			move();
		}
		turnLeft();
		putBeeper();
		for(int i = 0; i < 8; i++) {
			move();
			putBeeper();
		}
		turnRight();
		move();
		move();
		turnRight();
		for(int i = 0; i < 3; i++) {
			move();
			move();
			putBeeper();
		}
		turnAround();
		move();
		move();
		turnLeft();
		move();
		turnRight();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
		move();
		for(int i = 0; i < 4; i++) {
			move();
			putBeeper();
		}
		turnRight();
		move();
		move();
		turnRight();
		move();
		move();
		putBeeper();
		move();
		turnRight();
		move();
		putBeeper();
		move();
		move();
		putBeeper();
		turnRight();
		move();
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnRight();
		move();
		move();
		move();
		putBeeper();
	}

	private void buildHouse() {
		buildWalls();
		buildDoor();
		buildWindows();
		buildChimney();
		buildRoof();
		finishBuilding();
	}

	private void finishBuilding() {
		turnLeft();
		move();
		turnLeft();
		while(beepersPresent()) {
			move();
		}
		turnRight(); 
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}

	private void buildRoof() {
		turnAround();
		move();
		turnRight();
		move();
		putBeeper();
		goUp();
		putBeeper();
		goDown();
		putBeeper();
		goDown();
		putBeeper();
	}

	private void goDown() {
		move();
		turnLeft();
		move();
		turnRight();
	}

	private void goUp() {
		move();
		turnRight();
		move();
		turnLeft();
	}

	private void buildChimney() {
		for(int i = 0; i < 3; i++) {
			move();
		}
		turnRight();
		move();
		move();
		turnLeft();
		for(int i = 0; i < 3; i++) {
			move();
			putBeeper();
		}
	}

	private void buildWindows() {
		turnAround();
		for(int i = 0; i < 6; i++) {
			move();
		}
		turnRight();
		move();
		putBeeper();
		move();
		putBeeper();
		turnRight();
		move();
		putBeeper();
		turnRight();
		move();
		putBeeper();
		turnRight();
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
		buildUpWall();
		buildRightWall();
	}

	private void buildLeftWall() {
		turnLeft();
		for(int i = 0; i < 8; i++) {
			putBeeper();
			move();
		}
	}	
	private void buildUpWall() {
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
