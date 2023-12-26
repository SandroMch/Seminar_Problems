import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.program.*;

public class problem67 extends GraphicsProgram {
	private JTextField address;

	public void init() {
		address = new JTextField(30);
		add(address, SOUTH);
		addActionListeners();
		address.addActionListener(this);
	}

	public void run() {

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == address) {
			try {
				GImage img = new GImage(address.getText());
				double x = getWidth() / 2 - img.getWidth() / 2;
				double y = getHeight() / 2 - img.getHeight() / 2;
				add(img, x, y);
				removeAll();
			} catch (Exception IO) {
				
			}
		}
	}
}
