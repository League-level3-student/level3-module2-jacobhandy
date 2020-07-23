package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		_00_LinearSearch joe= new _00_LinearSearch();
		String[] a = new String[2];
		a[0] = "x";
		a[1] = "y";
		assertEquals(1, joe.linearSearch(a, "y"));
		a[0] = "1";
		a[1] = "2";
		assertEquals(0, joe.linearSearch(a, "1"));
		//a[2] = "3";
		assertEquals(-1, joe.linearSearch(a, "z"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		_01_BinarySearch joe= new _01_BinarySearch();
		int[] array = new int[3];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		//array[3] = 3;
		assertEquals(0, joe.binarySearch(array, 0, 3, 0));
		assertEquals(1, joe.binarySearch(array, 0, 3, 1));
		assertEquals(-1, joe.binarySearch(array, 0, 3, -10));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
