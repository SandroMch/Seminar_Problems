import acm.program.*;

public class midterm5 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		String str2 = readLine();
		println(isAnagram(str,str2));
	}

	private int countSymbols(String str,  char ch) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			if (currChar == ch) {
				res++;
			}
		}
		return res;
	}
	private boolean isAnagram(String str , String str2) {
		if(str.length() != str2.length()) return false;
		for(int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			int str1 = countSymbols(str , currChar);
			int stri2 = countSymbols(str2, currChar);
			if(str1 == stri2) {
				return true;
			}
		}
		return false;
	}

}
