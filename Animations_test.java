import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Animations_test extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int RADIUS = 50;

	public void run() {
		int xStart = 0;
		int xEnd = getWidth() - 2 * RADIUS; 
		
		int yConst = getHeight() / 2 - RADIUS; 
		
		GOval circle = new GOval(RADIUS * 2, RADIUS * 2);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle, 0, yConst);
		
		GLabel bounceCount = new GLabel("Bounce Count:");
		
		while (xStart != xEnd) {
			circle.setLocation(xStart + 1, yConst);
			pause(1);
			xStart++;
			
			if (xStart == xEnd) {
				circle.setColor(rgen.nextColor());
				xEnd = 0;
				while (xStart != xEnd) {
					circle.setLocation(xStart - 1, yConst);
					pause(1);
					xStart--;
				}
				circle.setColor(rgen.nextColor());
				xEnd = getWidth() - 2 * RADIUS; 
			}
		}
		
		
	}

}
