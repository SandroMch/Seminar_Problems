import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import acm.program.*;

public class problem68 extends ConsoleProgram {
	private JTextField address;
	private JButton enter;
	public void init() {
		address = new JTextField(30);
		add(address,SOUTH);
		println(address.getText());
	}
	
	public void run() {
		
	}
}
