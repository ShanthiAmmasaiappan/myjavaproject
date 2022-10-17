import java.util.Scanner;

public class BuyTicketMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TicketClass tc = new TicketClass();
		System.out.println("The ticket price");
		int price = sc.nextInt();
		System.out.println(tc.hasMoney(price));
		 
		
		
		

	}

}
