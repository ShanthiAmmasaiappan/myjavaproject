package cellphone;

public class MethodCellPhoneOne {

	int phoneTabOne;
	int phoneTabTwo;
	int monthlyPlan;

	void samsungMethod(String name) {
		System.out.println(name);
	}

	void appleMethod(String name) {
		System.out.println(name);
	}

	int mobilePhoneOne(String modelOne) {

		if (modelOne.equals("S22")) {
			phoneTabOne = 25;
		} else if (modelOne.equals("S22+")) {
			phoneTabOne = 35;
		} else if (modelOne.equals("S22Ultra")) {
			phoneTabOne = 55;
		} else if (modelOne.equals("S22FE")) {
			phoneTabOne = 20;
		}
		return phoneTabOne;
	}

	int mobilePhoneTwo(String modelTwo) {
		if (modelTwo.equals("iphone14")) {
			phoneTabTwo = 30;
		} else if (modelTwo.equals("iphone14pro")) {
			phoneTabTwo = 40;
		} else if (modelTwo.equals("iphone14promax")) {
			phoneTabTwo = 65;
		} else if (modelTwo.equals("iphone14mini")) {
			phoneTabTwo = 25;
		}
		return phoneTabTwo;
	}

	int mobilePhoneThree(String plan) {

		if (plan.equals("Rogers")) {
			monthlyPlan = 70;
		} else if (plan.equals("Bell")) {
			monthlyPlan = 80;
		} else if (plan.equals("Telus")) {
			monthlyPlan = 75;
		}
		return monthlyPlan;

	}

}
