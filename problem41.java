import acm.graphics.GOval;
import acm.graphics.GRoundRect;
import acm.program.*;
import javafx.scene.input.MouseDragEvent;

public class problem41 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}
	public void mouseDragged(MouseDragEvent e) {
		GOval oval = new GOval(20,20);
		add(oval,e.getX(),e.getY());
	}
}
