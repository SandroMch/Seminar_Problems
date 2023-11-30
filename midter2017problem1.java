import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class midter2017problem1 extends GraphicsProgram {
	GObject rect;
	int width = 300;
	int length = 300;
	public void run() {
		rect = new GRect(width,length);
		add(rect,getWidth()/2 - width/2, getHeight()/2 - length/2);
	}
}
