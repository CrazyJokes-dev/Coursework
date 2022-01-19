/*
 * Name: Estefan Valencia
 * Project description: This program makes a queue implemented by a Doubly Linked List
 * Course: COSC 311, Fall 2021
 * Homework#: 3.28
 * Due date: 10/3/2021 @ 11:59pm
 */

package cosc311.homework3;

public class deque {
	private Node head;
	private Node tail;
	
	
	public void push(Node n) {
		if(head == null) {
			head = n;
			tail = n;
			return;
		}
		
		tail.setNext(n);
		n.setPrevious(tail);
		tail = n;
	}
	
	public int pop() {
		if(head == tail) {
			Node popNode = head;
			head = head.getNext();
			tail = head;
			return popNode.getData();
		}
		
		Node popNode = tail;
		tail.getPrevious().setNext(null);
		tail = tail.getPrevious();
		popNode.setPrevious(null);
		return popNode.getData();
	}
	
	public void inject(Node n) {
		Node current = head;
		
		current.setPrevious(n);
		n.setNext(current);
		head = n;
	}
	
	public int reject() {
		Node current = head;
		
		head = current.getNext();
		head.setPrevious(null);
		return current.getData();
	}
	
	public void printQueue() {
		Node current = head;
		
		while(current != null) {
			System.out.print(current + " ");
			current = current.getNext();
		}
		System.out.println();
	}
	
}