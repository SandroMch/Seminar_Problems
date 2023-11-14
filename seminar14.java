import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class seminar14 extends GraphicsProgram {
	private GRect recta;
	private GOval ball;
	private double xCoord;
	private double yCoord;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		addMouseListeners();
		addKeyListeners();
		recta = new GRect(80, 80);
		recta.setFilled(true);
		add(recta, 100, 100);
		ball = new GOval(70, 70);
		ball.setFilled(true);
		add(ball, 200, 200);

	}

	public void mouseDragged(MouseEvent e) {
		GObject rect = getElementAt(e.getX(), e.getY());
		if (rect == recta) {
			recta.setLocation(e.getX() - 40, e.getY() - 40);
		}
		GObject oval = getElementAt(e.getX(), e.getY());
		if (oval == ball) {
			ball.setLocation(e.getX() - 35, e.getY() - 35);
		}
	}
	
}
