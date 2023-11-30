import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class midter2017problem1 extends GraphicsProgram {
	GObject rect;
	GObject label;
	int width = 300;
	int length = 300;
	int score = 0;
	public void run() {
		rect = new GRect(width,length);
		add(rect,getWidth()/2 - width/2, getHeight()/2 - length/2);
		label = new GLabel("score");
		add(label, getWidth()/2 - label.getWidth()/2,getHeight()/2 - label.getHeight()/2);
	}
}
