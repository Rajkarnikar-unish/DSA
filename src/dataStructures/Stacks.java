package dataStructures;

import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		
		int len = stack.size();
		
		deleteMid(stack, len, 0);
		
		System.out.println(stack);
	}
	
	static void deleteMid(Stack<Integer> stack, int n, int curr ) {
		if (stack.isEmpty() || curr == n) {
			return;
		}
		
		int x= stack.pop();
		
		deleteMid(stack, n, curr+1);
		
		if (curr != n/2) {
			stack.push(x);
		}
	}
	
	public static int[] reverseArray(int[] nums) {
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = nums.length;
		
		for (int i=0; i<n; i++) {
			stack.push(nums[i]);
		}
		for (int i=0;i<n;i++) {
			int num = stack.pop();
			nums[i] = num;
		}
		return nums;
	}
	
	public static String reverseString(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		for (int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		String reversed = "";
		for (int i=0; i<str.length();i++) {
			char c = stack.pop();
			reversed += c;
		}
		return reversed;
	}

}
