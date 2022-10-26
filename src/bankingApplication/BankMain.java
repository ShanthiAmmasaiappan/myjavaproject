package bankingApplication;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				BankDetails swaroopAccount = new BankDetails("12345678", 7890, 1234.34);
				
				
				swaroopAccount.updateBalance(500,4567);
				swaroopAccount.getBalance();
				
				swaroopAccount.setPinNumber(4567,1234);
//				int updatedPIN = swaroopAccount.getPinNumber();
//				System.out.println(updatedPIN);
				
				swaroopAccount.updateBalance(500,4567);
				swaroopAccount.getBalance();
			

	}

}
