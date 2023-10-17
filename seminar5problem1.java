import acm.graphics.GLabel;
import acm.program.*;
import java.awt.Color;
import java.awt.Font;

public class seminar5problem1 extends GraphicsProgram {
	public void run() {
		double x = getWidth();
		double y = getHeight();
		GLabel text = new GLabel("width: " + x + "height: " + y);
		Font london = new Font("London" , Font.PLAIN, 42);
		text.setFont(london);
		text.setColor(Color.RED);
		double x1 = getWidth() / 2;
		double y1 = getHeight() / 2;
		double textWidth = text.getWidth() / 2;
		double textHeight = text.getHeight();
		add(text, x1 - textWidth , y1 - textHeight);
		
		
	}
}
