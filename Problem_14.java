import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_14 extends GraphicsProgram {
	public void run() {
		drawFace();
		leftEye();
		rightEye();
	}
	private void drawFace() {
		double x = getWidth()/2;
		
		double y = getHeight()/2;
		
		GRect face = new GRect(350,300);
		add(face , x-175 , y-150);
		
	}
	private void leftEye() {
		double x = getWidth()/2;
		
		double y = getHeight()/2;
		
		GOval leftEye = new GOval (50,50);
		add(leftEye , x-100, y-80);
	}
	private void rightEye() {
		double x = getWidth()/2;
		
		double y = getHeight()/2;
		
		GOval rightEye = new GOval (50,50);
		add(rightEye , x+80 , y-80);
		
		
	}
}
