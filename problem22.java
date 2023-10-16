import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class problem22 extends GraphicsProgram {
	public static final int row = 8;
	public void run() {
		double squareSize = getHeight() / row;
		for(int i = 0; i < row; i++) {
			GRect square = new GRect(squareSize ,squareSize);
			add(square,0 , 0);
		}
	}
}
