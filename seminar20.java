import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class seminar20 extends GraphicsProgram {
	GOval ball;
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int radius = rgen.nextInt(60, 150);
		int diameter = 2 * radius;
		double spawnPointX = rgen.nextDouble(0, getWidth() - diameter);
		double spawnPointY = rgen.nextDouble(0 , getHeight() - diameter);
		ball = new GOval(diameter,diameter);
		add(ball , spawnPointX,spawnPointY);
	}
}
