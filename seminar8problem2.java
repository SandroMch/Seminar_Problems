import java.awt.Color;

import acm.graphics.GRect;
import acm.program.*;

public class seminar8problem2 extends GraphicsProgram {
	public void run() {
		add(squareSide(), 100, 100);
	}
	private GRect squareSide() {
		double n = readDouble("Enter length of side: ");
//		int r = readInt("Enter number from 0 to 255");
//		int g = readInt("Enter number from 0 to 255");
//		int b = readInt("Enter number from 0 to 255");
		GRect rect = new GRect(n,n);
		rect.setFilled(true);
//		rect.setColor(Color.);
		return rect;
	}
	
}
