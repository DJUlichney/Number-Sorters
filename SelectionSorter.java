import java.util.Arrays;

public class SelectionSorter implements Sorter {

    // Constructor
    public SelectionSorter(){}

    // Implements the sorting method in the Sorter class using a selection-sorting algorithm:
    @Override
    public void sortArrayInPlace(int[] array) {
        int n = 1;

        for (int j = 0; j < array.length; j++){
            int minIndex = j;

            for (int i = j; i < array.length; i++){
                if (array[minIndex] > array[i]) {
                    minIndex = i;
                }
            }

            int min = array[minIndex];
            array[minIndex] = array[j];
            array[j] = min;
            System.out.println("(step " + n + "): " + Arrays.toString(array));
            n++;
        }

        System.out.println("testArray2 (after): " + Arrays.toString(array));
    }
}
