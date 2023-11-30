import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class midter2017problem1 extends GraphicsProgram {
	GObject rect;
	int width = 150;
	int length = 150;
	public void run() {
		rect = new GRect(width,length);
		add(rect,getWidth() - width/2, getHeight() - length/2);
	}
}
