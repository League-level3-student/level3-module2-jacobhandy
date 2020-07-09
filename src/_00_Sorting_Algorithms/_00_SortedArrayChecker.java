package _00_Sorting_Algorithms;

import java.util.function.BooleanSupplier;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] unsorted) {
		// TODO Auto-generated method stub
		boolean re = true;// = false;
		for(int a = 0; a < unsorted.length; a++) {
			if(a != 0) {
				if(unsorted[a] == unsorted[a-1]+1) {
					 re =true;
					// System.out.println(re);
				}
				else {
					re = false;
					return false;
				} 
			}
		}
		return re;
	}

	public static boolean doubleArraySorted(double[] unsorted) {
		// TODO Auto-generated method stub
		
		//2. Write a static method called doubleArraySorted. 
		//   This method takes in an array of doubles
		//   and it returns a boolean.
		//   The method returns true if the double
		//   array is in ascending order and false otherwise
		boolean re = true;// = false;
		for(int a = 0; a < unsorted.length; a++) {
			if(a != 0) {
				if(unsorted[a] == unsorted[a-1]+1) {
					 re =true;
					// System.out.println(re);
				}
				else {
					re = false;
					//System.out.println(re);
				} 
			 
			}
		}
		return re;
	}

	public static boolean charArraySorted(char[] unsorted) {
		// TODO Auto-generated method stub
		boolean re = true;// = false;
		for(int a = 0; a < unsorted.length; a++) {
			if(a != 0) {
				if(unsorted[a] == unsorted[a-1]+1) {
					 re =true;
					 //System.out.println(re);
				}
				else {
					re = false;
					//System.out.println(re);
				} 
			 
			}
		}
		return re;
	}

	public static boolean stringArraySorted(String[] sorted) {
		// TODO Auto-generated method stub
		boolean re = false;// = false;
		for(int a = 0; a < sorted.length - 1; a++) {
				if(sorted[a].compareTo(sorted[a + 1]) < 0) {
					 re =true;
					 System.out.println(re);
				}
				else {
					re = false;
					break;
				} 
			 
			
		}
		return re;
	}
	
	
	
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)

}
