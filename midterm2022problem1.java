import acm.program.*;

public class midterm2022problem1 extends ConsoleProgram {
	public void run() {
		String str1 = readLine();
		String str2 = readLine();
		println(devideStr(str1, str2));

	}

	private boolean devideStr(String str1, String str2) {
		String finalStr1 = "";
		for (int i = 1; i < str1.length(); i++) {
			String part1 = str1.substring(0, i);
			String part2 = str1.substring(i);
			if (equalOrNot(part1, part2, str2)) {
				return true;
			}
		}
		return false;
	}

	private boolean equalOrNot(String part1, String part2, String str2) {
		for (int i = 0; i < part1.length(); i++) {
			String afterRm1 = removeAso(part1, part1.charAt(i));
			for (int j = 0; j < part2.length(); j++) {
				String afterRm2 = removeAso(part2, part2.charAt(j));
				String finalString = afterRm1 + afterRm2;
				if (finalString.equals(str2)) {
					return true;
				}
			}
		}
		return false;
	}

	private String removeAso(String text, char ch) {
		String res = "";
		for (int i = 0; i < text.length(); i++) {
			if (ch != text.charAt(i)) {
				res += text.charAt(i);
			}
		}
		return res;
	}
}
