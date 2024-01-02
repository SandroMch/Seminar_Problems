import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class problem39 extends GraphicsProgram {
	GOval oval;
	public void run() {
		createBall();
		while(oval.getX() < getWidth()/2 - 40) {
			oval.move(1, 0);
			oval.pause(10);
		}
	}
	private void createBall() {
		oval = new GOval(80,80);
		add(oval,0,getHeight()/2 - 40);
		oval.setFilled(true);
		oval.setColor(Color.cyan);
	}
}
