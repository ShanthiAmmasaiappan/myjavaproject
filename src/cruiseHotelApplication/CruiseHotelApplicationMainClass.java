package cruisehotelApplication;

import java.util.Scanner;

public class CruiseHotelApplicationMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserDetailsClass userDetail = new UserDetailsClass();
		DeluxeSuiteclass deluxeSuite = new DeluxeSuiteclass();
		FamilySuiteClass familySuite = new FamilySuiteClass();

		ScenicCruiseClass scenicCruise = new ScenicCruiseClass("ScenicCruise", 43.99, 12.99, 3);
		SunsetCruiseClass sunsetCruise = new SunsetCruiseClass("SunsetCruise", 52.99, 15.99, 1);
		DiscoveryCruiseClass discoveryCruise = new DiscoveryCruiseClass("DiscoveryCruise", 39.99, 9.99, 4);
		MysteryCruiseClass mysteryCruise = new MysteryCruiseClass("MysteryCruise", 45.99, 12.99, 2);

		System.out.println("Welcome to makeMyTrip.com \n");
		System.out.println("Please sign up to book a service. \n");
		userDetail.validateEmailId();
		userDetail.validatePassword();
		userDetail.validateFullName();
		userDetail.validatePhoneNumber();

		System.out.println("Thank you for registering!\n");

		userDetail.updateLoginDetails();

		String suiteSelection = "";
		String cruiseSelection = "";
		String input;
		String bookTheService;
		String selection = "";
		int notInList = 0;
		int days;
		int numberOfAdult;
		int numberOfChildren;
		int rate;
		int attempt = 0;

		do {
			do {
				System.out.println("Please enter the service you want to book Hotel / Cruise.");
				bookTheService = sc.next();
				if (bookTheService.equalsIgnoreCase("cruise")) {
					System.out.println(
							"\nWe offer 4 different packages as displayed below. Please enter the cruise that you want to select. \n");
					System.out.println(scenicCruise.cruise);
					System.out.println(sunsetCruise.cruise);
					System.out.println(discoveryCruise.cruise);
					System.out.println(mysteryCruise.cruise);
					do {
						System.out.println("\nPlease select the cruise. \n");
						cruiseSelection = sc.next();
						if (cruiseSelection.equalsIgnoreCase("ScenicCruise")) {
							scenicCruise.scenicCruiseSelection(cruiseSelection);
						} else if (cruiseSelection.equalsIgnoreCase("SunsetCruise")) {
							sunsetCruise.sunsetCruiseSelection(cruiseSelection);
						} else if (cruiseSelection.equalsIgnoreCase("DiscoveryCruise")) {
							discoveryCruise.discoveryCruiseSelection(cruiseSelection);
						} else if (cruiseSelection.equalsIgnoreCase("MysteryCruise")) {
							mysteryCruise.mysteryCruiseSelection(cruiseSelection);

							notInList = 0;

						} else {
							notInList = 1;
						}

						if (notInList == 1) {
							System.out.println("Invalid entry. Please try again.");
							System.exit(0);
						}
						System.out.println(
								"\nPlease press Y if you want to continue with the selection or press any other alphabet to select another.");
						selection = sc.next();
					} while (!selection.equalsIgnoreCase("y"));
					do {
						System.out.println("Enter the number of adults");
						numberOfAdult = sc.nextInt();

					} while (numberOfAdult == 0);

					System.out.println("Enter the number of children");
					numberOfChildren = sc.nextInt();

					if (cruiseSelection.equalsIgnoreCase("ScenicCruise")) {
						scenicCruise.totalAdultFare(numberOfAdult);
						scenicCruise.totalChildFare(numberOfChildren);
						scenicCruise.spaServiceAvailable(numberOfAdult);
						scenicCruise.finalCruisePriceCalculation(cruiseSelection, numberOfAdult, numberOfChildren);
						scenicCruise.scenicCruiseFinalCalculation();
						break;
					} else if (cruiseSelection.equalsIgnoreCase("SunsetCruise")) {
						sunsetCruise.totalAdultFare(numberOfAdult);
						sunsetCruise.totalChildFare(numberOfChildren);
						sunsetCruise.candleLightDinner(numberOfAdult);
						sunsetCruise.finalCruisePriceCalculation(cruiseSelection, numberOfAdult, numberOfChildren);
						sunsetCruise.sunsetCruiseFinalCalculation();
						break;
					} else if (cruiseSelection.equalsIgnoreCase("DiscoveryCruise")) {
						discoveryCruise.totalAdultFare(numberOfAdult);
						discoveryCruise.totalChildFare(numberOfChildren);
						discoveryCruise.adventureGames(numberOfAdult);
						discoveryCruise.finalCruisePriceCalculation(cruiseSelection, numberOfAdult, numberOfChildren);
						discoveryCruise.discoveryCruiseFinalCalculation();
						break;
					} else if (cruiseSelection.equalsIgnoreCase("MysteryCruise")) {
						mysteryCruise.totalAdultFare(numberOfAdult);
						mysteryCruise.totalChildFare(numberOfChildren);
						mysteryCruise.exploreCasino(numberOfAdult);
						mysteryCruise.finalCruisePriceCalculation(cruiseSelection, numberOfAdult, numberOfChildren);
						mysteryCruise.mysteryCruiseFinalCalculation();
						notInList = 0;
						break;

					}

				}
				do {
					if (bookTheService.equalsIgnoreCase("hotel")) {
						System.out.println("Please enter the suite you want to select. \n");

						System.out.println(deluxeSuite.hotelName + " : accommodates " + deluxeSuite.noOfAdult
								+ " adults " + deluxeSuite.noOfChild + " children at the rate of $" + deluxeSuite.rate
								+ "/night \n");
						System.out.println(familySuite.hotelName + " : accommodates " + familySuite.noOfAdult
								+ " adults " + familySuite.noOfChild + " children at the rate of $" + familySuite.rate
								+ "/night \n");
						notInList = 0;

					}

					else {
						notInList = 1;
					}

					if (notInList == 1) {
						System.out.println("Invalid entry. Please try again.");
						break;

					}
					suiteSelection = sc.next();

					if (suiteSelection.equalsIgnoreCase(deluxeSuite.hotelName)) {
						deluxeSuite.numberOfGuestDeluxeSuite(suiteSelection);

						days = deluxeSuite.days;
						numberOfAdult = deluxeSuite.numberOfAdult;
						numberOfChildren = deluxeSuite.numberOfChildren;
						rate = deluxeSuite.rate;

						deluxeSuite.hotelFinalReceipt(suiteSelection, numberOfAdult, numberOfChildren, days, rate);

					} else if (suiteSelection.equalsIgnoreCase(familySuite.hotelName)) {
						familySuite.numberOfGuestFamilySuite(suiteSelection);

						numberOfAdult = familySuite.numberOfAdult;
						numberOfChildren = familySuite.numberOfChildren;
						rate = familySuite.rate;
						days = familySuite.days;

						familySuite.hotelFinalReceipt(suiteSelection, numberOfAdult, numberOfChildren, days, rate);

						notInList = 0;
						break;
					} else {
						notInList = 1;
					}

					if (notInList == 1) {
						System.out.println("Invalid entry. Please try again.");

					}
				} while (!(suiteSelection.equalsIgnoreCase(familySuite.hotelName)
						|| suiteSelection.equalsIgnoreCase(deluxeSuite.hotelName)));

			} while (!(bookTheService.equalsIgnoreCase("cruise") || bookTheService.equalsIgnoreCase("hotel")));

			System.out.println("Do you want to book another Hotel Room or Cruise(Y/N)");
			input = sc.next();
			if (input.equalsIgnoreCase("N")) {
				break;
			}

		} while (input.equalsIgnoreCase("Y"));

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
				userDetail.validatePassword("123xyz@abc", "abcxyz@123");
			} else if (changeInformation.equals("2") || changeInformation.equalsIgnoreCase("Phonenumber")) {

				userDetail.validatePhoneNumber("4561237890", "5762341234");

			} else if (changeInformation.equals("3") || changeInformation.equalsIgnoreCase("Email")) {

				userDetail.validateEmail("abcd@email.com", "acgh@email.com");

			} else {
				attempt++;
				System.out.println("Not in the list.Please try again.");

			}

		} while (attempt < 3);

		System.exit(0);

	}

}
