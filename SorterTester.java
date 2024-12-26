import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

/** 
 * The main class in SorterTester tests your implementations of sorting algorithms. 
 * @author Dennis Ulichney
 */

public class SorterTester {
	/**
	 * generate an int array, where each array element is a random int
	 */
	private static int[] generateRandomIntArray(int length) {
		int[] randomIntArray = new int[length];

		for (int i = 0; i < length; i++){
			randomIntArray[i] = (int) (Math.random()*10) + 1;
		}
		return randomIntArray;
	}

	
	/**
	 * main methods
	 */
	//TODO: Only submit a zipped version of the src folder.
	public static void main(String[] args) {
		// Creates all objects needed for the program.
		SorterTester testArray = new SorterTester();
		InsertionSorter insertionSorter = new InsertionSorter();
		SelectionSorter selectionSorter = new SelectionSorter();
		BubbleSorter bubbleSorter = new BubbleSorter();
		Scanner scanner = new Scanner(System.in);

		// Asks the user for the length of the arrays in the demonstration.
		System.out.println("How long would you like the arrays to be?");
		int length = scanner.nextInt();

		// Creates the three test arrays.
		int[] testArray1 = testArray.generateRandomIntArray(length);
		int[] testArray2 = testArray.generateRandomIntArray(length);
		int[] testArray3 = testArray.generateRandomIntArray(length);

		// Demonstrates insertion sorting.
		System.out.println("=== INSERTION SORT ===");
		System.out.println("testArray 1 (before): " + Arrays.toString(testArray1));
		insertionSorter.sortArrayInPlace(testArray1);

		// Demonstrates selection sorting.
		System.out.println("=== SELECTION SORT ===");
		System.out.println("testArray 2 (before): " + Arrays.toString(testArray2));
		selectionSorter.sortArrayInPlace(testArray2);

		// Demonstrates bubble sorting.
		System.out.println("=== BUBBLE SORT ===");
		System.out.println("testArray 3 (before): " + Arrays.toString(testArray3));
		bubbleSorter.sortArrayInPlace(testArray3);
	}
}
