package inhertanceConstructor;

public class BicycleClass {
	int gear;
	int speed;
	int size;
	
	public BicycleClass(int gear, int speed, int size) {
		this.gear = gear;
		this.speed = speed;
		this.size = size;
	
	}
	
	
	
	void adultBike() {
		System.out.println("The size of the bike");
	}
	void kidsBike() {
		System.out.println("The gear of the bike.");
	}
	

}
