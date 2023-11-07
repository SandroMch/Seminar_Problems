import java.awt.Color;

import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class bouncingball extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		GOval ball = new GOval(80, 80);
		int x = rgen.nextInt(0, getWidth());
		int y = rgen.nextInt(0, getHeight());
		ball.setFilled(true);
		ball.setColor(Color.red);
		add(ball, x, y);
		int xSpeed = 1;
		int ySpeed = 1;
		while (true) {
			ball.move(xSpeed,ySpeed);
			ball.pause(5);
			if(ball.getX() == getWidth()-80 || ball.getX() == 0) {
				xSpeed *= -1;
			}
			if(ball.getY() == getHeight() - 80 || ball.getY() == 0) {
				ySpeed *= -1;
			}
		}

	}
}
