import acm.program.*;

import java.awt.event.MouseEvent;

import acm.graphics.*;

public class seminar14 extends GraphicsProgram {
	private GRect rect;
	private GOval oval;
	public void run() {
		addMouseListeners();
		rect = new GRect(80,80);
		add(rect, 100,100);
		oval = new GOval(70,70);
		add(oval , 200,200);
	}
	public void mouseDragged(MouseEvent e) {
		while(e.getPoint() != null) {
			rect.setLocation(e.getX(), e.getY());
		}
	}
}
