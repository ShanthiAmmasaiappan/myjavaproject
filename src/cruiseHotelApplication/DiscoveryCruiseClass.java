package cruiseHotelApplication;

public class DiscoveryCruiseClass extends CruiseBookingClass {
	String cruise;
	int adventureGamesFare;

	public DiscoveryCruiseClass(String cruiseName, double adultFee, double kidsFare, int numOfDays) {
		super(adultFee, kidsFare, numOfDays);
		cruise = cruiseName;
	}

	void discoveryCruiseSelection(String cruiseSelection) {
		System.out.println(
				"The cruise that you have selected is " + cruiseSelection + " which is a " + days + " day cruise ");
		System.out.println("Price for Adults(greater than 12)     : " + adultFare + " per day");
		System.out.println("Price for kids(above 5)     : " + childFare + " per day");
	}

	boolean adventureGames(int numberOfAdult) {
		String adventureGames = "";
		System.out.println("Do you wanna try Adventure Games ? Y/N ");
		adventureGames = sc.next();
		if (adventureGames.equalsIgnoreCase("Y")) {
			adventureGamesFare = 50 * numberOfAdult;
			System.out.println("Adventure Games for Adults    @  " + numberOfAdult + "  : $" + adventureGamesFare);
			return true;

		} else {
			System.out.println("Candle light dinner is not selected.");

			return false;
		}

	}

	void discoveryCruiseFinalCalculation() {
		totalPrice = totalPrice + adventureGamesFare;
		System.out.println("Total Price                    : $" + totalPrice);
		hst = totalPrice * 0.15;
		System.out.println("HST	@ 15%                  : $" + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final Price                    : $" + finalPrice);

	}

}
