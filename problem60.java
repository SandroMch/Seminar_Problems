import java.util.ArrayList;

import acm.program.*;

public class problem60 extends ConsoleProgram {
	int n;

	public void run() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while (true) {
			n = readInt("Enter number: ");
			nums.add(n);
			if(n == -1) {
				break;
			}
		}
		int m = nums.size();
		ArrayList<Integer> newNums = new ArrayList<Integer>();
		for(int i = m; i >= 0; i--) {
			newNums.add(nums.get(i));
		}
		println(newNums);
	}
}
