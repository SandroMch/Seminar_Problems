import javax.swing.JTextField;

import acm.program.*;

public class problem67 extends GraphicsProgram {
	private JTextField textField;
	public void run() {
		JTextField address = new JTextField(30);
		add(address,SOUTH);
		addActionListeners();
	}
}