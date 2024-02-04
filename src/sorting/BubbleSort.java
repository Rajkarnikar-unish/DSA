package sorting;
import java.util.*;

public class BubbleSort {
	
	public static void main(String[] args) {
        int[] nums = {28, 11, 17, 48, 39};
    
        //Bubble Sort
        // for (int i=0; i<nums.length; i++) {
        //     for (int j=0; j<nums.length-1; j++) {
        //         if (nums[j]>nums[j+1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        
        // do {
        //     swapped = false;
        //     for (int i=1; i<nums.length; i++) {
        //         if (nums[i-1]>nums[i]) {
        //             int temp = nums[i-1];
        //             nums[i-1]  = nums[i];
        //             nums[i] = temp;
                    
        //             swapped = true;
        //         }
        //     }
        // } while(swapped);
        
        //            0    1   2   3   4
        
        boolean swapped;
        
        /**
         * 0	1	2 	3	4
        //[28, 11, 17, 48, 39]
         * i =11
         * i-1=28
         * 28>11 true
         * temp = 28
         * 1= 11
         * 0 = temp 11
         * 
         * 0	1	2 	3	4
         * [11, 28, 17, 48, 39]
         * 
         * i = 17 = 2
         * i-1 = 28
         * 28>17 true
         * temp = 28 = i-1
         * nums[2] = nums[i-1] = 28 
         * nums[1] = nums[2] = 17
         * nums[2] = temp = 28
         * 
         * 0	1	2 	3	4
         * [11, 17, 28, 48, 39]
         * i = 3 = 48
         * i-1 = 2
         * nums.2>nums.i
         * 28>48 false
         * 
         * 0	1	2 	3	4
         * [11, 17, 28, 48, 39]
         * i = 4
         * i-1 = 3
         * nums.i-1 > nums.i
         * 48>39 true
         * temp = i-1 = 48
         * nums[i-1] = nums[i] = 39
         * nums[i]4 = temp = 48
         *
         */
        
        do {
            swapped = false;
            for (int i=1; i<nums.length; i++) {
                if (nums[i-1]>nums[i]) {
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                    swapped = true;
                }
            }
        }while(swapped);
        
        System.out.println(Arrays.toString(nums));	
	}
}
