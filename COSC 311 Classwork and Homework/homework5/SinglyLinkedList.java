package cosc311.homework5;



public class SinglyLinkedList<E> {
	static class Node<AnyType> {
		AnyType data;
		Node<?> next;
		
		public Node(AnyType data) {
			this.data = data;
		}
		
	}
	private Node<?> head;
	public int size;
	
	public void insert(E x) {
		Node<?> n = new Node<Object>(x);
		Node<?> current = head;
		
		if(head == null) {
			head = n;
			return;
		}
		
		while(current.next != null)
			current = current.next;
		current.next = n;
		
		size++;
	}
	
	public boolean contains(E x) {
		Node<?> current = head;
		
		while(current != null) {
			if(current.data.equals(x))
				return true;
			current = current.next;
		}
		return false;
	}
	
	public void printList() {
		Node<?> current = head;
		
		while(current != null) {
			System.out.print(current + " ");
			current = current.next;
		}
		
		System.out.println();	
	}
	
	public void insertFirst(int d) {
		Node<?> n = new Node<Object>(d);
		
		n.next = head;
		
		head = n;
	}
	
	public void remove(E x) {
		Node<?> n = new Node<>(x);
		Node<?> current = head;
		
		if(head.equals(n)) {
			head = head.next;
			return;
		}
			
		while(!current.next.equals(n))
			current = current.next;
		
		current.next = n.next;
	}
	
	public void clear() {
		head.next = null;	
	}
}
