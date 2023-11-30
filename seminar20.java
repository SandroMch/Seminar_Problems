import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.*;
import acm.util.RandomGenerator;

public class seminar20 extends GraphicsProgram {
	GOval ball;
	RandomGenerator rgen = RandomGenerator.getInstance();
	GObject xTouch;
	GObject yTouch;
	private int vx = 0;
	private int vy = 0;
	private static final int DELAY = 100;
	int radius = rgen.nextInt(60, 150);
	int diameter = 2 * radius;
	public void run() {
		addBall();
		addMouseListeners();
		while(true) {
			ball.move(vx, vy);
			if(ball.getX() < 0 || ball.getX() > getWidth() - diameter) {
				vx *= -1;
			}
			if(ball.getY() <= 0 || ball.getY() > getHeight() - diameter) {
				vy *= -1;
			}
			
			ball.pause(DELAY);
		}
	}
	public void mouseClicked(MouseEvent e) {
		GObject object = getElementAt(e.getX(),e.getY());
		if(object != null) {
			vx = getRandomSpeed();
			
			vy = getRandomSpeed();
			ball.setColor(rgen.nextColor());
		}
	}
	private int getRandomSpeed() {
		int x = rgen.nextInt(1,5);
		boolean negSpeed = rgen.nextBoolean();
		if(negSpeed) {
			x *= -1;
		}
		return x;
	}
	
	private void addBall() {
		radius = rgen.nextInt(60, 150);
		diameter = 2 * radius;
		double spawnPointX = rgen.nextDouble(0, getWidth() - diameter);
		double spawnPointY = rgen.nextDouble(0 , getHeight() - diameter);
		ball = new GOval(diameter,diameter);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball , spawnPointX,spawnPointY);
	}
}
