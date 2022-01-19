package cosc311.homework4;

public class Driver {

	public static void main(String[] args) {
		BST t = new BST();
		t.insert(20,  10.0);
		t.insert(8,  1.5);
		t.insert(30, -4.8);
		t.insert(5, -4.8);
		t.insert(15, -4.8);
		t.insert(10, -4.8);
		t.insert(18, -4.8);
		
		BST t2 = new BST();
		t2.insert(20,  10.0);
		t2.insert(8,  1.5);
		t2.insert(5, -4.8);
		t2.insert(30, -4.8);
		t2.insert(15, -4.8);
		t2.insert(18, -4.8);
		t2.insert(10, -4.8);
		System.out.println("Problem 4.37 below:");
		t.print(t.root, 10, 20);
		
		
		System.out.println("\n\nProblem 4.46 below:");
		t.isSimilar(t.root, t2.root);
	}

}
