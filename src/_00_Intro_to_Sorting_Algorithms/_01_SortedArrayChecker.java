package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
	
	
    public static boolean intArraySorted(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
        	for(int k = 0; k < arr.length - 1; k++) {
        		if(arr[k] > arr[k+1]) {
        			System.out.println("return false");
        			return false;
        		}
        	}
        }
		System.out.println("return true");
        return true;
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    
    public static boolean doubleArraySorted(double[] arr) {
		
    	for(int i = 0; i < arr.length; i++) {
    		for(int k = 0; k < arr.length - 1; k++) {
    			if(arr[k] > arr[k+1]) {
    				return false;
    			}
    		}
    	}
    	
    	return true;
    }

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
    
    public static boolean charArraySorted(char[] arr) {
    	for(int i = 0; i < arr.length; i++){
    		for(int k = 0; k < arr.length - 1; k++) {
    			if(arr[k] > arr[k+1]){
    				return false; 
    			}
    		}
    	}
    	
    	return true;
    }
    
    
    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
    
    public static boolean stringArraySorted(String[] arr) {
    	for(int i = 0; i < arr.length; i++) {
    		for(int k = 0; k < arr.length - 1; k++) {
    			if(arr[k].compareTo(arr[k+1]) > 0) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
