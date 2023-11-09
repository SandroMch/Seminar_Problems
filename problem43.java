import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.Color;

import acm.graphics.*;

public class problem43 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		addMouseListeners();
		double x = rgen.nextDouble(0, getWidth() - 80);
		double y = rgen.nextDouble(0, getHeight() - 80);
		GOval oval = new GOval(80, 80);
		oval.setFilled(true);
		oval.setColor(Color.blue);
		add(oval, x, y);

	}
}
