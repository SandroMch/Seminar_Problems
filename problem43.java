import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class problem43 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		addMouseListeners();
		double x = rgen.nextDouble(40,getWidth() - 40);
		double y = rgen.nextDouble(40,getHeight() - 40);
		GOval oval = new GOval(80,80);
		add(oval,x,y);
		
	}
}
