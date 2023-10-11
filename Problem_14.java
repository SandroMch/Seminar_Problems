import acm.graphics.*;
import acm.program.GraphicsProgram;
//import javafx.scene.paint.Color;
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
		//face.setColor(Color.AQUAMARINE);
		
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
		
	}
	private void drawMouth() {
		double x = getWidth()/2;
		
		
		GRect mouth = new GRect (120,45);
		add(mouth , x-60,300);
	}
}
