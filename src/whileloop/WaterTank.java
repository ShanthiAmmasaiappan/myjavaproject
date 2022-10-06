package whileloop;

public class WaterTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxTankCapacity = 100;
		for (int bucketCapacity = 0; bucketCapacity <= 150; bucketCapacity += 10) {
			System.out.println("The water tank level is  - " + bucketCapacity + " liters");

			if (bucketCapacity == maxTankCapacity) {
				System.out.println("The water tank reached the capacity. ");
				break;
			}

		}

	}

}
