import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;

public class problem52 extends ConsoleProgram {
	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("problem52.java"));
			while(true) {
				String newLine = rd.readLine();
				if(newLine == null) {
					break;
				}
				println(newLine);	
				
			}
			rd.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
