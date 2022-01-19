/*
 * Name: Estefan Valencia
 * Program description: This program asks the user to insert 2 Integers and 2 Strings into an ArrayList. 
 * 							It also asks which one to remove, if something is Present in the array, and then clears the array
 * 						
 * Course: COSC 311, Fall 2021
 * Homework#: 1.13
 * Due date: 09/12/21 @ 11:59pm
 */

package cosc311.homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
	private ArrayList<Object> objsCollected = new ArrayList<Object>();
	
	public void print() {
		if(objsCollected.isEmpty() != true) {
			System.out.println(objsCollected);
		} else {
			System.out.println("Cannot print array since the array is currently empty.");
		}
	}
	
	public boolean isEmpty() {
		if(objsCollected.isEmpty() == true)
			return true;
		else
			return false;
	}
	
	public void makeEmpty() {
		objsCollected.clear();
	}
	
	
	public void insert(Object one) {
		objsCollected.add(one);
	}
	
	public void remove(Object thing) {
		objsCollected.remove(thing);
	}
	
	public boolean isPresent(Object thing) {
		if(objsCollected.contains(thing))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		Collection c = new Collection();
		
		System.out.print("Enter an Integer to insert to the array: ");
		c.insert(input.nextInt());
		
		System.out.print("\nEnter a String to insert to the array: ");
		c.insert(input.next());
		
		System.out.print("\nEnter an Integer to insert to the array: ");
		c.insert(input.nextInt());
		
		System.out.print("\nEnter a String to insert to the array: ");
		c.insert(input.next());
		
		System.out.println("\nAttempting to print the array...");
		c.print();
		
		System.out.print("\nEnter a String to remove from the array: ");
		c.remove(input.next());
		System.out.print("\nEnter an Integer to remove from the array: ");
		c.remove(input.nextInt());
		
		System.out.print("\n");
		c.print();
		
		System.out.print("\nEnter an Integer to check if it's in the array: ");
		System.out.print(c.isPresent(input.nextInt()));
		System.out.print("\n\nEnter a String to check if it's in the array: ");
		System.out.print(c.isPresent(input.next()));
		
		System.out.println("\n\nClearing the entire array....");
		c.makeEmpty();
		
		System.out.print("\nAttempting to print the array...\n");
		c.print();
	
	}
}

/*** Desired output ****

Enter an Integer to insert to the array: 5

Enter a String to insert to the array: your

Enter an Integer to insert to the array: 19

Enter a String to insert to the array: mine

Attempting to print the array...
[5, your, 19, mine]

Enter a String to remove from the array: your

Enter an Integer to remove from the array: 19

[5, mine]

Enter an Integer to check if it's in the array: 5
true

Enter a String to check if it's in the array: your
false

Clearing the entire array....

Attempting to print the array...
Cannot print array since the array is currently empty.

*/

	

