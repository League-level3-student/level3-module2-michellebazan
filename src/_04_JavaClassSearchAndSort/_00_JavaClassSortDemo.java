package _04_JavaClassSearchAndSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class _00_JavaClassSortDemo {
    public static void main(String[] args) {
        /*
         * Now that you're familiar with basic searching and sorting
         * algorithms, it's time to learn how to sort using the Arrays and
         * Collections classes that are included with Java. Both of these
         * classes make searching and sorting more straightforward.
         * 
         * -Use the Arrays.sort(arr) method in the Arrays class to sort an
         * array. The default ordering is ascending order for numbers and
         * alphabetical for characters and Strings.
         * 
         * -Use the Collections.sort(list) in the Collections class to sort
         * an ArrayList. The default ordering is ascending order for numbers
         * and alphabetical for characters and Strings.
         * 
         * For further reference:
         * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
         * https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
         */
        
        /*
         * Sorting an array using the Arrays class
         */
        int[] intArr = {5, 4, 3, 2, 1, 0};
        
        // Sort array in place, no need to save output in a return variable
        Arrays.sort(intArr);
        
        System.out.println("Sorted array using the Arrays class:");
        
        for( int i : intArr ) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /*
         * Sorting an ArrayList using the Collections class
         */
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(5.0);
        doubleList.add(3.0);
        doubleList.add(2.0);
        doubleList.add(4.0);
        doubleList.add(0.0);
        doubleList.add(1.0);
        
        // Sort list in place, not need to save output in a return variable
        Collections.sort(doubleList);
        
        System.out.println("Sorted ArrayList using the Collections class:");
        
        for( Double i : doubleList ) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /*
         * Sorting an ArrayList alphabetically based on the LAST letter using
         * the Collections class and a new class
         */
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("xyzF");
        strList.add("zzzA");
        strList.add("zyaC");
        strList.add("bytB");
        strList.add("wqgE");
        strList.add("voiD");
        
        class MyCustomCompareClass implements Comparator<String> {
            @Override
            public int compare(String str1, String str2) {
                String lastLetter1 = str1.charAt(str1.length()-1) + "";
                String lastLetter2 = str2.charAt(str2.length()-1) + "";
                
                return lastLetter1.compareTo(lastLetter2);
            }
        }
        
        Collections.sort(strList, new MyCustomCompareClass());
        
        System.out.println("Sort by last letter using the Collections class:");
        
        for( String str : strList ) {
            System.out.print(str + " ");
        }
    }
}
