// Name: Estefan Valencia
// Class: COSC 311, Fall 2021
// Due date: October 31, 2021
// Description: Methods for the problems 4.37 and 4.46

package cosc311.homework4;

import java.util.Arrays;
import cosc311.homework4.BST.Node;

public class BSTMethods {
	String thisB = "";
	String otherB = "";
	
	//checks if the key in a Node is within k1 and k2, then proceeds to recursively go down the tree and repeat the process
	public void print(Node n, int k1, int k2) {
		if(n.key <= k2 && n.key >= k1)
			System.out.print(n.key + " ");
		
		if(n.left != null && n.key > k1)
			print(n.left, k1, k2);
		
		if(n.right != null && n.key < k2)
			print(n.right, k1, k2);
	}
	
	//This method goes through the nodes of both trees and outputs each node they come across into a String
	//It then turns that string into an array and sorts it then checks if the both arrays are equal
	//and if they are, then the two trees are similar
	//
	// Running time = O(n log n)
	public void isSimilar(Node thisTree, Node otherTree) {
		if(root == null) {
			System.out.println("These two binary trees are NOT similar");
			return;
		}
		if(thisTree == null || otherTree == null)
			return;
		
		isSimilar(thisTree.left, otherTree.left);
		isSimilar(thisTree.right, otherTree.right);
		
		thisB += thisTree.key + " ";
		otherB += otherTree.key + " ";
		
		char[] arr = thisB.toCharArray();
		char[] arr2 = otherB.toCharArray();
		
		//The purpose of this loop is to get rid of the other recursive calls until
		//only one is left. This way the console doesn't have multiple outputs
		for(int i = 2; i < arr.length; i++) {
			return;
		}
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		if(Arrays.toString(arr).equals(Arrays.toString(arr2))) {
			System.out.println("The two binary trees are similar");
			thisB = "";
			otherB = "";
			return;
		} else {
			System.out.println("The two binary tree are NOT similar");
			thisB = "";
			otherB = "";
			return;
		}
	}
	
}

/** Desired Output

Problem 4.37 below:
20 15 10 18 

Problem 4.46 below:
The two binary trees are similar

**/

