import acm.graphics.*;
import acm.program.*;

public class problem21 extends GraphicsProgram {
	public static final int NUM_LINES = 11;
	
	public void run() {
		for(int i = 0; i < NUM_LINES; i ++) {
	//		addVertical();
			addHorizontal(i);
		}
		
	}

	private void addHorizontal(int i) {
		double height = (double)getHeight()/ (NUM_LINES - 1);	
		double y = i * height;
		double x1 = 0;
		double x2 = getWidth();
		GLine line = new GLine(x1,y,x2,y);
		add(line);
	}	
}
