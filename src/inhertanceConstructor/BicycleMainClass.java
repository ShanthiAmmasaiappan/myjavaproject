package inhertanceConstructor;

public class BicycleMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mountainBike = new MountainBike(4,4,12 );
		RoadBike roadBike = new RoadBike(6,6,20);
		mountainBike.kidsBikeModel();
		roadBike.adultBike();
		
	}

}
