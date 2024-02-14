package dataStructures;

import java.util.Arrays;

public class ArrayDS {

	public static void main(String[] args) {

		int[] nums = {1, 1, 2, 3, 4, 6, 8, 9};
		
		int target = 11;
		
		int start = 0;
		int end = nums.length - 1;
		
		while(start<end) {
			int sum = nums[start] + nums[end];
			if (sum == target) {
				System.out.println(nums[start] + " and " + nums[end] + " = " + target);
				break;
			} else if (sum < target) {
				start++;
				continue;
			} else {
				end--;
				continue;
			}
		}
		
//		for (int i=0; i<nums.length;i++) {
//			for (int j = 1; j<nums.length; j++ ) {
//				if (nums[i] + nums[j] == target) {
//					System.out.println(nums[i] + " and " + nums[j] + " = " + target);
//				}
//			}
//		}
//		System.out.println("Not found");
		

	}

}
