package setter.getter.modifiers;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleDetails sonataCar = new VehicleDetails("Grey", "GS");
		VehicleDetails hyundaiCar = new VehicleDetails("White", "G");

		sonataCar.updateCar("Grey", false);
		sonataCar.setCar("Grey", "Blue");
		sonataCar.updateCar("Blue", true);

	}

}
