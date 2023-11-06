import java.awt.Color;

import acm.graphics.GRect;
import acm.program.*;

public class problem39 extends GraphicsProgram {
	public void run() {
		GRect rect = new GRect(80,80);
		add(rect,0,getHeight()/2 - 40);
		rect.setFilled(true);
		rect.setColor(Color.cyan);
		while(rect.getX() < getWidth()/2 - 40) {
			rect.move(1, 0);
			rect.pause(10);
		}
	}
}
