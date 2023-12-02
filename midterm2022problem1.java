import java.awt.event.*;

import acm.graphics.*;
import acm.program.*;

public class midterm2022problem1 extends GraphicsProgram {
	private GLine curLine = null;
	private GPoint lastPoint = new GPoint(0, 0);
	
	public void run () {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		GPoint newPoint = new GPoint(e.getX(), e.getY());
		GLine line = new GLine(lastPoint.getX(), lastPoint.getY(), newPoint.getX(), newPoint.getY());
		curLine = line;
		lastPoint = newPoint;
		add(line);
	}
	
	public void mouseDragged(MouseEvent e) {
		curLine.setEndPoint(e.getX(), e.getY());
		lastPoint = new GPoint(e.getX(), e.getY());
	}
	
}
