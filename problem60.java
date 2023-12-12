import java.util.ArrayList;

import acm.program.*;

public class problem60 extends ConsoleProgram {
	int n;

	public void run() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while (n != -1) {
			nums.add(n);
			n = readInt("Enter number: ");
		}
		println(nums);
	}
}
