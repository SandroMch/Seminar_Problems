import java.util.Arrays;

import acm.program.*;

public class problem55 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter array length: ");
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = readInt("Enter number");
		}
		println(isSorted(nums));
	}
	private boolean isSorted(int[] nums) {
		int[] newNums = Arrays.copyOf(nums, nums.length);
		Arrays.sort(newNums);
		if(Arrays.equals(nums, newNums)) {
			return true;
		}
		return false;
	}
}
