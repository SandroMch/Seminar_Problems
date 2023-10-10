import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.program.*;

public class Problem_13 extends GraphicsProgram {
	public void run() {
		double length = getWidth();
		double y = getHeight()/2;
		GLine horizontal = new GLine(0, y, length , y);
		add(horizontal);
	}
}
