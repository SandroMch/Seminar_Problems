import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import acm.program.*;

public class problem68 extends ConsoleProgram {
	private JTextArea address;
	private JButton enter;
	public void init() {
		address = new JTextArea();
		add(address,SOUTH);
		println(address.getText());
	}
	
	public void run() {
		
	}
}
