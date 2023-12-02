import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

public class Texili extends GraphicsProgram {
	GPoint start = new GPoint(0,0);
	GPoint end;
	GLine line;
	public void run() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		end = new GPoint(e.getX(), e.getY());
		line = new GLine(start.getX(), start.getY(), end.getX(), end.getY());
		add(line);
		
		start = end;
	}
	
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
		start = new GPoint(e.getX(), e.getY());
	}
}
