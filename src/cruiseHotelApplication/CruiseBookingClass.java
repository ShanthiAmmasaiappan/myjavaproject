package cruiseHotelApplication;

public class CruiseBookingClass extends UserDetailsClass {

	String cruise,dinnerBuffetMeal ;	
	double adultFare, childFare,totalPrice, hst, finalPrice;		
	private double totalChildFare = 0;
	private double buffetAdultFare, buffetChildFare;
	int days, notInList;
	int ageOfChild = 0, count = 0;
	
	public CruiseBookingClass(String cruiseName, double adultFee, double kidsFare, int numOfDays) {
		cruise = cruiseName;
		adultFare = adultFee;
		childFare = kidsFare;
		days = numOfDays;
	}

	void printOutStatemet() {
		String printOut = String.format("The cruise that you have selected is %s", cruise
				, " which is a %s", days , " day cruise ");
	}
	protected double totalAdultFare(int numberOfAdult) {
		adultFare = adultFare * numberOfAdult * days;
		return adultFare;
	}

	protected double totalChildFare(int numberOfChildren) {
		for (int i = 1; i <= numberOfChildren; i++) {
			System.out.println("Enter the age of child " + i);
			ageOfChild = sc.nextInt();
			if (ageOfChild > 5 && ageOfChild < 13) {
				totalChildFare = totalChildFare + (childFare * days);
				count++;
			} else if (ageOfChild > 12 && ageOfChild < 6) {
				totalChildFare = totalChildFare + 0;
			}
		}
		childFare = childFare * days * numberOfChildren;
		return totalChildFare;
	}

	public void finalCruisePriceCalculation(String cruiseSelection, int numberOfAdult, int numberOfChildren) {
		totalAdultFare(numberOfAdult);
		totalChildFare(numberOfChildren);
		System.out.println(
				" All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?Please type Yes/No ");
		dinnerBuffetMeal = sc.next();
		System.out
				.println(cruiseSelection + " Adults      " + "  @  " + numberOfAdult + "             : $" + adultFare);
		if ((numberOfChildren > 0) && (count > 0)) {
			System.out.println(
					cruiseSelection + " Children above 5      " + "  @  " + count + "        : $" + totalChildFare);
		}
		if (dinnerBuffetMeal.equalsIgnoreCase("Yes")) {
			buffetAdultFare = 20.99 * days * numberOfAdult;
			buffetChildFare = 4.99 * days * count;
			notInList = 0;
		} else {
			notInList = 1;
		}
		if (notInList == 1) {
			System.out.println("Dinner buffet meal not selected.");
		}
		System.out.println("Buffet Special Price Adults " + "  @  " + numberOfAdult + " : $" + buffetAdultFare);
		System.out.println("Buffet Special Price Children above 5 " + "  @  " + count + " : $" + buffetChildFare);
		totalPrice = adultFare + totalChildFare + buffetAdultFare + buffetChildFare;
	}
}
