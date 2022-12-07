/* Write a program to sort an array of number.*/
package interviewjavaquestion;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int[] array = { 8, 4, 19, 7, 45 };
		System.out.println("The original array is:");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
		Arrays.sort(array);
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[i] > array[j]) {
//					temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
		
		System.out.println("\nThe sortted array is:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
