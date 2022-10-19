package accountdetails.constructor;

public class AccountDetailsClass {
	String accountNumber;
	int pinNumber;
	double balance;
	double deposit;
	double withdraw;

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

	double updateMoneyDeposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	double updateMoneyWithdrawal(double amount) {
		balance = balance - amount;
		return balance;
	}

}
