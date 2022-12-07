/*Write a program to check if the number is prime or not.*/

package interviewjavaquestion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int number = sc.nextInt();
		int flag = 0;

		if (number == 0 || number == 1) {
			System.out.println(number + " is not a prime number");
		} else if (number == 2) {
			System.out.println(number + " is the only even prime number");
		} else {
			for (int i = 2; i <= number / 2; i++) {
				// condition for non-prime number
				if (number % i == 0) {
					System.out.println(number + " is not a prime number.");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {

				System.out.println(number + " is a prime number.");
			}
		}

	}

}
