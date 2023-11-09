import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRoundRect;
import acm.program.*;
import javafx.scene.input.MouseDragEvent;

public class problem41 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}
	public void mouseDragged(MouseEvent e) {
		GPoint point = new GPoint(e.getX(), e.getY());
		add(point);
	}
}
