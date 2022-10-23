package accountdetails.constructor;

import java.util.Scanner;

public class MainAccountDetailsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountDetailsClass shanthiDetails = new AccountDetailsClass("458323", 123, 5477.6);
		AccountDetailsClass kaviDetails = new AccountDetailsClass("358323", 321, 4477.6);
		AccountDetailsClass charanDetails = new AccountDetailsClass("854323", 456, 6187.9);
		AccountDetailsClass kiranDetails = new AccountDetailsClass("832452", 654, 8967.5);
		AccountDetailsClass nilaDetails = new AccountDetailsClass("584323", 789, 7543.6);

		AccountDetailsClass[] accountDetails = { shanthiDetails, kaviDetails, charanDetails, kiranDetails,
				nilaDetails };

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int flag = 0;
		do {
			System.out.println("Please enter the Account number:");
			String accNumber = sc.next();

			System.out.println("Please enter the PIN number :");
			int pinNumber = sc.nextInt();

			for (int i = 0; i < accountDetails.length; i++) {

				if ((accNumber.equals(accountDetails[i].accountNumber))
						&& (pinNumber == (accountDetails[i].pinNumber))) {
					System.out.println("Balance is " + accountDetails[i].balance);
					String depositOrWithdraw;
					do {
						System.out.println("Do you want to either deposit or withdraw money");
						depositOrWithdraw = sc.next();

					} while (!depositOrWithdraw.equalsIgnoreCase("deposit")
							&& !depositOrWithdraw.equalsIgnoreCase("withdraw"));

					System.out.println("Please enter the amount:");
					double amount = sc.nextDouble();
					accountDetails[i].updateBalance(depositOrWithdraw, amount);
					flag = 0;
					System.exit(0);

				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				count++;
				System.out.println("Invalid Entry.");
			}

		} while (count < 3);
		System.out.println("Card locked.");
		System.exit(0);
	}

}
