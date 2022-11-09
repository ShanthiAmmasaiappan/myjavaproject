package cruisehotelApplication;

public class DeluxeSuiteclass extends HotelBookingClass {
	String hotelName = "DeluxeSuite";
	int noOfAdult = 2;
	int noOfChild = 2;
	int rate = 180;
	
	
	public DeluxeSuiteclass() {
		super();
		 	
	}
	
	void numberOfGuestDeluxeSuite(String suiteSelection) {
		do {
			System.out.println("Please enter the number of adults:");
			numberOfAdult = sc.nextInt();
			System.out.println("Please enter the number of children:");
			numberOfChildren = sc.nextInt();
			roomCapacity = numberOfAdult + numberOfChildren;
			if ((roomCapacity <= 4 && suiteSelection.equalsIgnoreCase("DeluxeSuite"))) {

				System.out.println("Enter the number of days of stay");
				days = sc.nextInt();
				break;
			} else if (roomCapacity > 4 ) {

				System.out.println(" The room is not suitable for the number of guests.");
			}
			System.out.println("Please select again.");

		} while (!(roomCapacity > 4 && suiteSelection.equalsIgnoreCase("Deluxe Suite")));
				
	}
	
	


	
}
	
	
