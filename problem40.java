import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class problem40 extends GraphicsProgram {
	public void run() {
		GOval oval = new GOval(50,50);
		add(oval,0,getHeight()/2 - 25);
		oval.setFilled(true);
		while(true) {
			while(oval.getX() < getWidth()- 50) {
				oval.move(1,0);
				oval.pause(2);
			} 
			while(oval.getX() > 0) {
				oval.move(-1,0);
				oval.pause(2);
				
			}
			
		}
	}
}
