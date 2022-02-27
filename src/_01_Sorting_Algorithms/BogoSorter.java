package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean isOrdered = false;
		int orange = 0;
		while (isOrdered == false) {
			for (int i = 0; i < array.length; i++) {
				for (int k = 0; k < array.length - 1; k++) {

					if (array[k] > array[k + 1]) {
						orange++;
					}
				}
			}

			if (orange == 0) {
				display.updateDisplay();
				isOrdered = true;
			} else {
				Random rand = new Random();
				int x = 0;
				int y = 0;
				while (x == y) {
					x = rand.nextInt(array.length);
					y = rand.nextInt(array.length);
				}
				int temp = array[x];
				array[x] = array[y];
				array[y] = temp;
				display.updateDisplay();
			}

		}

	}
}
