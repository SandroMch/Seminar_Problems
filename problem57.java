import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import acm.program.*;

public class problem57 extends ConsoleProgram {
	public void run() {
		String str1 = readLine("Enter text: ");
		String str2 = readLine("Enter text: ");
		if(countFirstString(str1).equals(countSecondString(str2))) {
			println(true);
		}else {
			println(false);
		}
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
		firstStr.sort(Comparator.naturalOrder());
		return firstStr;
	}
	private ArrayList<Integer> countSecondString(String str2) {
		ArrayList<Integer> secondStr = new ArrayList<Integer>();
		for (int i = 0; i < str2.length(); i++) {
			char currChar = str2.charAt(i);
			if (firstOccurance(str2,i)) {
				secondStr.add(countSymbols(str2,currChar));
			}
		}
		secondStr.sort(Comparator.naturalOrder());
		return secondStr;
	}
}
