package cruiseHotelApplication;

public class ScenicCruiseClass extends CruiseBookingClass {
	String cruise;
	int spaRate;
	

	public ScenicCruiseClass(String cruiseName, double adultFee, double kidsFare, int numOfDays) {
		super(adultFee, kidsFare, numOfDays);
		cruise = cruiseName;

	}

	void scenicCruiseSelection(String cruiseSelection) {
		System.out.println(
				"The cruise that you have selected is " + cruiseSelection + " which is a " + days + " day cruise ");
		System.out.println("Price for Adults(greater than 12)     : " + adultFare + " per day");
		System.out.println("Price for kids(above 5)     : " + childFare + " per day");
	}

	boolean spaServiceAvailable(int numberOfAdult) {
		String spa = "";
		System.out.println("Do you want spa service? Y/N ");
		spa = sc.next();
		if (spa.equalsIgnoreCase("Y")) {
			spaRate = 50 * numberOfAdult;
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
