package _04_JavaClassSearchAndSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_JavaClassSearchDemo {
    public static void main(String[] args) {
        /* 
         * The Arrays and Collections classes use a binary search algorithm to
         * find the specified element. Therefore the array or ArrayList MUST BE
         * SORTED before using the binarySearch() method. If it is not sorted,
         * the results are undefined. If the array or list contains multiple
         * elements with the specified value, there is no guarantee which one
         * will be found.
         * 
         * -Use the Arrays.binarySearch(arr) method in the Arrays class to
         * search for an element in a SORTED array. 
         * 
         * -Use the Collections.binarySearch(list, key) in the Collections
         * class to search for an element in a SORTED ArrayList.
         * 
         * For further reference:
         * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
         * https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
         */
        
        /*
         * Searching an element in an array using the Arrays class
         */
        int[] intArr = {5, 4, 3, 2, 1, 0};
        
        // Sort first, then search
        Arrays.sort(intArr);
        int index = Arrays.binarySearch(intArr, 4);
        
        System.out.println("Search array using the Arrays class:");
        
        for( int i : intArr ) {
            System.out.print(i + " ");
        }
        System.out.println("\n4 found at index: " + index + "\n");

        /*
         * Searching an element in an ArrayList using the Collections class
         */
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("f");
        stringList.add("e");
        stringList.add("d");
        stringList.add("c");
        stringList.add("b");
        stringList.add("a");
        
        // Sort first, then search
        Collections.sort(stringList);
        index = Collections.binarySearch(stringList, "d");
        
        System.out.println("Search ArrayList using the Collections class:");
        
        for( String str : stringList ) {
            System.out.print(str + " ");
        }
        System.out.println("\n\"d\" found at index: " + index);
    }
}
