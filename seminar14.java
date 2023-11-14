import acm.program.*;

import java.awt.event.MouseEvent;

import acm.graphics.*;

public class seminar14 extends GraphicsProgram {
	private GRect rect;
	private GOval oval;
	private double xCoord;
	private double yCoord;
	public void run() {
		addMouseListeners();
		rect = new GRect(80, 80);
		rect.setFilled(true);
		add(rect, 100, 100);
		oval = new GOval(70, 70);
		oval.setFilled(true);
		add(oval, 200, 200);
		
	}

	public void mouseDragged(MouseEvent e) {
		rect.setLocation(e.getX() - 50 , e.getY() - 50);
		oval.setLocation(xCoord - 35 , yCoord - 35);
	}
	private void coordinates() {
		xCoord = rect.getX() + oval.getX();
		yCoord = rect.getY() + oval.getY();
	}
}
