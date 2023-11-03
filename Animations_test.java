import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Animations_test extends GraphicsProgram {
	private static final int RADIUS = 50;
	private static final int Y_CONST = getHeight() / 2 - RADIUS; 
	public void run() {
		int xStart = 0;
		int xEnd = getWidth() - 2 * RADIUS; 
		
		
		GOval circle = new GOval(RADIUS * 2, RADIUS * 2);
		circle.setFilled(true);
		add(circle, 0, );
		
		
	}

}
