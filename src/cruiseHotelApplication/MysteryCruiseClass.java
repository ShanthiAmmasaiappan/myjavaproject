package cruiseHotelApplication;

public class MysteryCruiseClass extends CruiseBookingClass {
	String cruise;
	int casinoEntryFare;

	public MysteryCruiseClass(String cruiseName, double adultFee, double kidsFare, int numOfDays) {
		super(cruiseName, adultFee, kidsFare, numOfDays);
		cruise = cruiseName;
	}

	boolean exploreCasino(int numberOfAdult) {
		String casino = "";
		System.out.println("Do you wanna explore Casino ? Y/N ");
		casino = sc.next();
		if (casino.equalsIgnoreCase("Y")) {
			casinoEntryFare = 20 * numberOfAdult * days;
			System.out.println("Casino entry for Adults    @  " + numberOfAdult + "  : $" + casinoEntryFare);
			return true;
		} else {
			System.out.println("Casino option is not selected.");
			return false;
		}
	}

	void mysteryCruiseFinalCalculation() {
		totalPrice = totalPrice + casinoEntryFare;
		System.out.println("Total Price                    : $" + totalPrice);
		hst = totalPrice * 0.15;
		System.out.println("HST	@ 15%                  : $" + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final Price                    : $" + finalPrice);
	}
}
