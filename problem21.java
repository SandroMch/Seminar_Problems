import acm.graphics.*;
import acm.program.*;

public class problem21 extends GraphicsProgram {
	public static final int i = 20;
	public static final int n =20;
	
	public void run() {
		addVertical();
		addHorizontal();
	}
	private void addVertical() {
		for(int i = 20; i < 530; i+=50) {
			GLine vertical = new GLine(i,20 ,i, 520);
			add(vertical);	
		}
	}
	private void addHorizontal() {
		for(int n = 20; n < 530; n+=50) {
			GLine horizontal = new GLine (20, n, 520,n);
			add(horizontal);
		}
	}
}
