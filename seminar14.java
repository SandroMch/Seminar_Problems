import acm.program.*;

import java.awt.event.MouseEvent;

import acm.graphics.*;

public class seminar14 extends GraphicsProgram {
	private GRect recta;
	private GOval oval;
	private double xCoord;
	private double yCoord;

	public void run() {
		addMouseListeners();
		recta = new GRect(80, 80);
		recta.setFilled(true);
		add(recta, 100, 100);
		oval = new GOval(70, 70);
		oval.setFilled(true);
		add(oval, 200, 200);
		
	}

	public void mouseDragged(MouseEvent e) {
		GObject rect = getElementAt(e.getX() , e.getY());
		if(rect == recta) {
			recta.setLocation(e.getX() - 40 , e.getY() - 40);
		}
		
	}
	
}
