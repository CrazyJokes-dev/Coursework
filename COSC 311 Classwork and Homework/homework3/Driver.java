/*
 * Name: Estefan Valencia
 * Project description: This is the driver program for SinglyLinkedList.java, DoublyLinkedList.java and deque.java
 * Course: COSC 311, Fall 2021
 * Homework#: 3.2 & 3.28
 * Due date: 10/3/2021 @ 11:59pm
 */

package cosc311.homework3;

public class Driver {

	public static void main(String[] args) {
		
		System.out.print("Singly Linked List\n");
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.insert(one);
		sl.insert(two);
		sl.insert(three);
		sl.insert(four);
		sl.insert(five);
		
		System.out.print("Before the swap: ");
		sl.printList();
		
		sl.swap(two, three);
		System.out.print("After the swap: ");
		sl.printList(); 
		System.out.println();
		
		System.out.print("Doubly Linked List\n");
		Node one2 = new Node(1);
		Node two2 = new Node(2);
		Node three2 = new Node(3);
		Node four2 = new Node(4);
		Node five2 = new Node(5);
		
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.insert(one2);
		dl.insert(two2);
		dl.insert(three2);
		dl.insert(four2);
		dl.insert(five2);
		
		System.out.print("Before the swap: ");
		dl.printList();
		
		dl.swap(four2, five2);
		System.out.print("After the swap: ");
		dl.printList(); 
		System.out.println();
		
		System.out.print("Deque implemented using a LinkedList\n");
		Node one3 = new Node(1);
		Node two3 = new Node(2);
		Node three3 = new Node(3);
		Node four3 = new Node(4);
		Node five3 = new Node(5);
		
		deque dq = new deque();
		
		dq.push(one3);
		dq.push(two3);
		dq.push(three3);
		dq.push(four3);
		dq.printQueue();
		
		System.out.print("Number that was popped: ");
		System.out.print(dq.pop() + "\n");
		dq.printQueue();
		
		System.out.println("Injected the number " + five3.getData());
		dq.inject(five3);
		dq.printQueue();
		
		System.out.println("Rejected the number " + dq.reject());
		dq.printQueue();
		
	}

}

/** Desired Output

Singly Linked List
Before the swap: 1 2 3 4 5 
After the swap: 1 3 2 4 5 

Doubly Linked List
Before the swap: 1 2 3 4 5 
After the swap: 1 2 3 5 4 

Deque implemented using a LinkedList
1 2 3 4 
Item that was popped: 4
1 2 3 
Injected the number 5
5 1 2 3 
Rejected the number 5
1 2 3 

 */
