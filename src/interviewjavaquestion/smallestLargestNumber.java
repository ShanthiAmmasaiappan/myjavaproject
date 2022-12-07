/*Write a program to find smallest and largest number in an array.*/
package interviewjavaquestion;

public class smallestLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 55, 32, 45, 98, 82, 11, 9, 39, 50 };
		int smallest = numbers[0];
		int largetest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largetest)
				largetest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}

		System.out.println("Largest Number is : " + largetest);
		System.out.println("Smallest Number is : " + smallest);
	}

}
