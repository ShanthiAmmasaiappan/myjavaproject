package cellphone;

public class MethodCellPhoneClass {

	int samsungPhoneTab = 0;
	int applePhoneTab = 0;
	int monthlyPlan = 0;

	int samsungModel(String model) {

		if (model.equalsIgnoreCase("S22")) {
			samsungPhoneTab = 25;
		} else if (model.equalsIgnoreCase("S22+")) {
			samsungPhoneTab = 35;
		} else if (model.equalsIgnoreCase("S22Ultra")) {
			samsungPhoneTab = 55;
		} else if (model.equalsIgnoreCase("S22FE")) {
			samsungPhoneTab = 20;
		} else {
			System.out.println("Please enter the correct model and try again");
			System.exit(samsungPhoneTab);
		}
		return samsungPhoneTab;
	}

	int appleModel(String models) {
		if (models.equalsIgnoreCase("iphone14")) {
			applePhoneTab = 30;
		} else if (models.equalsIgnoreCase("iphone14pro")) {
			applePhoneTab = 40;
		} else if (models.equalsIgnoreCase("iphone14promax")) {
			applePhoneTab = 65;
		} else if (models.equalsIgnoreCase("iphone14mini")) {
			applePhoneTab = 25;
		} else {
			System.out.println("Please enter the correct model and try again");
			System.exit(applePhoneTab);
		}
		return applePhoneTab;
	}

	int planMethod(String plan) {

		if (plan.equalsIgnoreCase("Rogers")) {
			monthlyPlan = 70;
		} else if (plan.equalsIgnoreCase("Bell")) {
			monthlyPlan = 80;
		} else if (plan.equalsIgnoreCase("Telus")) {
			monthlyPlan = 75;
		} else {
			System.out.println("Please enter the correct plan and try again");
			System.exit(monthlyPlan);
		}
		return monthlyPlan;

	}

}
