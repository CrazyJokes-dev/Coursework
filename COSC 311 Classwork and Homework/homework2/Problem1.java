/*
 * Name: Estefan Valencia
 * Project description: This program tells you the integer array that gives you the smallest sum continguous subarray
 * Course: COSC 311, Fall 2021
 * Homework#: 2
 * Due date: 10/3/2021 @ 11:59pm
 */


package cosc311.homework2;

import java.util.*;

public class Problem1 {
	
	public static int[] minSumSubArray(int[] arr)	{
		// run time is O(N^2)
		int minSum = 1000, thisSum = 0;
		int[] testArr = new int[0];
		int[] actualArr = new int[0];
		
		for( int i = 0; i < arr.length; i++ ) {
			thisSum += arr[ i ];
			int[] arr2 = new int[testArr.length+1];
			System.arraycopy(testArr, 0, arr2, 0, testArr.length);
			arr2[arr2.length-1] = i;
			testArr = arr2;
			
			
			
			if(thisSum > 0) {
				thisSum = 0;
				testArr = new int[0];
			} 
			else if( thisSum < minSum ) {
				minSum = thisSum;
				
				actualArr = new int[testArr.length];
				System.arraycopy(testArr, 0, actualArr, 0, testArr.length);
				actualArr = testArr;
			}
		}
		
		return actualArr;
	}
	
	public static void print(int[] arr) {
		int index = 0;
		System.out.print("{");
		for(int num : arr) {
			if(index == arr.length-1)
				System.out.print(num + "}");
			else
				System.out.print(num + ", ");
			index++;
		}
		
	}
	
	public static void main(String args[]) {
		int[] arr = {3, -4, 2, -3, -1, 7, -5};
		int[] subArr = minSumSubArray(arr);
		
		System.out.print("{");
		for(int i = 0; i < subArr.length; i++) {
			if(i == subArr.length-1)
				System.out.print(arr[subArr[i]] + "}");
			else
				System.out.print(arr[subArr[i]] + ", ");
		}
		
	}
}

/** Desired Output

{-4, 2, -3, -1}

**/