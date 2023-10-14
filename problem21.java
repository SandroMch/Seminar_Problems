import acm.graphics.*;
import acm.program.*;

public class problem21 extends GraphicsProgram {
	public static final int i = 20;
	public static final int n =20;
	public void run() {
		while(i < 400) {
			addLines();
		}
	}
	private void addLines() {
		for(int i = 20; i < 650; i+=50) {
			GLine vertical = new GLine(i,100 ,i, 400);
			add(vertical);	
		}
		for(int n = 20; n < 650; n+=50) {
			GLine horizontal = new GLine (100 , n , 600 , n);
			add(horizontal);
		}
	}
}
