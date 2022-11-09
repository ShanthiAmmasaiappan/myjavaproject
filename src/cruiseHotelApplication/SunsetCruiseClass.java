package cruisehotelApplication;

public class SunsetCruiseClass extends CruiseBookingClass {
	String cruise;
	int candleLightDinnerRate;
	

	public SunsetCruiseClass(String cruiseName, double adultFee, double kidsFare, int numOfDays) {
		super(adultFee, kidsFare, numOfDays);
		cruise = cruiseName;
	}

	void sunsetCruiseSelection(String cruiseSelection) {
		System.out.println(
				"The cruise that you have selected is " + cruiseSelection + " which is a " + days + " day cruise ");
		System.out.println("Price for Adults(greater than 12)     : " + adultFare + " per day");
		System.out.println("Price for kids(above 5)     : " + childFare + " per day");
	}

	boolean candleLightDinner(int numberOfAdult) {
		String candleLightDinner = "";
		System.out.println("Do you want to include Candle light dinner? Y/N ");
		candleLightDinner = sc.next();
		if (candleLightDinner.equalsIgnoreCase("Y")) {
			candleLightDinnerRate = 45 * numberOfAdult;
			System.out
					.println("Candle light dinner for Adults    @  " + numberOfAdult + "  : $" + candleLightDinnerRate);
			return true;

		} else {
			System.out.println("Candle light dinner is not selected.");

			return false;
		}

	}

	void sunsetCruiseFinalCalculation() {
		totalPrice = totalPrice + candleLightDinnerRate;
		System.out.println("Total Price                    : $" + totalPrice);
		hst = totalPrice * 0.15;
		System.out.println("HST	@ 15%                  : $" + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final Price                    : $" + finalPrice);

	}

}
