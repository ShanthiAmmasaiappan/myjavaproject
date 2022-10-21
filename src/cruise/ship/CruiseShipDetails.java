package cruise.ship;

public class CruiseShipDetails {
	String cruiseName;
	double adultFare;
	double childFare;
	int days;
	double adultBuffet;
	double childBuffet;

	public CruiseShipDetails(String nameOfCruise, double adultFee, double kidsFare, int numOfDays) {

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
		adultBuffet = 20.99 * days * numberOfAdults;
		return adultBuffet;
	}

	double childBuffetMealFare(int numberOfChildren) {
		childBuffet = 4.99 * days * numberOfChildren;
		return childBuffet;
	}

}
