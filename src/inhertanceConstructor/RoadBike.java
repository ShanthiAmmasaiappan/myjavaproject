package inhertanceConstructor;

public class RoadBike extends BicycleClass {

	public RoadBike(int gear, int speed, int size) {
		super(gear, speed, size);
		
	}

	void tireWidth() {
		System.out.println("The width of the tire.");
	}
	
	void adultBikeModel() {
		System.out.println("The adult bike model");
	}
	void kidsBikeModel() {
		System.out.println("The kids bike model");
	}
	
}
