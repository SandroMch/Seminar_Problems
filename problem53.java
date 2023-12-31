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
			while (true) {
				String line = bf.readLine();
				if (line == null) {
					break;
				}
				println("Symbols: " + countSybols(line));
				println("Words: " + countWord(line));
				println("Sentence: " + countSentence(line));
				println("Special Symbols: " + countSpecialSymbols(line));
			}
			bf.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int countSybols(String line) {
		int count = 0;
		char space = ' ';
		for (int i = 0; i < line.length(); i++) {
			char currChar = line.charAt(i);
			if (currChar == space) {
				count++;
			}
		}
		return line.length() - count;
	}

	private int countWord(String line) {
		int count = 0;
		char space = ' ';
		for (int i = 0; i < line.length(); i++) {
			char currChar = line.charAt(i);
			if (currChar == space) {
				count++;
			}
		}
		return count + 1;
	}

	private int countSentence(String line) {
		int count = 0;
		char dot = '.';
		for (int i = 0; i < line.length(); i++) {
			char currChar = line.charAt(i);
			if (currChar == dot) {
				count++;
			}
		}
		return count;
	}

	private int countSpecialSymbols(String line) {
		int count = 0;
		char questionMark = '?';
		char exclamationMark = '!';
		char dot = '.';
		for (int i = 0; i < line.length(); i++) {
			char currChar = line.charAt(i);
			if (currChar == questionMark || currChar == exclamationMark || currChar == dot) {
				count++;
			}
		}
		return count;
	}
}
