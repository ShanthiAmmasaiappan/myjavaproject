package cruiseHotelApplication;

public class FamilySuiteClass extends HotelBookingClass {

	String hotelName = "FamilySuite";
	int noOfAdult = 4;
	int noOfChild = 4;
	int rate = 230;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}
