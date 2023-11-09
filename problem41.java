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
		GOval point = new GOval(1,1);
		add(point,e.getX(),e.getY());
	}
}
