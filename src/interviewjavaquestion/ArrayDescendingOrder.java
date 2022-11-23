/* Write a program to print the numbers in an array in descending order */
package interviewjavaquestion;

public class ArrayDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 18, 10, 9, 5, 17 };
		int temp = 0;
		System.out.println("The elements of original array.");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("\nElements of array sorted in descending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
