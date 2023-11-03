import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Animations_test extends GraphicsProgram {
	private static final int RADIUS = 50;

	public void run() {
		int xStart = 0;
		int xEnd = getWidth() - 2 * RADIUS; 
		
		int yConst = getHeight() / 2 - RADIUS; 
		
		GOval circle = new GOval(RADIUS * 2, RADIUS * 2);
		circle.setFilled(true);
		add(circle, 0, yConst);
		
		while (xStart != xEnd) {
			circle.setLocation(xStart + 1, yConst);
			pause(10);
			xStart++;
			
			if (xStart == xEnd) {
				xEnd = 2 * RADIUS;
				while (xStart != xEnd) {
					circle.setLocation(xStart - 1, yConst);
				}
			}
			
		}
		
		
	}

}
