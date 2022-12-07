/* Write a Program to Check Armstrong Number*/

package interviewjavaquestion;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int originalNumber, number, reminder, numberOfDigit = 0;
		double result = 0.0;
		
		System.out.println("Enter the integer number");
		int enteredNumber = sc.nextInt();

		number = originalNumber = enteredNumber;

		while (originalNumber != 0) {
			originalNumber /= 10;
			++numberOfDigit;
		}

		while (number != 0) {
			reminder = number % 10;
			result += Math.pow(reminder, numberOfDigit);
			number /= 10;
		}

		if ((int) result == enteredNumber) {
			System.out.println("\n" + enteredNumber + " is an Armstrong number.");
		} else {
			System.out.println("\n" + enteredNumber + " is not an Armstrong number.");
		}

		sc.close();
	}

}
