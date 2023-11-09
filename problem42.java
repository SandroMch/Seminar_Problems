import com.sun.glass.events.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		GLine line = new GLine(e.getX());
		add(line);
	}
}
