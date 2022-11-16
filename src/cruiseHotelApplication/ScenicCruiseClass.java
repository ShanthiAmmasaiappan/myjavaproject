package cruiseHotelApplication;

public class ScenicCruiseClass extends CruiseBookingClass {
//	String cruise;
	int spaRate;

	public ScenicCruiseClass(String cruiseName, double adultFee, double kidsFare, int numOfDays) {
		super(cruiseName, adultFee, kidsFare, numOfDays);
//		cruise = cruiseName;
		String cruise = String.format("My Company name is %s", cruiseName);
	}

	boolean spaServiceAvailable(int numberOfAdult) {
		String spa = "";
		System.out.println("Do you want spa service? Y/N ");
		spa = sc.next();
		if (spa.equalsIgnoreCase("Y")) {
			spaRate = 50 * numberOfAdult * days;
			System.out.println("Spa service charge for Adults    @  " + numberOfAdult + "  : $" + spaRate);
			return true;
		} else {
			System.out.println("Spa service not selected.");
			return false;
		}
	}

	void scenicCruiseFinalCalculation() {
		totalPrice = totalPrice + spaRate;
		System.out.println("Total Price                    : $" + totalPrice);
		hst = totalPrice * 0.15;
		System.out.println("HST	@ 15%                  : $" + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final Price                    : $" + finalPrice);
	}
}
