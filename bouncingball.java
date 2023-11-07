import java.awt.Color;

import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class bouncingball extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		GOval ball = new GOval(80, 80);
		GOval secBall = new GOval(40,40);
		int x = rgen.nextInt(0, getWidth());
		int y = rgen.nextInt(0, getHeight());
		int z = rgen.nextInt(0, getWidth());
		int m = rgen.nextInt(0, getHeight());
		ball.setFilled(true);
		ball.setColor(Color.red);
		secBall.setFilled(true);
		secBall.setColor(Color.cyan);
		add(ball, x, y);
		add(ball, z, m);
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
			secBall.move(xSpeed, ySpeed);
			secBall.pause(5);
			if(secBall.getX() == getWidth() - 40  || secBall.getX() == 0) {
				xSpeed *= -1;
			}
			if(secBall.getY() == getWidth() - 40 || secBall.getY() == 0) {
				secBall.move(xSpeed, ySpeed);
				secBall.pause(5);
			}
		}
	}
}
