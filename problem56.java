
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class problem56 extends ConsoleProgram {
	int n;

	public void run() {
		int n = readInt("Enter array length: ");
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = readInt("Enter number: ");
		}
		findMinMax(nums, n);
		// for(int i = 0; i < n; i++) {
		// for(int j = i+1; j < n; j++) {
		// if(nums[i] > nums[j]) {
		// int number = nums[i];
		// nums[i] = nums[j];
		// nums[j] = number;
		// }
		// }
		// }
		// println(Arrays.toString(nums));
	}

	private void findMinMax(int[] nums, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] > nums[j]) {
					int currNum = nums[i];
					nums[i] = currNum;
				}
			}
		}
		println(Arrays.toString(nums));
	}

}
