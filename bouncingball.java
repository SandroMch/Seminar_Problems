import java.awt.Color;

import acm.graphics.GImage;
import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class bouncingball extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		GOval ball = new GOval(80, 80);
		GOval secBall = new GOval(40, 40);
		setBackground(Color.CYAN);
		drawBall(ball, secBall);
		int xSpeed = 1;
		int ySpeed = 1;
		int zSpeed = 1;
		int mSpeed = 1;
		moveBalls(ball, secBall, xSpeed, ySpeed, zSpeed, mSpeed);

	}

	private void drawBall(GOval ball, GOval secBall) {
		int x = rgen.nextInt(0, getWidth());
		int y = rgen.nextInt(0, getHeight());
		int z = rgen.nextInt(0, getWidth());
		int m = rgen.nextInt(0, getHeight());
		ball.setFilled(true);
		ball.setColor(Color.red);
		secBall.setFilled(true);
		secBall.setColor(Color.DARK_GRAY);
		add(ball, x, y);
		add(secBall, z, m);
	}

	private void moveBalls(GOval ball, GOval secBall, int xSpeed, int ySpeed, int zSpeed, int mSpeed) {
		while (true) {
			ball.move(xSpeed, ySpeed);
			ball.pause(1);
			if (ball.getX() == getWidth() - 80 || ball.getX() == 0) {
				xSpeed *= -1;
			}
			if (ball.getY() == getHeight() - 80 || ball.getY() == 0) {
				ySpeed *= -1;
			}
			secBall.move(zSpeed, mSpeed);
			secBall.pause(1);
			if (secBall.getX() == getWidth() - 40 || secBall.getX() == 0) {
				zSpeed *= -1;
			}
			if (secBall.getY() == getHeight() - 40 || secBall.getY() == 0) {
				mSpeed *= -1;
			}
		}
	}
}
