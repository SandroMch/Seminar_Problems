import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		GRect house = new GRect(350, 250);
		add(house, 200,218);
		
		GRect windowOne = new GRect(50,50);
		add(windowOne, 265, 258);
		
		GRect windowTwo = new GRect(50,50);
		add(windowTwo, 435,258);
		
		GRect door = new GRect(60,110);
		add(door, 330,358);
	}
}
