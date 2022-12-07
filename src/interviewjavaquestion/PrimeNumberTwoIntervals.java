/* Write a Program to Display Prime Numbers Between Two Intervals */
package interviewjavaquestion;

public class PrimeNumberTwoIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 20, high = 30;

		while (low < high) {
			boolean flag = false;

			for (int i = 2; i <= low / 2; i++) {
				// condition for nonprime number
				if (low % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag )
				System.out.print(low + " ");

			++low;
		}

	}

}
