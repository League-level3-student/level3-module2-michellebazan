package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	int[] arr = { 3, 6, 2, 1, 8, 9, 22, 55, 35, 77 };

	public BubbleSorter() {
		type = "Bubble";
	}

	/*
	 * Use the bubble sorting algorithm to sort the array. You can use
	 * display.updateDisplay() to show the current progress on the graph.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int check = 0;
		while (check == 0) {
			check = 1;
			for (int i = 0; i < array.length; i++) {
				for (int k = 0; k < array.length - 1; k++) {
					display.updateDisplay();
					if (array[k] > array[k]) {
						check = 0;
						int temp = array[k];
						array[k] = array[k + 1];
						array[k + 1] = temp;
					}
				}
			}
		}
		display.updateDisplay();
	}
}
