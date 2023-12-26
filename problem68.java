import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.*;

public class problem68 extends ConsoleProgram {
	private JTextField text;
	private JButton enter;
	private String str;
	public void init() {
		text = new JTextField(30);
		add(text,SOUTH);
		addActionListeners();
		text.addActionListener(this);
		enter = new JButton("Touch me");
		add(enter,SOUTH);
	}
	
	public void run() {
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() != null || e.getSource() == enter) {
			str = text.getText();
			println(str);
		}
		text.setText("");
	}
}
