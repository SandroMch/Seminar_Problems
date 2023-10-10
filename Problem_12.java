import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		GRect house = new GRect(350, 250);
		add(house, 200,218);
		house.setFilled(true);
		house.setColor(Color.BITMASK);
		
		GRect windowOne = new GRect(50,50);
		add(windowOne, 265, 258);
		
		GRect windowTwo = new GRect(50,50);
		add(windowTwo, 435,258);
		
		GRect door = new GRect(60,110);
		add(door, 330,358);
		
		GOval doorHandle = new GOval(15,15);
		add(doorHandle, 343,385);
		
		GLine leftRoof = new GLine(200,218,375,70);
		add(leftRoof);
		
		GLine rightRoof = new GLine(550,218,375,70);
		add(rightRoof);
		
	}
}
