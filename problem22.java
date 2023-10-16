import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class problem22 extends GraphicsProgram {
	public static final int row = 8;
	public void run() {
		double squareSize = getHeight() / row;
		GRect test = new GRect(squareSize,squareSize);
		add(test, 0,0);
		
		
	}
}
