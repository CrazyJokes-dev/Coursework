/*
 * Name: Estefan Valencia
 * Project description: This program makes a SinglyLinkedList and can swap any 2 adjacent nodes with each other
 * Course: COSC 311, Fall 2021
 * Homework#: 3.2
 * Due date: 10/3/2021 @ 11:59pm
 */

package cosc311.homework3;

public class SinglyLinkedList {
	private Node head;
	
	public void insert(Node n) {
		Node current = head;
		
		if(head == null) {
			head = n;
			return;
		}
		
		while(current.getNext() != null) 
			current = current.getNext();
		current.setNext(n);
		
	}
	
	public void printList() {
		Node current = head;
		
		while(current != null) {
			System.out.print(current + " ");
			current = current.getNext();
		}
		System.out.println();
		
	}
	
	public void swap(Node firstN, Node secondN) {
		//if the nodes aren't adjacent then get the hell out of here
		if(firstN.getNext() != null && !firstN.getNext().equals(secondN)) {
			if(secondN.getNext() != null && !secondN.getNext().equals(firstN))
				return;
		}
			
		
		
		if(secondN.getNext() != null && secondN.getNext().equals(firstN)) {  
			// if the secondN is before the firstN....
			// I'm just swapping variables here so it's easier for me to think about the nodes
			Node temp = secondN;
			secondN = firstN;
			firstN = temp;
		}
		
		//if the swap is at the front of the LinkedList
		if(firstN.equals(head)) {
			//get the Node after the secondN
			Node current = head;
			for(int i = 0; i < 2; i++) {
				if(current.getNext() != null)
					current = current.getNext();
			}
			Node afterSecondN = current;
			
			head = secondN;
			secondN.setNext(firstN);
			firstN.setNext(afterSecondN);
			return;
		}
		
		//if the swap is taking place somewhere in the middle
		if(firstN != head && secondN.getNext() != null) {
			Node current = head;
			Node beforeFirstN = null;
			Node afterSecondN = null;
			
			//we need to get the Node before firstN and the Node after secondN
			while(current != secondN.getNext()) {
				if(current.getNext().equals(firstN)) {
					beforeFirstN = current;
					current = current.getNext();
					
				} else if(current.equals(secondN)) {
					current = current.getNext();
					afterSecondN = current;
					
				} else {
					current = current.getNext();
				}
			}
			
			//now change the links
			beforeFirstN.setNext(secondN);
			secondN.setNext(firstN);
			firstN.setNext(afterSecondN);
		}
		
		//if the swap is taking place at the end of the list
		if(secondN.getNext() == null) {
			Node current = head;
			Node beforeFirstN = null;
			
			//get the node before firstN
			while(current != firstN) {
				if(current.getNext().equals(firstN)) {
					beforeFirstN = current;
					current = current.getNext();
				} else
					current = current.getNext();
			}
			
			//now change the links
			beforeFirstN.setNext(secondN);
			secondN.setNext(firstN);
			firstN.setNext(null);
		}
		
	}
}
