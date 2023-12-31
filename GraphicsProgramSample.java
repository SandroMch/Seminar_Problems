/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */
import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsProgramSample extends GraphicsProgram {
	
	public void run() {
		GRect myRect = new GRect(100, 200);
		add(myRect, 100 , 50 );
		
		myRect.setFilled(true);
		myRect.setColor(Color.CYAN);
	}
}
