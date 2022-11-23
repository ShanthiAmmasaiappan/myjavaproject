package learnCollections;

public class Account {
	private String accountName;
	private String accountNumber;
	public Account(String accountName, String accountNumber) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
