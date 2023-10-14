import acm.graphics.*;
import acm.program.*;

public class problem21 extends GraphicsProgram {
	public static final int i = 100;
	public void run() {
		while(i < 400) {
			addLines();
		}
	}
	private void addLines() {
		for(int i = 100; i < 300; i+=20) {
			GLine line = new GLine(i,100 ,i, 400);
			add(line);
		}
	}
}
