import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRoundRect;
import acm.program.*;
import javafx.scene.input.MouseDragEvent;

public class problem41 extends GraphicsProgram {
	GOval point;
	public void run() {
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e) {
		paintPoint(e.getX(), e.getY());
	}
	public void mouseDragged(MouseEvent e) {
		paintPoint(e.getX(),e.getY());
	}
	private void paintPoint(int x , int y) {
		point = new GOval(2,2);
		point.setFilled(true);
		add(point , x - 1 , y -1);
		
	}
}
