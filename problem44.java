import acm.program.*;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class problem44 extends GraphicsProgram {
	private int xSpeed = 0;
	private int ySpeed = 1;

	private GOval ball;

	public void run() {
		addMouseListeners();
		createBall();
		while (true) {
			ball.move(xSpeed, ySpeed);
			ball.pause(5);
		}

	}

	public void mouseClicked(MouseEvent e) {
		add(ball, e.getX() - 30, e.getY() - 30);
	}

	private void createBall() {
		ball = new GOval(60, 60);
		ball.setFilled(true);
		ball.setColor(Color.cyan);
	}
}
