import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class problem22 extends GraphicsProgram {
	public static final int row = 8;
	public void run() {
		double squareSize = getHeight() / row;
		double length = squareSize + 400;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < length; j+=squareSize) {
				GRect rowSquare = new GRect(squareSize, squareSize);
				add(rowSquare,j,0);
				GRect columnSquare = new GRect(squareSize,squareSize);
				add(columnSquare, 0,j);
			}
		}
	}
}
