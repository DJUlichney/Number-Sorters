import java.util.Arrays;

public class BubbleSorter implements Sorter {

    // Constructor
    public BubbleSorter(){}

    // Implements the sorting method in the Sorter class using a bubble-sorting algorithm:
    @Override
    public void sortArrayInPlace(int[] array) {
        boolean hasSwapped = true;
        int n = 1;

        while (hasSwapped) {
            hasSwapped = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int min = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = min;
                    hasSwapped = true;
                    System.out.println("(step " + n + "): " + Arrays.toString(array));
                    n++;
                }
            }
        }
        System.out.println("testArray3 (after): " + Arrays.toString(array));
    }
}