import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.*;
import acm.util.RandomGenerator;

public class seminar20 extends GraphicsProgram {
	GOval ball;
	RandomGenerator rgen = RandomGenerator.getInstance();
	GObject xTouch;
	GObject yTouch;
	public void run() {
		int radius = rgen.nextInt(60, 150);
		int diameter = 2 * radius;
		double spawnPointX = rgen.nextDouble(0, getWidth() - diameter);
		double spawnPointY = rgen.nextDouble(0 , getHeight() - diameter);
		ball = new GOval(diameter,diameter);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball , spawnPointX,spawnPointY);
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent e) {
		GPoint location =  ball.getLocation();
		while(location != null) {
			ballMoveing();
		}
	}
	private void ballMoveing() {
		double xSpeed = rgen.nextDouble(1,4);
		double ySpeed = rgen.nextDouble(1,4);
		double delay = rgen.nextDouble(4, 7);
		ball.move(xSpeed,ySpeed);
		ball.pause(delay);
	}
}
