package cruisebooking;

import java.util.Scanner;

public class MainCruiseBookingClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserDetailClass userDetail = new UserDetailClass("abcd@email.com", "123xyz@abc", "John Doe", "4561237890");

		System.out.println("Welcome to Cruise booking.\n");
		System.out.println("Please sign up to book a cruise.\n");
		System.out.println("Enter your email address:");
		String email = sc.nextLine();
		System.out.println("Enter the password that you want to use.");
		String password = sc.nextLine();
		System.out.println("Enter your Full Name.");
		String fullName = sc.nextLine();
		System.out.println("Enter your phone number.");
		String phoneNumber = sc.nextLine();
		System.out.println("Thank you for registering!\n");

		userDetail.updateLoginDetails();

		CruiseShipDetailsClass scenicCruiseDetails = new CruiseShipDetailsClass("Scenic Cruise", 43.99, 12.99, 3);
		CruiseShipDetailsClass sunsetCruiseDetails = new CruiseShipDetailsClass("Sunset Cruise", 52.99, 15.99, 1);
		CruiseShipDetailsClass discoveryCruiseDetails = new CruiseShipDetailsClass("Discovery Cruise", 39.99, 9.99, 4);
		CruiseShipDetailsClass mysteryCruiseDetails = new CruiseShipDetailsClass("Mystery Cruise", 45.99, 12.99, 2);

		CruiseShipDetailsClass[] cruiseDetails = { scenicCruiseDetails, sunsetCruiseDetails, discoveryCruiseDetails,
				mysteryCruiseDetails };

		String selection = null;
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.");
		for (int i = 0; i < cruiseDetails.length; i++) {

			System.out.println(cruiseDetails[i].cruiseName);
		}

		String selectCruiseShips;
		String dinnerBuffetMeal;
		int notInList = 0;
		int numberOfAdults;
		int attempt = 0;

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
					notInList = 0;
					break;
				} else {
					notInList = 1;
				}
			}
			if (notInList == 1) {
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
				" All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?Please type Yes/No ");
		dinnerBuffetMeal = sc.next();

		System.out.println("Your Package includes:");
		for (int i = 0; i < cruiseDetails.length; i++) {
			if (selectCruiseShips.equals(cruiseDetails[i].cruiseName)) {

				double adultFare = cruiseDetails[i].cruiseAdultFare(numberOfAdults);

				for (int j = 0; j < arrayAgeOfChild.length; j++) {
					if (arrayAgeOfChild[j] < 5) {
						numberOfChildren = numberOfChildren - 1;
					}
				}
				double childFare = cruiseDetails[i].cruiseChildFare(numberOfChildren);

				if (dinnerBuffetMeal.equalsIgnoreCase("Yes")) {
					double adultBuffet = cruiseDetails[i].adultBuffetMealFare(numberOfAdults);

					double childBuffet = cruiseDetails[i].childBuffetMealFare(numberOfChildren);

					notInList = 0;

				}

				else {
					notInList = 1;
				}
				cruiseDetails[i].finalPriceCalculation(selectCruiseShips, numberOfAdults, numberOfChildren);
			}

		}
		if (notInList == 1) {

			System.out.println("Dinner buffet meal not selected.");
		}

		System.out.println(
				"Do you want to change your personal information? Press Y to change. Press any other alphabet to exit.");
		String changeInfo = sc.next();
		if (changeInfo.equalsIgnoreCase("Y")) {

		} else {
			System.exit(0);
		}

		do {
			System.out.println("Please enter the information you want to change");
			String[] information = { "1.Password", "2.Phone Number", "3.Email" };
			for (int i = 0; i <= information.length - 1; i++) {
				System.out.println(information[i]);
			}
			String changeInformation = sc.next();

			if (changeInformation.equals("1") || changeInformation.equalsIgnoreCase("Password")) {
				userDetail.setPassword("123xyz@abc", "abcxyz@123");
			} else if (changeInformation.equals("2") || changeInformation.equalsIgnoreCase("Phonenumber")) {

				userDetail.setPhoneNumber("4561237890", "5762341234");

			} else if (changeInformation.equals("3") || changeInformation.equalsIgnoreCase("Email")) {

				userDetail.setEmail("abcd@email.com", "acgh@email.com");

			} else {
				attempt++;
				System.out.println("Not in the list.Please try again.");
//				System.exit(0);
			}

		} while (attempt < 3);

		System.exit(0);

	}

}
