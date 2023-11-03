import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Animations_test extends GraphicsProgram {
	private static final int RADIUS = 50;
	public void run() {
		GOval circle = new GOval(RADIUS * 2, RADIUS * 2);
		circle.setFilled(true);
		add(circle, 0, getHeight() / 2 - RADIUS);
	}

}
