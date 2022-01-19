package cosc311.homework5;

public class Driver {

	public static void main(String[] args) {
		SLLseperateChaining<Integer> s = new SLLseperateChaining<Integer>(10);
		
		s.insert(4371);
		s.insert(1323);
		s.insert(6173);
		s.insert(4199);
		s.insert(9679);
		s.insert(1989);
		
		s.printList();
		

	}

}
