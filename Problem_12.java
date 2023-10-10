import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		GOval house = new GOval(350,350);
		add(house , 200,120);
		house.setFilled(true);
		house.setColor(Color.yellow);
		
		GRect window = new GRect(70, 75);
		add(window, 335, 220);
		window.setFilled(true);
		window.setColor(Color.CYAN);
		GOval door = new GOval (60, 100);
		add(door, 345, 370);
	}
}
