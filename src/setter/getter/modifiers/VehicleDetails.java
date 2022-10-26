package setter.getter.modifiers;

public class VehicleDetails {
	private String color;
	private String model;

	public VehicleDetails(String color, String model) {

		this.color = color;
		this.model = model;
	}
	

	public void getModel() {
		System.out.println(model);
	}

	void updateCar(String paintColor, boolean isCarAvailable) {

		if (color.equals(paintColor) && isCarAvailable) {

			System.out.println("Car is available");

		}

		else {
			System.out.println("Car is not available");
		}

	}

	public void setCar(String currentPaintColor, String newPaintColor) {
		if (this.color.equals(currentPaintColor)) {
			this.color = newPaintColor;
		} else {
			System.out.println("Color is not available");
		}

	}

}
