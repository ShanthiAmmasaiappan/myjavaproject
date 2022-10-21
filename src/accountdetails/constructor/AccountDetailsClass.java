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

	double updateDepositBalance(double amount) {
		balance = balance + amount;
		return balance;
	}

	double updateWithdrawBalance(double amount) {
		balance = balance - amount;
		return balance;
	}

}
