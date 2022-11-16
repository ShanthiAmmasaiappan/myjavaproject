package cruiseHotelApplication;

public class DeluxeSuiteclass extends HotelBookingClass {
	String hotelName = "DeluxeSuite";
	int noOfAdult = 2;
	int noOfChild = 2;
	int rate = 180;

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
