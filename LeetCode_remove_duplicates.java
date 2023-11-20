import acm.program.ConsoleProgram;

public class LeetCode_remove_duplicates extends ConsoleProgram {
	public void run () {
		String input = readLine("Enter Text : ");
		println(removeDuplicates(input));
	}
	
	private String removeDuplicates(String input) {
		input.trim();
		
		String answer = "";
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) != answer.charAt(i)) {
					answer += input.charAt(i);
				}
			}
		}
		
		return answer;
	}
	
}	
