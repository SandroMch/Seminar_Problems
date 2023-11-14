import acm.program.*;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class problem44 extends GraphicsProgram {
	private GOval ball;
	
	public void run() {
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent e) {
		ball = new GOval(60,60);
		ball.setFilled(true);
		ball.setColor(Color.cyan);
		add(ball , e.getX() - 30, e.getY() - 30);
	}
}
