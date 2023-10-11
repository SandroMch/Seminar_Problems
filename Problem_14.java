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
		
		GLine horizontal = new GLine (0 , y , width , y);
		add(horizontal);
		
		GLine vertical = new GLine (x , 0 , x , length);
		add(vertical);
		
		double xCorner = getWidth() - 100;
		double yCorner = getHeight() - 100;
		GRect face = new GRect (100, 100);
		add(face , xCorner , yCorner);
		
		
	}
}
