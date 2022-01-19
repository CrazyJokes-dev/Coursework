/*
 * Name: Estefan Valencia
 * Project description: This program is a Node so that the SinglyLinkedList.java, DoublyLinkedList.java, and deque.java can use LinkedList
 * Course: COSC 311, Fall 2021
 * Homework#: 3.2
 * Due date: 10/3/2021 @ 11:59pm
 */

package cosc311.homework3;

public class Node {
	private int data;
	private Node next;
	private Node previous;
	
	public Node(int d) {
		data = d;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public Node getPrevious() {
		return previous;
	}
	
	public void setPrevious(Node n) {
		previous = n;
	}
	
	public int getData() {
		return data;
	}
	
	public String toString() {
		return "" + data;
	}
}
