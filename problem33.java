import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class problem33 extends GraphicsProgram {
	public void run() {
		RandomGenerator r = RandomGenerator.getInstance();
		double rDouble = r.nextDouble(60,120);
		GOval oval = new GOval(rDouble,rDouble);
		add(oval,150,150);
		
		
	}
	
}
