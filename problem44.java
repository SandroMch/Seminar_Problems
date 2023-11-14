import acm.program.*;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class problem44 extends GraphicsProgram {
	
	public void run() {
		GOval ball = new GOval(60,60);
		ball.setFilled(true);
		ball.setColor(Color.cyan);
		addMouseListeners();
		
	}
	public void mouseClicked(MouseEvent e) {
		GOval ball = new GOval(60,60);
		ball.setFilled(true);
		ball.setColor(Color.cyan);
		add(ball , e.getX() - 30, e.getY() - 30);
//		while(true) {
//			ball.move(0, 1);
//			ball.pause(5);
//		}
	}
}
