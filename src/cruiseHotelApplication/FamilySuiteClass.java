package cruiseHotelApplication;

public class FamilySuiteClass extends HotelBookingClass{
	
	String hotelName = "FamilySuite";
	int noOfAdult = 4;
	int noOfChild = 4;
	int rate = 230;
	
	public FamilySuiteClass() {
		super();
		
	}
	
	void numberOfGuestFamilySuite(String suiteSelection) {
		do {
			System.out.println("Please enter the number of adults:");
			numberOfAdult = sc.nextInt();
			System.out.println("Please enter the number of children:");
			numberOfChildren = sc.nextInt();
			roomCapacity = numberOfAdult + numberOfChildren;
			if ((roomCapacity <= 8 && suiteSelection.equalsIgnoreCase("FamilySuite"))) {

				System.out.println("Enter the number of days of stay");
				days = sc.nextInt();
				break;
			} else if (roomCapacity > 8 ) {

				System.out.println(" The room is not suitable for the number of guests.");
			}
			System.out.println("Please select again.");

		}while (!(roomCapacity > 8 && suiteSelection.equalsIgnoreCase("Family Suite")));
		
				
	}
	
}

		
