import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class problem43 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		addMouseListeners();
		double x = rgen.nextDouble(0,getWidth());
		double y = rgen.nextDouble(0,getHeight());
		GOval oval = new GOval(80,80);
		add(oval,x,y);
		
	}
}
