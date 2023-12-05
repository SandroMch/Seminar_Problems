

import acm.program.*;

public class problem56 extends ConsoleProgram {
	int n;
	public void run() {
		n = readInt("Enter array length: ");
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = readInt("Enter numbers: ");
		}
		println(sortNums(nums));
	}
	private int[] sortNums(int[] nums) {
		int[] newArray = new int[n];
		return newArray;
	}
}
