import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		GRect house = new GRect(350, 250);
		add(house, 200,218);
		house.setFilled(true);
		house.setColor(Color.lightGray);
		
		GRect windowOne = new GRect(50,50);
		add(windowOne, 265, 258);
		windowOne.setFilled(true);
		windowOne.setColor(Color.cyan);
		
		GRect windowTwo = new GRect(50,50);
		add(windowTwo, 435,258);
		windowTwo.setFilled(true);
		windowTwo.setColor(Color.cyan);
		
		GRect door = new GRect(60,110);
		add(door, 330,358);
		door.setFilled(true);
		door.setColor(Color.red);
		
		GOval doorHandle = new GOval(15,15);
		add(doorHandle, 343,385);
		doorHandle.setFilled(true);
		doorHandle.setColor(Color.black);
		
		GLine leftRoof = new GLine(200,218,375,70);
		add(leftRoof);
		
		GLine rightRoof = new GLine(550,218,375,70);
		add(rightRoof);
		
	}
}
