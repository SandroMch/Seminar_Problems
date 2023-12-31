import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class problem43 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final double xSize = 80;
	private static final double ySize = 80;
	private GOval oval;

	public void run() {
		moveOval();
		addMouseListeners();
	}

	public void mouseDragged(MouseEvent e) {
		GObject ball = getElementAt(e.getX(), e.getY());
		if (ball != null) {
			ball.setLocation(e.getX() - xSize / 2, e.getY() - ySize / 2);
		}
	}

	private void moveOval() {
		oval = new GOval(xSize, ySize);
		oval.setFilled(true);
		oval.setColor(Color.cyan);
		add(oval, rgen.nextDouble(0, getWidth() - 80), rgen.nextDouble(0, getHeight() - 80));
	}
}
