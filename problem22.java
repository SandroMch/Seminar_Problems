import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class problem22 extends GraphicsProgram {
	public static final int row = 7;
	public static final int column = 7;
	public void run() {
		double squareSize = getHeight() / row;
		double length = getHeight() + 10;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j+=squareSize) {
				GRect square = new GRect(squareSize , squareSize);
				add(square , j,0);
			}
		}
	}
}
