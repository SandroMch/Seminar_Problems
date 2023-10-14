import acm.graphics.*;
import acm.program.*;

public class problem21 extends GraphicsProgram {
	public void run() {
		addLines();
	}
	private void addLines() {
		for(int i = 0; i < 10; i++) {
			GLine line = new GLine(100,100 , 100, 400);
			add(line);
		}
	}
}
