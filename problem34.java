import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class problem34 extends GraphicsProgram {
	public void run() {
		RandomGenerator rgen = RandomGenerator.getInstance();
		for(int i = 0; i < 10000000; i++) {
			int x = rgen.nextInt(0,getWidth());
			int y = rgen.nextInt(0,getHeight());
			double radius = rgen.nextDouble(60,90);
			GOval rOval = new GOval(radius,radius);
			rOval.setFilled(true);
			rOval.setColor(rgen.nextColor());
			add(rOval,x,y);
		}
	}
}
