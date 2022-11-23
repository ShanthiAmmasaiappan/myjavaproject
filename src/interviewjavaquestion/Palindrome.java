/* Write a program to reverse a string and check if it is a palindrome.*/

package interviewjavaquestion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalWord = "";
		String reverseWord = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		originalWord = sc.next();
		for (int i = originalWord.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + originalWord.charAt(i);
		}
		if (originalWord.equalsIgnoreCase(reverseWord)) {
			System.out.println("The entered word is a Palindrome.");

		} else {
			System.out.println("The entered word is not Palindrome.");
		}

	}
}
