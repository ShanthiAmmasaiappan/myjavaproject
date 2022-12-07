/*Write a program to find the maximum number in an array.*/
package interviewjavaquestion;

public class ArrayMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 2, 8, 5, 17, 9 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("The maximum number is " + max);
	}

}
