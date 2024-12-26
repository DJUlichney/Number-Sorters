import java.util.Arrays;

/**
 * InsertionSorter class.
 * @author Dennis Ulichney
 */
public class InsertionSorter implements Sorter {

	/**
	 * Constructor
	 */
	public InsertionSorter() {
		// nothing needs to be done at here
	}

	/**
	 * sortArrayInPlace can take a passed-in array and sort its element in ascending sorted order
	 * You need to use the insertion sort algorithm in this function.
	 */
	@Override
	public void sortArrayInPlace(int[] array) {
		int n = 1;
		for (int i = 1; i < array.length; i++) {
			int j = i;

			while (j > 0 && array[j - 1] > array[j]) {
				int min = array[j];
				array[j] = array[j-1];
				array[j-1] = min;
				j--;
				System.out.println("(step " + n + "): " + Arrays.toString(array));
				n++;
			}
		}
		System.out.println("testArray1 (after): " + Arrays.toString(array));
	}
}