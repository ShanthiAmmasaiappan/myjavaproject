/*There is a water tank of capacity 100 liters. 
 * Water is filled into it using bucket which have capacity of 
 * 10 liters.  Write a program which fills the tank to its capacity 
 * using these buckets. Also include a mechanism in your program to
 *  stop the tank from over flowing.*/

package whileloop;

public class WaterTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxTankCapacity = 100;
		int bucketCapacity = 10;
		int initialLevel = 0;
		int currentLevel = initialLevel;
		int tankThershold = 98;

		if (initialLevel < 0 || initialLevel > maxTankCapacity) {
			System.out.println("Invalid input data.");
		} else {
			for (currentLevel = initialLevel; currentLevel <= tankThershold; currentLevel += bucketCapacity) {
				System.out.println("The water tank level is  - " + currentLevel + " liters");

				if (currentLevel + bucketCapacity > tankThershold) {
					System.out.println("The water tank reached the capacity. ");
					break;
				}
			}
			if (currentLevel > tankThershold) {
				System.out.println("The tank overflows.");

			}

		}

	}

}
