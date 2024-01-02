import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import acm.program.*;

public class problem57 extends ConsoleProgram {
	public void run() {
		String str1 = readLine("Enter text: ");
		String str2 = readLine("Enter text: ");
		println(isAnagram(str1,str2));
	}

	private boolean isAnagram(String str1, String str2) {
		int[] countStr1 = countSymbols(str1);
		int[] countStr2 = countSymbols(str2);
		if(Arrays.equals(countStr1, countStr2)) {
			return true;
		}
		return false;
	}

	private int[] countSymbols(String str) {
		int[] countStr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = ch - 'a';
			countStr[index]++;
		}
		return countStr;
	}
}
