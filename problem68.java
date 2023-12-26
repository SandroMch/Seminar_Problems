import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import acm.program.*;

public class problem68 extends ConsoleProgram {
	private JTextField text;
	private JButton enter;
	public void init() {
		text = new JTextField(30);
		add(text,SOUTH);
		addActionListeners();
		text.addActionListener(this);
	}
	
	public void run() {
		
	}
}
