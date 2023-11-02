import java.awt.Color;

import acm.graphics.GOval;
import acm.program.*;

public class seminar12 extends GraphicsProgram {
	public void run() {
		int x = 200;
		int y = 200;
		double centerX = getWidth()/2 - x/2;
		double centerY = getHeight()/2 - y/2;
		GOval head = new GOval(x,y);
		head.setFillColor(Color.red);
		add(head, centerX,centerY);
		
	}
}
