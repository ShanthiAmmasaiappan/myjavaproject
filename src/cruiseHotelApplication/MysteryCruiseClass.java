package cruiseHotelApplication;

public class MysteryCruiseClass extends CruiseBookingClass {
	String cruise;
	int casinoEntryFare;

	public MysteryCruiseClass(String cruiseName, double adultFee, double kidsFare, int numOfDays) {
		super(adultFee, kidsFare, numOfDays);
		cruise = cruiseName;
	}

	void mysteryCruiseSelection(String cruiseSelection) {
		System.out.println(
				"The cruise that you have selected is " + cruiseSelection + " which is a " + days + " day cruise ");
		System.out.println("Price for Adults(greater than 12)     : " + adultFare + " per day");
		System.out.println("Price for kids(above 5)     : " + childFare + " per day");
	}

	boolean exploreCasino(int numberOfAdult) {
		String casino = "";
		System.out.println("Do you wanna explore Casino ? Y/N ");
		casino = sc.next();
		if (casino.equalsIgnoreCase("Y")) {
			casinoEntryFare = 20 * numberOfAdult;

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
