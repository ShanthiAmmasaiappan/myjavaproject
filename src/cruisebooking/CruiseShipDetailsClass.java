package cruisebooking;

public class CruiseShipDetailsClass {

	String cruiseName;
	double adultFare;
	double childFare;
	int days;
	private double buffetAdultFare;
	private double buffetChildFare;
	private double totalPrice;
	private double hst;
	private double finalPrice;

	public CruiseShipDetailsClass(String nameOfCruise, double adultFee, double kidsFare, int numOfDays) {

		cruiseName = nameOfCruise;
		adultFare = adultFee;
		childFare = kidsFare;
		days = numOfDays;
	}

	double cruiseAdultFare(int numberOfAdults) {
		adultFare = adultFare * days * numberOfAdults;
		return adultFare;
	}

	double cruiseChildFare(int numberOfChildren) {
		childFare = childFare * days * numberOfChildren;
		return childFare;
	}

	double adultBuffetMealFare(int numberOfAdults) {
		buffetAdultFare = 20.99 * days * numberOfAdults;
		return buffetAdultFare;
	}

	double childBuffetMealFare(int numberOfChildren) {
		buffetChildFare = 4.99 * days * numberOfChildren;
		return buffetChildFare;
	}

	void finalPriceCalculation(String selectCruiseShips, int numberOfAdults, int numberOfChildren) {
		System.out.println(
				selectCruiseShips + " Adults      " + "  @  " + numberOfAdults + "             : $" + adultFare);
		System.out.println(
				selectCruiseShips + " Children above 5      " + "  @  " + numberOfChildren + "        : $" + childFare);
		System.out.println("Buffet Special Price Adults " + "  @  " + numberOfAdults + " : $" + buffetAdultFare);
		System.out.println(
				"Buffet Special Price Children above 5 " + "  @  " + numberOfChildren + " : $" + buffetChildFare);
		totalPrice = adultFare + childFare + buffetAdultFare + buffetChildFare;
		System.out.println("Total Price                    : $" + totalPrice);
		hst = totalPrice * 0.15;
		System.out.println("HST	@ 15%                  : $" + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final Price                    : $" + finalPrice);

	}

}
