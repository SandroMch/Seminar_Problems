/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.*;

public class test extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final double BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final double BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final double BRICKS_IN_BASE = 14;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		drawPyramid();
	}

	private void drawPyramid() {
		double height = getHeight();
		double width = getWidth();
		
		double xStartCoordinates = (width - BRICKS_IN_BASE * BRICK_WIDTH) / 2;
		double xEndCoordinates = width - ((width - BRICKS_IN_BASE * BRICK_WIDTH) / 2) - BRICK_WIDTH ;
		
		double yStartCoordinates = height - BRICK_HEIGHT;
		double yEndCoordinates = height - 14 * BRICK_HEIGHT;

		
		
		/* Second for Iterates over the X coordinates, First for over the Y one.
		   Both's end and start coordinates decrease so at the end it becomes the Pyramid.*/
		for (double j = yStartCoordinates; j >= yEndCoordinates; j -= BRICK_HEIGHT) {
			for (double i = xStartCoordinates; i <= xEndCoordinates; i += BRICK_WIDTH) {
				Color color = rgen.nextColor(); // Random color to make it more fun
				GRect rect = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
				rect.setFillColor(color);
				rect.setFilled(true);
				add(rect, i, j);
			}
			
			/* at the end of each for loop, X Start and end coordinates should be lowered by 
			   half of Brick's width and height, so it ends up being a Pyramid. */
			xEndCoordinates -= BRICK_WIDTH / 2;
			xStartCoordinates += BRICK_WIDTH / 2;
		}
	}
}

