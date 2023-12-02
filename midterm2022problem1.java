import java.awt.event.*;

import acm.graphics.GLine;
import acm.program.*;

public class midterm2022problem1 extends GraphicsProgram {
	private GLine prevLine = null;
	
	public void run () {
		addMouseListeners();
		prevLine.setStartPoint(0, 0);
		prevLine.setEndPoint(0, 0);
		add(prevLine);
	}
	
	public void mouseClicked(MouseEvent e) {
		GLine newLine = new GLine(prevLine.getEndPoint().getX(), prevLine.getEndPoint().getY(), e.getX(), e.getY());
		prevLine = newLine;
		add(newLine);
	}
	
	public void mouseDragged(MouseEvent e) {
		prevLine.setEndPoint(e.getX(), e.getY());
	}
	
}
