package cruise.ship;

public class CruiseShipDetails {
	String cruiseName;
	double adultFare;
	double childFare;
	int days;

	public CruiseShipDetails(String nameOfCruise, double adultFee, double kidsFare, int numOfDays) {

		cruiseName = nameOfCruise;
		adultFare = adultFee;
		childFare = kidsFare;
		days = numOfDays;
	}

	double cruiseAdultFare() {
		adultFare = adultFare * days;
		return adultFare;
	}

	double cruiseChildFare() {
		childFare = childFare * days;
		return childFare;
	}

}
