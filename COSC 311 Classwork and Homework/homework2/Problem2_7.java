/*
 * Name: Estefan Valencia
 * Project description: This program answers problem 2.7 and tells you the running time of these programs
 * Course: COSC 311, Fall 2021
 * Homework#: 2.7
 * Due date: 10/3/2021 @ 11:59pm
 */

package cosc311.homework2;

public class Problem2_7 {
	
	//O(N)  actual run time = O(N)
	//N = 100      .0000019 seconds
	//N = 1000     .0000065 seconds
	//N = 10000    .0000573 seconds
	public static int oneFor(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++ )
			sum++;
		
		return sum;
	}
	
	//O(N^2)  actual run time = O(N^2)
	//N = 100      0.0000593 seconds
	//N = 1000     0.0035136 seconds
	//N = 10000    0.0037094 seconds
	public static int twoFor(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++ )
			for(int j = 0; j < n; j++ )
				sum++;
		
		return sum;
	}
	
	//O(N^3)  actual run time = O(N^3)
	//N = 100       .003962 seconds
	//N = 1000      .0049229 seconds
	//N = 10000     .0046748 seconds
	public static int multiplyN_TwoFor(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++ )
			for(int j = 0; j < n * n; j++ )
				sum++;
		
		return sum;
	}
	
	//O(N^2)  actual run time = O(N^1.65)
	//N = 100       .0000321 seconds
	//N = 1000      .0017873 seconds
	//N = 10000     .0019504 seconds
	public static int iLimit_TwoFor(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++ )
			for(int j = 0; j < i; j++ )
				sum++;
		
		return sum;
	}
	
	//O(N^5) actual run time = O(N^3.8)
	//N = 100    .0022238 seconds
	//N = 1000   .3353668 seconds
	//N = 10000  Way too long
	public static int threeFor(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++ )
			for(int j = 0; j < i * i; j++ )
				for(int k = 0; k < j; k++ )
					sum++;
		
		return sum;
	}
	
	//O(N^3)  actual run time = O(N^2.9)
	//N = 100     .0043238 seconds
	//N = 1000    .7354948 seconds
	//N = 10000   Way too long
	public static int if_threeFor(int n) {
		int sum = 0;
		
		for(int i = 1; i < n; i++ )
			for(int j = 1; j < i * i; j++ )
				if( j % i == 0 )
					for(int k = 0; k < j; k++ )
						sum++;
		
		return sum;
	}
	
	public static void actualBigOh(int n) {
		double methodSum = threeFor(10); //put your method that you want to test here
		double toThePowerOf = Math.log10(methodSum);
		
		System.out.print("\nThe actual run time of the method is (in Big-Oh): N^");
		System.out.print(toThePowerOf + "\n");
	}	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		oneFor(100);
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		actualBigOh(10);
		
	}
}
