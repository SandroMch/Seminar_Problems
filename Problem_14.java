import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

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
		face.setFilled(true);
		face.setColor(Color.PINK);
	}
	private void drawleftEye() {
		double x = getWidth()/2;
		double y = getHeight()/2;
		GOval leftEye = new GOval (50,50);
		add(leftEye , x-100, y-80);
		leftEye.setFilled(true);
		leftEye.setColor(Color.black);
	}
	private void drawrightEye() {
		double x = getWidth()/2;
		double y = getHeight()/2;
		GOval rightEye = new GOval (50,50);
		add(rightEye , x+55 , y-80);
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.black);
		
	}
	private void drawMouth() {
		double x = getWidth()/2;
		GRect mouth = new GRect (120,45);
		add(mouth , x-60,300);
		GRect left = new GRect(15,20);
		left.setFilled(true);
		left.setColor(Color.white);
		GRect right = new GRect(15,20);
		right.setFilled(true);
		right.setColor(Color.white);
		add(left , x-16 , 300);
		add(right , x+1 , 300);
	}
}
