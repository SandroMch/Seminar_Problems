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
		while (true) {
			ball.move(1,1);
			ball.pause(5);
		
		}

	}
}
