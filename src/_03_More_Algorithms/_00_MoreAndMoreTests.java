package _03_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Uncomment each test and then write the corresponding method in the
 * Algorithms class to make them pass.
 */

public class _00_MoreAndMoreTests {

   @Test
   public void MultTest() {
     assertEquals("10 x 0 = 0", Algorithms.multiply(10, 0));
     assertEquals("10 x 10 = 100", Algorithms.multiply(10, 10));
     assertEquals("8 x 11 = 88", Algorithms.multiply(8, 11));
   }
 
//   @Test
//   public void PrimeTest() {
//     assertTrue(Algorithms.isPrime(3));
//     assertTrue(Algorithms.isPrime(5));
//     assertTrue(Algorithms.isPrime(541));
//     assertFalse(Algorithms.isPrime(4));
//     assertFalse(Algorithms.isPrime(12));
//     assertFalse(Algorithms.isPrime(527));
//   }
//
//   @Test
//   public void SquareTest() {
//     assertTrue(Algorithms.isSquare(4));
//     assertTrue(Algorithms.isSquare(144));
//     assertTrue(Algorithms.isSquare(64));
//     assertTrue(Algorithms.isSquare(10201));
//     assertTrue(Algorithms.isSquare(1));
//     assertFalse(Algorithms.isSquare(3));
//     assertFalse(Algorithms.isSquare(22));
//     assertFalse(Algorithms.isSquare(143));
//   }
//
//   @Test
//   public void CubeTest() {
//     assertTrue(Algorithms.isCube(27));
//     assertTrue(Algorithms.isCube(216));
//     assertTrue(Algorithms.isCube(729));
//     assertTrue(Algorithms.isCube(1));
//     assertFalse(Algorithms.isCube(3));
//     assertFalse(Algorithms.isCube(22));
//     assertFalse(Algorithms.isCube(143));
//   }
}
