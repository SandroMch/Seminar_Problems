import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.*;

public class seminar12 extends GraphicsProgram {
	private static final int x = 200;
	private static final int y = 200;
	public void run() {
		
		double centerX = getWidth()/2 - x/2;
		double centerY = getHeight()/2 - y/2;
		
		while(true) {
			pause(1000);
			front();
			pause(1000);
			back();
		}
		

	}
	private void front() {
		double centerX = getWidth()/2 - x/2;
		double centerY = getHeight()/2 - y/2;
		GOval head = new GOval(x,y);
		head.setFilled(true);
		head.setColor(Color.red);
		add(head, centerX,centerY);
		GLabel HEAD = new GLabel("HEAD");
		HEAD.setFont("LONDON-24");
		add(HEAD,getWidth()/2 - HEAD.getWidth()/2,getHeight()/2 + HEAD.getAscent()/2);
	}
	private void back() {
		double centerX = getWidth()/2 - x/2;
		double centerY = getHeight()/2 - y/2;
		GOval tails = new GOval(x,y);
		tails.setFilled(true);
		tails.setColor(Color.green);
		GLabel TAILS = new GLabel("TAILS");
		TAILS.setFont("LONDON-24");
		add(tails, centerX,centerY);
		add(TAILS,getWidth()/2 - TAILS.getWidth()/2,getHeight()/2 + TAILS.getAscent()/2);
	}
}
