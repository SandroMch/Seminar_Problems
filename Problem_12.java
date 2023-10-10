import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		GOval house = new GOval(350,350);
		add(house , 200,120);
		GRect window = new window(70, 75);
		add(window, 100, 50);
	}
}
