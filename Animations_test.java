import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Animations_test extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int RADIUS = 50;
	
	
	public void run() {
		int width = getWidth();
		int height = getHeight();
		int xCoordinate = rgen.nextInt(0, width - 2 * RADIUS);
		int yCoordinate = rgen.nextInt(0, height - 2 * RADIUS);
		int xSpeed = 1;
		int ySpeed = 1;
		
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setFillColor(rgen.nextColor());
		add(circle, xCoordinate, yCoordinate);
		
		while (true) {
			if (xCoordinate == width - 2 * RADIUS || xCoordinate == 0) {
				xSpeed *= -1;
				circle.setFillColor(rgen.nextColor());
			}
			
			if (yCoordinate == height - 2 * RADIUS || yCoordinate == 0) {
				ySpeed *= -1;
				circle.setFillColor(rgen.nextColor());
			}
			
			xCoordinate += xSpeed;
			yCoordinate += ySpeed;
			circle.setLocation(xCoordinate, yCoordinate);

			pause(1);
		}
		
	}
}