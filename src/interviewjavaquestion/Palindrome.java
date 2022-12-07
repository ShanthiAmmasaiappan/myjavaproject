/* Write a program to reverse a string and check if it is a palindrome.*/

package interviewjavaquestion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String enteredWord = sc.next();
		String reverseWord = "";
		
		for (int i = enteredWord.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + enteredWord.charAt(i);
		}
		if (enteredWord.equalsIgnoreCase(reverseWord)) {
			System.out.println("The entered word is a Palindrome.");

		} else {
			System.out.println("The entered word is not Palindrome.");
		}
		sc.close();
	}
}
