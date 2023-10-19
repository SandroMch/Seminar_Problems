import acm.graphics.GRect;
import acm.program.*;

public class test extends GraphicsProgram {
	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		int startingPoint = getWidth() - (BRICK_WIDTH * BRICKS_IN_BASE);
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			GRect brick = new GRect(BRICK_WIDTH ,BRICK_HEIGHT);
			add(brick,startingPoint,getHeight());
		}
	}
}
