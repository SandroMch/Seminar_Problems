import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;

public class problem53 extends ConsoleProgram {
	String line;
	public void run() {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("problem52"));
			while(true) {
				String line = bf.readLine();
				if(line == null) {
					break;
				}
				println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	private int countWord(String line) {
//		int count = 
//	}
}
