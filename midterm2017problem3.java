import acm.program.*;

public class midterm2017problem3 extends ConsoleProgram {
	int str1Length;
	int str2Length;

	public void run() {
		String str1 = readLine();
		String str2 = readLine();
		str1Length = str1.length();
		str2Length = str2.length();
		println(devideStrings(str1, str2));
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

	private String devideStrings(String str1, String str2) {
		int small = smallerString(str1, str2).length();
		int big = biggerString(str1, str2).length();
		String newStr = "";
		char space = ' ';
		for (int i = 0; i < big - small + 1; i++) {
			String devided = biggerString(str1, str2).substring(i, i + small);
			newStr = newStr + devided + space;
		}
		return newStr;
	}
}
