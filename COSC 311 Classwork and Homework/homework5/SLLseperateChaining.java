package cosc311.homework5;

import java.util.LinkedList;
import java.util.List;

public class SLLseperateChaining<AnyType> {
	private SinglyLinkedList<AnyType>[] theLists;
	private int currentSize;
	
	public SLLseperateChaining() {
		this(101);
	}
	
	public SLLseperateChaining(int size) {
		theLists = new SinglyLinkedList[nextPrime(size)];
		for(int i = 0; i < theLists.length; i++)
			//theLists[i] = new LinkedList<>();
			theLists[i] = new SinglyLinkedList<>();
	}
	
	public void makeEmpty() {
		for(int i = 0; i < theLists.length; i++)
			theLists[i].clear();
		currentSize = 0;
	}
	
	public void insert(AnyType x) {
		SinglyLinkedList<AnyType> whichList = theLists[myHash(x)];
		if(!whichList.contains(x)) {
			whichList.insert(x);
			
			if(++currentSize > theLists.length)
				rehash();
			
		}
	}
	
	public void remove(AnyType x) {
		SinglyLinkedList<AnyType> whichList = theLists[myHash(x)];
		if(whichList.contains(x)) {
			whichList.remove(x);
			currentSize--;
		}
	}
	
	public boolean contains(AnyType x) {
		SinglyLinkedList<AnyType> whichList = theLists[myHash(x)];
		return whichList.contains(x);
	}
	
	private void rehash() {
		List<AnyType>[] oldLists = (List<AnyType>[]) theLists;
		
		theLists = new SinglyLinkedList[nextPrime(2 * theLists.length)];
		for(int i = 0; i < theLists.length; i++)
			theLists[i] = new SinglyLinkedList<>();
		
		//copy table
		currentSize = 0;
		for(int j = 0; j < oldLists.length; j++)
			for(AnyType item : oldLists[j])
				insert(item);
	}
		
	
	private int myHash(AnyType x) {
		int hashValue = x.hashCode();
		
		hashValue %= theLists.length;
		if(hashValue < 0)
			hashValue += theLists.length;
		
		return hashValue;
	}
	
	private int nextPrime(int n) {
		n++;
		for (int i = 2; i < n; i++) {
			if(n%i == 0) {
				n++;
				i=2;
			} else {
				continue;
			}
		}
		return n;
	}
	
	public void printList() {
		
		for(int j = 0; j < theLists.length; j++)
			//for(int i = 0; i < theLists[j].size; i++)
				theLists[j].printList();
	}
	
}
