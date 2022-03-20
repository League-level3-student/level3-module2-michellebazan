package _02_Intro_To_Searching_Algorithms;

import java.sql.Array;

public class _01_LinearSearch {
	/*
	 * When finding the location of a certain element in an array, there are many
	 * algorithms that can do so. The simplest is the linear search. This is best
	 * for short unsorted lists of data.
	 */
	/*
	public static void main(String[] args) {
		String[] chicken = new String[]{"one","two","three"};
		linearSearch(chicken, "four");
	}*/
	public static int linearSearch(String[] words, String value) {
		// 1. Complete the method using a for loop to find the value
		// in the array. Return the location in the array
		// where the value was found.
		// If the value is not found in the array, return -1.
		int indexOfValue = -1;
		System.out.println("Using Linear Search on array to find: " + value);
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(value)) {
				indexOfValue = i;
				//System.out.println("Found " + value + " at " + indexOfValue);
				break;
			}
		}
		//System.out.println("Did not find value in the array " + indexOfValue);
		return indexOfValue;
	}
}
