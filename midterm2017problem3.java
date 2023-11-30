import java.util.StringTokenizer;

import acm.program.*;

public class midterm2017problem3 extends ConsoleProgram {
	int str1Length;
	int str2Length;

	public void run() {
		String str1 = readLine();
		String str2 = readLine();
		str1Length = str1.length();
		str2Length = str2.length();
		println(compareStrings(str1,str2));

	}

	private String smallerString(String str1, String str2) {
		if (str1Length > str2Length) {
			return str2;
		}
		return str1;
	}

	private String biggerString(String str1, String str2) {
		if (str1Length < str2Length) {
			return str2;
		}
		return str1;
	}

	private int countChar(String str1, char ch) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			char currChar = str1.charAt(i);
			if (ch == currChar) {
				count++;
			}
		}
		return count;
	}

	private boolean compareStrings(String str1, String str2) {
		for (int i = 0; i < smallerString(str1, str2).length(); i++) {
			char currChar = smallerString(str1,str2).charAt(i);
			int small = countChar(smallerString(str1,str2),currChar);
			int big = countChar(biggerString(str1,str2),currChar);
			if(small > big) {
				return false;
			}
		}
		return true;
	}

}
