import acm.program.*;

public class midterm6 extends ConsoleProgram {
	public void run() {
		String str1 = readLine();
		String str2 = readLine();
		println(isAnagram(str1, str2));
	}
	private int countSymbols(String str1, char ch) {
		int count = 0;
		for(int i = 0; i < str1.length(); i++) {
			char currChar = str1.charAt(i);
			if(ch == currChar) {
				count++;
			}
		}
		return count;
	}
	private boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		for(int i = 0; i < str1.length(); i++) {
			char currChar = str1.charAt(i);
			int str1Lngth = countSymbols(str1, currChar);
			int str2Lngth = countSymbols(str2, currChar);
			if((str1Lngth - str2Lngth) > 1) {
				return false;
			}
		}
		return true;
	}
}
