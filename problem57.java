import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class problem57 extends ConsoleProgram {
	public void run() {
		String str1 = readLine("Enter text: ");
		String str2 = readLine("Enter text: ");
		println(countFirstString(str1));
	}

	private int countSymbols(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			if (ch == currChar) {
				count++;
			}
		}
		return count;
	}

	private boolean firstOccurance(String str, int index) {
		for (int i = 0; i < index; i++) {
			char currChar = str.charAt(i);
			if (currChar == str.charAt(index)) {
				return false;
			}
		}
		return true;
	}

	private ArrayList<Integer> countFirstString(String str1) {
		ArrayList<Integer> firstStr = new ArrayList<Integer>();
		for (int i = 0; i < str1.length(); i++) {
			char currChar = str1.charAt(i);
			if (firstOccurance(str1,i)) {
				firstStr.add(countSymbols(str1,currChar));
			}
		}
		return firstStr;
	}
}
