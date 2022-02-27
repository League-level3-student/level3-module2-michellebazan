package _01_Sorting_Algorithms;

import java.util.Random;

public class ThanosSorter extends Sorter {
	public ThanosSorter() {
		type = "Thanos";
	}

	/*
	 * Thanos Sort is the sorting algorithm used by mighty titan Thanos. When Thanos
	 * observes that the array is unsorted, he simply snaps his fingers and removes
	 * half of the array items to bring balance to the array. Thanos will keep
	 * snapping his fingers until the remaining elements are completely sorted. For
	 * example: int[] arr = {12, 100, 200, 201, 97, 33, 100, 687};
	 * 
	 * Thanos looks at this array from left to right and sees the the first element
	 * that isn't greater than the previous one is 97 (12, 100, 200, 201 are all in
	 * order). In quiet rage, Thanos randomly picks half of the elements in the
	 * array and removes them. In this case he removes the second half, so the array
	 * now looks like: {12, 100, 200, 201, 0, 0, 0, 0} // second half removed
	 * 
	 * The remaining non-0 values are now in order and balance is restored to the
	 * array. If Thanos removed the first half, the array would be: {0, 0, 0, 0, 97,
	 * 33, 100, 687}
	 * 
	 * The first unordered number is 33, so Thanos snaps his fingers and removes
	 * half again: {0, 0, 0, 0, 0, 0, 100, 687} // first half or {0, 0, 0, 0, 97,
	 * 33, 0, 0} // second half
	 * 
	 * If the first half is removed the result is sorted. If the second half is
	 * removed 33 isn't sorted so Thanos snaps his fingers again! The result is
	 * either: {0, 0, 0, 0, 0, 33, 0, 0} // first half or {0, 0, 0, 0, 97, 0, 0, 0}
	 * // second half
	 * 
	 * NOTE: The algorithm doesn't necessarily have to take away half from the front
	 * or back of the array. You can implement an algorithm that takes elements away
	 * randomly until half (in this case (n-1)/2) remain. The algorithm is up to
	 * you!
	 */
	@Override
	void sort(int[] arr, SortingVisualizer display) {

		int max = arr.length;
		int min = 0;
		boolean isOrdered = false;
		int orange = 0;

		while (isOrdered == false) {
			for (int i = min; i < max - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					orange++;
				}
			}

			if (orange >= 0) {
				//System.out.println("I am.. Inevitable");
				orange = 0;

				Random rand = new Random();
				int randy = rand.nextInt(2);
//i need to fix min and max lol... it is infinite loop
				if (randy == 1) {
					//second half
					min = (max) / 2;
					max = arr.length;
					for (int k = min; k < max; k++) {
						arr[k] = 0;
					}
				} else {
					//first half
					max = (max) / 2;
					min = 0;
					for (int q = min; q < max; q++) {
						arr[q] = 0;
					}
				}
				display.updateDisplay();
			} else {
				System.out.println("Perfectly balanced, as all things should be");
				isOrdered = true;
				display.updateDisplay();
			}

		}

	}
}
