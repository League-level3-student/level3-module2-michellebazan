package _00_Intro_to_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _02_SwappingDigitsTest {

    @Test
    void test1() {
        int[] x = {5, 6};
        int[] y = {6, 5};
        _02_SwappingDigits.swapArrayOfTwo(x);
        assertArrayEquals(y, x);
    }
    
    @Test
    void test2() {
        int[] z = {7, 3, 5, 9, 2};
        int[] q = {2, 3, 5, 7, 9};
        _02_SwappingDigits.sortIntArray(z);
        assertArrayEquals(q, z);
    }
    
    @Test
    void test3() {
        int[] m = {7, 3, 9, 5, 2};
        assertEquals(5, _02_SwappingDigits.findMiddle(m));
    }
}
