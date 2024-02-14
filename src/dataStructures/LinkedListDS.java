package dataStructures;

import java.util.*;

public class LinkedListDS {
	
	Node head;
	
	public int countNodes(Node head) {
		int count = 1;
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Node node1 = new Node(12);
		Node node2 = new Node(5);
		Node node3 = new Node(17);
		Node node4 = new Node(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		LinkedListDS list = new LinkedListDS();
		System.out.println(list.countNodes(node1));
		
	}
}

/*
 * LinkedLists
 * 
 * LinkedList can be used as a Stack as well as Queue
 * 
 * Linked lists consists of two parts, both different types
 * one is a simple variable, and another is a pointer variable
 * 
 * structure node {
 * 		int data;
 * 		structure node next;
 * }
 * 
 * the above structure contains two variables,
 * one is a data of integer type,
 * another is next that is a pointer containing address of next node.
 * 
 * Singly-Linked list
 * This list can be defined as the collection of an ordered set of elements. A node in the singly linked list
 *  consists of two parts: data part and link part. Data part of the node stores actual information that is represented by the
 *  node, another is a pointer variable.
 *  
 * Doubly-Linked list
 * Doubly linked list is a complex type of linked list in which node contains a pointer to the previous as well as the next node,
 * the node consists of three parts: node data, next pointer, and previous pointer
 * 
 * Circular singly Linked list
 * Here, the last node of the list contains a pointer to the first node of the list.
 * 
 * Circular Doubly Linked List
 * This is a more complex data structure,
 * doesn't contain NULL in any of the nodes,
 * last node contains address of the first node,
 * first node also contains the address of the last node in its previous pointer
 * 
 * Advantages
 * Dynamic data structure
 * Insertion and deletion
 * Memory efficient
 * Implementation
 * 
 * Disadvantages
 * Memory usage
 * Traversal
 * Reverse Traversing
 * 
*/