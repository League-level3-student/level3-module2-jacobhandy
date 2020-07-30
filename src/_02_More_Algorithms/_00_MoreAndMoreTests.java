package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {
	public String multiply(int x, int y) {
		int z = x * y;
		return x + " x " + y + " = " + z;
		
	}
	
	@Test
   public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
	public Boolean isPrime(int value) {
		for(int a = 2; a < value; a++) {
			if(value % a == 0) {
				return false;
			}
		}
		return true;
	}
	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	public Boolean isSquare(double value) {
		for(int a = 1; a <= value; a++) {
			if(value/a == a) {
				return true;
			}
		}
		return false;
	}
	@Test
	  public void SquareTest() {
	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	
	public Boolean isCube(double value) {
		for(int a = 1; a <= value; a++) {
			if(value/a/a == a) {
				return true;
			}
		}
		return false;
	}
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }



}
