package primenumber;

public class CheckPrimeNumber {
	public static void main(String args[]) {
// TODO Auto-generated method stub
		int n = 67;
		boolean isPrime = true;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		} else if (n == 2) {
			System.out.println(n + " is the only even prime number");
		} else {
			for (int i = 2; i <= n / 2; ++i) {
				// condition for non-prime number
				if (n % i == 0) {
					System.out.println(n + " is not a prime number.");
					isPrime = false;
					break;
				}
			}
			if (isPrime) {

				System.out.println(n + " is a prime number.");
			}
		}
	}
}
