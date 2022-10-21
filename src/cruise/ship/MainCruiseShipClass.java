package cruise.ship;

import java.util.Scanner;

public class MainCruiseShipClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CruiseShipDetails scenicCruiseDetails = new CruiseShipDetails("Scenic Cruise", 43.99, 12.99, 3);
		CruiseShipDetails sunsetCruiseDetails = new CruiseShipDetails("Sunset Cruise", 52.99, 15.99, 1);
		CruiseShipDetails discoveryCruiseDetails = new CruiseShipDetails("Discovery Cruise", 39.99, 9.99, 4);
		CruiseShipDetails mysteryCruiseDetails = new CruiseShipDetails("Mystery Cruise", 45.99, 12.99, 2);

		CruiseShipDetails[] cruiseDetails = { scenicCruiseDetails, sunsetCruiseDetails, discoveryCruiseDetails,
				mysteryCruiseDetails };
		Scanner sc = new Scanner(System.in);

		String selection = null;
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.");
		for (int i = 0; i < cruiseDetails.length; i++) {

			System.out.println(cruiseDetails[i].cruiseName);
		}

		String selectCruiseShips;
		String dinnerBuffetMeal;
		double buffetAdultFare = 0;
		double buffetChildFare = 0;
		double totalAdultFare = 0;
		double totalChildFare = 0;
		double totalPrice = 0;
		double hst = 0;
		double finalPrice = 0;
		int flag = 0;
		int numberOfAdults;

		do {
			System.out.println("\nPlease select the Cruise ship :");
			selectCruiseShips = sc.nextLine();
			for (int i = 0; i < cruiseDetails.length; i++) {
				if (selectCruiseShips.equalsIgnoreCase(cruiseDetails[i].cruiseName)) {
					System.out.println("The cruise that you have selected is " + selectCruiseShips + " which is a "
							+ cruiseDetails[i].days + " day cruise ");
					System.out.println(
							"Price for Adults(greater than 12)     : " + cruiseDetails[i].adultFare + " per day");
					System.out.println("Price for kids(above 5)     : " + cruiseDetails[i].childFare + " per day");
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("Invalid entry. Please start over.");
				System.exit(0);
			}

			System.out.println(
					"Please press Y if you want to continue with the selection or press any other alphabet to select another.");
			selection = sc.nextLine();
		} while (!selection.equalsIgnoreCase("y"));

		do {
			System.out.println("Enter the number of adults:");
			numberOfAdults = sc.nextInt();
			if (numberOfAdults == 0) {
				System.out.println("Please enter the number");
			}
		} while (numberOfAdults == 0);

		System.out.println("Enter the number of children:");
		int numberOfChildren = sc.nextInt();

		int[] arrayAgeOfChild = new int[numberOfChildren];

		for (int j = 0; j < arrayAgeOfChild.length; j++) {
			System.out.println("Enter the age of child " + (j + 1) + ":");
			arrayAgeOfChild[j] = sc.nextInt();
			if (arrayAgeOfChild[j] > 12) {
				System.out.println("Invalid entry.Please start over.");
				System.exit(j);
			}
		}

		System.out.println(
				" All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");
		dinnerBuffetMeal = sc.next();

		System.out.println("Your Package includes:");
		for (int i = 0; i < cruiseDetails.length; i++) {
			if (selectCruiseShips.equals(cruiseDetails[i].cruiseName)) {
				double adultFare = cruiseDetails[i].cruiseAdultFare(numberOfAdults);
				totalAdultFare = adultFare;
				System.out.println(selectCruiseShips + " Adults      " + "  @  " + numberOfAdults + "             : $"
						+ totalAdultFare);

				for (int j = 0; j < arrayAgeOfChild.length; j++) {
					if (arrayAgeOfChild[j] < 6) {
						numberOfChildren = numberOfChildren - 1;
					}
				}
				double childFare = cruiseDetails[i].cruiseChildFare(numberOfChildren);
				totalChildFare = childFare;
				System.out.println(selectCruiseShips + " Children above 5      " + "  @  " + numberOfChildren
						+ "        : $" + totalChildFare);
				if (dinnerBuffetMeal.equals("Yes")) {
					double adultBuffet = cruiseDetails[i].adultBuffetMealFare(numberOfAdults);
					buffetAdultFare = cruiseDetails[i].adultBuffet;
					double childBuffet = cruiseDetails[i].childBuffetMealFare(numberOfChildren);
					buffetChildFare = cruiseDetails[i].childBuffet;
					System.out.println(
							"Buffet Special Price Adults " + "  @  " + numberOfAdults + " : $" + buffetAdultFare);
					System.out.println("Buffet Special Price Children above 5 " + "  @  " + numberOfChildren + " : $"
							+ buffetChildFare);
					flag = 0;
				}

				else {
					flag = 1;
				}
			}
			if (flag == 1) {

				System.out.println("Dinner buffet meal not selected.");
			}
		}

		totalPrice = totalAdultFare + totalChildFare + buffetAdultFare + buffetChildFare;
		System.out.println("Total Price                    : $" + totalPrice);
		hst = totalPrice * 0.15;
		System.out.println("HST	@ 15%                  : $" + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final Price                    : $" + finalPrice);

	}

}
