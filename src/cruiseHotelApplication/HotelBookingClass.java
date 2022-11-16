package cruiseHotelApplication;

public class HotelBookingClass extends UserDetailsClass {

	int numberOfAdult, numberOfChildren, roomCapacity, days, roomPrice, totalPrice;
	private int lunchAdultFare, lunchChildFare;
	double hst, finalPrice;
	String bookLunch;

	public int getNumberOfAdult() {
		return numberOfAdult;
	}
	public void setNumberOfAdult(int numberOfAdult) {
		this.numberOfAdult = numberOfAdult;
	}
	public int getNumberOfChildren() {
		return numberOfChildren;
	}
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}

	private boolean addLunchPreBooking(int days) {
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.Please enter Yes/No");
		bookLunch = sc.next();
		if (bookLunch.equalsIgnoreCase("Yes")) {
			lunchAdultFare = days * 25 * numberOfAdult;
			lunchChildFare = days * 5 * numberOfChildren;
			return true;
		} else {
			return false;
		}
	}

	protected void numberOfGuest(String suiteSelection) {
		do {
			System.out.println("Please enter the number of adults:");
			numberOfAdult = sc.nextInt();
			System.out.println("Please enter the number of children:");
			numberOfChildren = sc.nextInt();
			roomCapacity = numberOfAdult + numberOfChildren;
			if ((roomCapacity <= 4 && suiteSelection.equalsIgnoreCase("DeluxeSuite"))
					|| (roomCapacity <= 8 && suiteSelection.equalsIgnoreCase("FamilySuite"))) {
				System.out.println("Enter the number of days of stay");
				days = sc.nextInt();
				break;
			} else if (roomCapacity > 4 || roomCapacity > 8) {
				System.out.println(" The room is not suitable for the number of guests.");
			}
			System.out.println("Please select again.");

		} while (!(roomCapacity > 4 && suiteSelection.equalsIgnoreCase("Deluxe Suite"))
				|| !(roomCapacity <= 8 && suiteSelection.equalsIgnoreCase("FamilySuite")));
	}

	protected void hotelFinalReceipt(String suiteSelection, int rate) {
		numberOfGuest(suiteSelection);
		addLunchPreBooking(days);
		getNumberOfAdult();
		getNumberOfChildren();
		getDays();
		System.out.println("The total amount you will be charged is.\n");
		if (suiteSelection.equalsIgnoreCase("DeluxeSuite") || suiteSelection.equalsIgnoreCase("FamilySuite")) {
			roomPrice = days * rate;
			System.out.println(suiteSelection + "  @  " + days + "  nights 	:  $" + roomPrice);
		} else {
			System.out.println("Invalid selection");
			System.exit(0);
		}
		System.out.println("Lunch Pre-Booked Special Rate Adults	@ " + numberOfAdult + "  :   $" + lunchAdultFare);
		System.out.println(
				"Lunch Pre-Booked Special Rate children	@ " + numberOfChildren + "  :   $" + lunchChildFare);
		totalPrice = roomPrice + lunchAdultFare + lunchChildFare;
		System.out.println("Total price :  $" + totalPrice);
		hst = totalPrice * 0.18;
		System.out.println("HST :  $" + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final price :  $" + finalPrice);
	}
}