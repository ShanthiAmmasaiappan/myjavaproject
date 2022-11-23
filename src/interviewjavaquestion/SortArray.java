/* Write a program to sort an array of number.*/
package interviewjavaquestion;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNumber = { 8, 4, 19, 7, 45 };
		System.out.println("The original array is");
		for (int i = 0; i < arrayNumber.length; i++) {

			System.out.println(arrayNumber[i] + " ");
		}
		Arrays.sort(arrayNumber);
		System.out.println("The sortted array is");
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.println(arrayNumber[i] + " ");
		}

	}

}
