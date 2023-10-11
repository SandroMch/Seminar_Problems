import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_14 extends GraphicsProgram {
	public void run() {
		findCenter();
	}
	private void findCenter() {
		double width = getWidth();
		double x = getWidth()/2;
		
		double length = getHeight();
		double y = getHeight()/2;
		
	}
	private void drawFace() {
		GRect face = new GRect(350,300);
		add(face , x-175 , y-150);
	}
}
