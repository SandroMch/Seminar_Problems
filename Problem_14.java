import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_14 extends GraphicsProgram {
	public void run() {
		drawFace();
		drawleftEye();
		drawrightEye();
		drawMouth();
		
	}
	private void drawFace() {
		double x = getWidth()/2;
		
		double y = getHeight()/2;
		
		GRect face = new GRect(350,300);
		add(face , x-175 , y-150);
		
	}
	private void drawleftEye() {
		double x = getWidth()/2;
		
		double y = getHeight()/2;
		
		GOval leftEye = new GOval (50,50);
		add(leftEye , x-100, y-80);
	}
	private void drawrightEye() {
		double x = getWidth()/2;
		
		double y = getHeight()/2;
		
		GOval rightEye = new GOval (50,50);
		add(rightEye , x+55 , y-80);
		
	}
	private void drawMouth() {
		GRect mouth = new GRect (100,35);
		add(mouth , 20,20);
	}
}
