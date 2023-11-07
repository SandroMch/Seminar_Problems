import acm.graphics.GRect;
import acm.program.*;

public class problem40 extends GraphicsProgram {
	public void run() {
		GRect rect = new GRect(50,50);
		add(rect,0,getHeight()/2 - 25);
		rect.setFilled(true);
		while(true) {
			while(rect.getX() < getWidth()- 50) {
				rect.move(1,0);
				rect.pause(2);
			} 
			while(rect.getX() > 0) {
				rect.move(-1,0);
				rect.pause(2);
				
			}
			
		}
	}
}
