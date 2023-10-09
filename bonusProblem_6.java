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

	private void drawSun() {				//this method builds the sun
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

	private void buildHouse() {				//this method builds whole house 
		buildWalls();
		buildDoor();
		buildWindows();
		buildChimney();
		buildRoof();
		finishBuilding();
	}

	private void finishBuilding() {		// after house is built this method makes karel to stand
		turnLeft();						//at the right corner of the house
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

	private void buildRoof() {			//this method builds roof
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

	private void goDown() {			//I used this method to place beepers as a roof
		move();
		turnLeft();
		move();
		turnRight();
	}

	private void goUp() {			//I used this method to place beepers as a roof
		move();
		turnRight();
		move();
		turnLeft();
	}

	private void buildChimney() {			//this method builds chimney
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

	private void buildWindows() {		//this method builds windows
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

	private void buildDoor() {		//this method builds door
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

	private void buildWalls() {				//this method builds walls  left and right
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
	private void buildUpWall() {			//this method builds bottom side of the roof 
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
