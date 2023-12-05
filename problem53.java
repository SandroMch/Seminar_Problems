import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;

public class problem53 extends ConsoleProgram {
	String line;
	public void run() {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("randomText.txt"));
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
	private int countWord(String line) {
		int count = 0;
		char space = ' ';
		for(int i = 0; i < line.length(); i++) {
			char currChar = line.charAt(i);
			if(currChar == space) {
				count++;
			}
		}
		return count;
	}
}
