/*
 * Name: Estefan Valencia
 * Project description: This program asks the user to insert 4 Strings into an ArrayList.
 * 							It also asks which one to remove, finds which one is the largest and smallest, and then clears the array
 * Course: COSC 311, Fall 2021
 * Homework#: 1.14
 * Due date: 09/12/21 @ 11:59pm
 */

package cosc311.homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderedCollection {
	private ArrayList<Comparable> comArr = new ArrayList<Comparable>();
	
	public void print() {
		if(comArr.isEmpty() != true) {
			System.out.println(comArr);
		} else {
			System.out.print("Cannot print array since the array is currently empty.");
		}
	}
	
	public boolean isEmpty() {
		if(comArr.isEmpty() == true)
			return true;
		else
			return false;
	}
	
	public void makeEmpty() {
		comArr.clear();
	}
	
	
	public void insert(Comparable one) {
		comArr.add(one);
	}
	
	public void remove(Comparable thing) {
		comArr.remove(thing);
	}
	
	@SuppressWarnings("unchecked")
	public Comparable findMax() {
		int maxNum = 0;
		
		for(int i=0; i<comArr.size(); i++) {
			if(comArr.get(i).compareTo(comArr.get(maxNum)) > 0 ) {
				maxNum = i;
			}
		}
		
		return comArr.get(maxNum);
	}
	
	@SuppressWarnings("unchecked")
	public Comparable findMin() {
		int minNum = 0;
		
		for(int i=0; i<comArr.size(); i++) {
			if(comArr.get(i).compareTo(comArr.get(minNum)) < 0 ) {
				minNum = i;
			}
		}
		
		return comArr.get(minNum);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		OrderedCollection com = new OrderedCollection();
		
		System.out.print("Enter a String to insert to the array: ");
		com.insert(input.next());
		
		System.out.print("\nEnter a String to insert to the array: ");
		com.insert(input.next());
		
		System.out.print("\nEnter a String to insert to the array: ");
		com.insert(input.next());
		
		System.out.print("\nEnter a String to insert to the array: ");
		com.insert(input.next());
		
		System.out.print("\nAttempting to printing the Array...\n");
		com.print();
		
		System.out.print("\nEnter a String to remove from the array: ");
		com.remove(input.next());
		
		System.out.print("\nAttempting to print the array...\n");
		com.print();
		
		System.out.print("\nFinding Max value...");
		System.out.println("\nThe max value is " + com.findMax());
		
		System.out.print("\nFinding Min value...");
		System.out.println("\nThe min value is " + com.findMin());
		
		
		System.out.println("\nClearing the entire array....");
		com.makeEmpty();
		
		System.out.print("\nAttempting to print the array...\n");
		com.print();
		
	}
}

/*** Desired output ****

Enter a String to insert to the array: hi

Enter a String to insert to the array: boo

Enter a String to insert to the array: arr

Enter a String to insert to the array: lol

Attempting to printing the Array...
[hi, boo, arr, lol]

Enter a String to remove from the array: arr

Attempting to print the array...
[hi, boo, lol]

Finding Max value...
The max value is lol

Finding Min value...
The min value is boo

Clearing the entire array....

Attempting to print the array...
Cannot print array since the array is currently empty.


*/