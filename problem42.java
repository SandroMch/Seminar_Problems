

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		GLine line = new GLine(e.getX(),e.getY(),e.getX(),e.getY());
		add(line);
	}
}
