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
		
		GRect face = new GRect(350,300);
		add(face , x-175 , y-150);
	}
}
