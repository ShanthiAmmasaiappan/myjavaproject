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

		System.out.println("Enter the number of adults:");
		int numberOfAdults = sc.nextInt();

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
				double adultFare = cruiseDetails[i].cruiseAdultFare();
				totalAdultFare = adultFare * numberOfAdults;
				System.out.println(selectCruiseShips + " Adults      " + "  @  " + numberOfAdults + "             : $"
						+ totalAdultFare);

				double childFare = cruiseDetails[i].cruiseChildFare();
				for (int j = 0; j < arrayAgeOfChild.length; j++) {
					if (arrayAgeOfChild[j] < 6) {
						numberOfChildren = numberOfChildren - 1;
					}
				}
				totalChildFare = childFare * numberOfChildren;
				System.out.println(selectCruiseShips + " Children above 5      " + "  @  " + numberOfChildren
						+ "        : $" + totalChildFare);
			}
		}

		if (dinnerBuffetMeal.equals("Yes")) {
			buffetAdultFare = numberOfAdults * 20.99;
			buffetChildFare = numberOfChildren * 4.99;
			System.out.println("Buffet Special Price Adults " + "  @  " + numberOfAdults + " : $" + buffetAdultFare);
			System.out.println(
					"Buffet Special Price Children above 5 " + "  @  " + numberOfChildren + " : $" + buffetChildFare);
		} else if (dinnerBuffetMeal.equals("No")) {
			buffetAdultFare = numberOfAdults * 20.99;
			buffetChildFare = numberOfChildren * 4.99;
			System.out.println("Buffet Special Price Adults " + "  @  " + numberOfAdults + " : $" + buffetAdultFare);
			System.out.println(
					"Buffet Special Price Children above 5 " + "  @  " + numberOfChildren + " : $" + buffetChildFare);
		} else {
			System.out.println("Dinner buffet meal not selected.");
		}
		totalPrice = totalAdultFare + totalChildFare + buffetAdultFare + buffetChildFare;
		System.out.println("Total Price                    : $" + totalPrice);
		hst = totalPrice * 0.15;
		System.out.println("HST	@ 15%                  : $" + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final Price                    : $" + finalPrice);

	}

}
