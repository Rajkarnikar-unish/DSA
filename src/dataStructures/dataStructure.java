package dataStructures;

import java.util.*;

public class dataStructure {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(97);
		stack.push(34);
		stack.push(45);
		stack.push(8);
		stack.push(15);
		
		System.out.println("Stack");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println("-----------END------------");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(23);
		queue.offer(12);
		queue.offer(57);
		queue.offer(10);
		
		System.out.println("Queue");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println("-----------END------------");

	}
}
