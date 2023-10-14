import acm.graphics.*;
import acm.program.*;

public class problem21 extends GraphicsProgram {
	public static final int n = 100;
	public void run() {
		int n = 100;
		while(n < 400) {
			addLines();
		}
	}
	private void addLines() {
		for(int i = 0; i < 10; i++) {
			GLine line = new GLine(n,100 ,n, 400);
			add(line);
		}
	}
}
