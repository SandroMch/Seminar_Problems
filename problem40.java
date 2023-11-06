import acm.graphics.GRect;
import acm.program.*;

public class problem40 extends GraphicsProgram {
	public void run() {
		GRect rect = new GRect(50,50);
		add(rect,0,getHeight()/2 - 25);
		while(rect.getX() < getWidth()- 50) {
			rect.move(1,0);
			rect.pause(5);
		}
	}
}
