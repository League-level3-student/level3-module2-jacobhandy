package _00_Sorting_Algorithms;

public class InsertionSorter extends Sorter {
	public InsertionSorter() {
		type = "Insertion";
	}
	
	// Insertion Sort is similar to Bubble Sort but a little more efficient
	//  You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {		
		//1. make a for loop that starts at 1 and goes through 
		// the length of the array 
		for(int a = 1; a < array.length; a++) {
			for(int i  = a; i > 0; a--) {
				if(array[i] < array[i - 1]) {
					int swap = array[i - 1];
					array[i - 1] = array[i];
					array[i] = swap;
					display.updateDisplay();
				}
				display.updateDisplay();
			}
			display.updateDisplay();
		}
			//2. make another for loop that starts at i and counts down
        	//   while j is greater than 0

				//3. if the element at j is less than the element at j - 1,
            	//   then swap them
	}
}
