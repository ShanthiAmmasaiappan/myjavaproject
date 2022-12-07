/* Write a Program to Display Factors of a Number */
package interviewjavaquestion;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.print("Factors of " + number + " are: ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
