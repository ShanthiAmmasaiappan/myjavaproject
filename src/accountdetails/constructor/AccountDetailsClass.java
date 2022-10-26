package accountdetails.constructor;

public class AccountDetailsClass {
	String accountNumber;
	int pinNumber;
	double balance;

	public AccountDetailsClass(String accNumber, int pIN, double bal) {

		accountNumber = accNumber;
		pinNumber = pIN;
		balance = bal;

	}

	String getAccountNumber() {
		return accountNumber;
	}

	int getPinNumber() {
		return pinNumber;
	}

	double getBalance() {
		return balance;
	}

	void updateBalance(String depositOrWithdraw, double amount) {
		if (depositOrWithdraw.equalsIgnoreCase("deposit")) {

			balance = balance + amount;

			System.out.println("Deposit amount  : $" + amount);
			System.out.println("Account balance : $" + balance);

		} else if (depositOrWithdraw.equalsIgnoreCase("withdraw")) {
			if (balance > amount) {

				balance = balance - amount;
				System.out.println("Withdrawal amount : $" + amount);
				System.out.println("Account balance : $" + balance);
			} else {
				System.out.println("Invalid entry");

			}

		}

	}
}
