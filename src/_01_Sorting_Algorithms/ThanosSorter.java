package _01_Sorting_Algorithms;

import java.util.Random;

import _00_Intro_to_Sorting_Algorithms._01_SortedArrayChecker;

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

		int max = arr.length - 1;
		int min = 0;
		boolean isOrdered = false;
		// int orange = 0;
		int secondhalf = max / 2;
		boolean isFirstRound = true;

		while (!_01_SortedArrayChecker.intArraySorted(arr)) {
			for (int i = 0; i < arr.length - 1; i++) {
				display.updateDisplay();

				/*
				 * if (arr[i] > arr[i + 1]) { display.updateDisplay();
				 * 
				 * orange++; }
				 */
			}

			// if (orange > 0) {
			System.out.println("I am.. Inevitable");
			// orange = 0;
			
			Random rand = new Random();
			int randy = rand.nextInt(2);
			min = findMin(arr);
			max = findMax(arr);
			
			if((max-min) <= 0) {
				break;
			}
			
			System.out.println("min: " + min + " max: " + max);
			if (randy == 1) {
				// second half
				// min = min + (max-min) / 2;
				// max = arr.length;
				for (int k = max; k > min+(max-min)/2; k--) {
					arr[k] = 0;
				}
				display.updateDisplay();

				// ???
				// max = min*2;

			} else {
				// first half

				// int tempMax = (max) / 2;

				for (int q = min; q < min+(max-min)/2; q++) {
					arr[q] = 0;
				}

				// ???
				// min = max/2;
			}
			display.updateDisplay();
			// } else {
			// System.out.println("Perfectly balanced, as all things should be");
			// = true;
			// display.updateDisplay();
			// }

		}
		System.out.println("Perfectly balanced, as all things should be");

	}

	int findMin(int[] arr) {
		// start at the start of the array, check each element, if not zero return the
		// index
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return i;
			}
		}
		return 0;
	}

	int findMax(int[] arr) {
		// start at the end of the array, check each element, if not zero return the
		// index
		for (int i = arr.length - 1; i > -1; i--) {
			if (arr[i] != 0) {
				return i;
			}
		}
		return 0;
	}
}
