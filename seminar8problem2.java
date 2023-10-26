import acm.graphics.GRect;
import acm.program.*;

public class seminar8problem2 extends GraphicsProgram {
	public void run() {
		add(squareSide(), 100, 100);
	}
	private GRect squareSide() {
		double n = readDouble("Enter length of side: ");
		GRect rect = new GRect(n,n);
		return rect;
	}
}
