import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_14 extends GraphicsProgram {
	public void run() {
		drawFace();
	}
	private void drawFace() {
		double x = getWidth()/2;
		
		double y = getHeight()/2;
		
		GRect face = new GRect(350,300);
		add(face , x-175 , y-150);
		
	}

}
