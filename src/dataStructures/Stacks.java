package dataStructures;

import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		
		String s = "{}";
		String s1= "({})";
		String s2 = "[({)]";
		
		System.out.println(validParanthesis(s2));
		
//		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
//		
//		System.out.println(stack);
//		
//		int len = stack.size();
//		
//		deleteMid(stack, len, 0);
//		
//		System.out.println(stack);
	}
	
	static boolean validParanthesis(String s) {
		Stack<Character> paranthesis = new Stack<Character>();
		
		for (char c: s.toCharArray()) {
			if ( c == '(' || c == '{' || c == '[') {
				paranthesis.push(c);
			} else {
				if (paranthesis.isEmpty()) {
					return false;
				}
				char stackTop = paranthesis.peek();
				if ((c == ')' && stackTop == '(') || (c==']' && stackTop == '[') || (c=='}' && stackTop=='{')) {
					paranthesis.pop();
				} else {
					return false;
				}
			}
		}
		return paranthesis.isEmpty();
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
