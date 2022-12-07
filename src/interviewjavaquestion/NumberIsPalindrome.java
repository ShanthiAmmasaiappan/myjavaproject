/* Write a Program to Check Whether a Number is Palindrome */
package interviewjavaquestion;

public class NumberIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reminder, sum = 0, temp;
		int number = 45254;// It is the number variable to be checked for palindrome

		temp = number;
		while (number > 0) {
			reminder = number % 10; // getting remainder
			sum = (sum * 10) + reminder;
			number = number / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

}
