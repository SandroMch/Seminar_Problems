

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}

	public void mouseReleased(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		GLine line = new GLine(x,y,x,y);
		add(line);
	}
}
