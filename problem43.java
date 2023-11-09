import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class problem43 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final double xSize = 80;
	private static final double ySize = 80;
	private GOval oval;
	public void run() {
		addMouseListeners();	
		GOval oval = new GOval(xSize,ySize);
		oval.setFilled(true);
		oval.setColor(Color.cyan);
		add(oval,rgen.nextDouble(0,getWidth()- 80),rgen.nextDouble(0,getHeight()- 80));
	}
	public void mouseDragged(MouseEvent e) {
		GObject oval = getElementAt(e.getX(),e.getY());
		if(oval != null) {
			oval.setLocation(e.getX(),e.getY());
		}
	}
}

