package cellphone;

import java.util.Scanner;

public class MainCellPhoneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the brand that you want to choose from: Apple/ Samsung");
//		Reads input from the user during runtime
		String phoneBrand = sc.next();
//		Creating the Class instance
		MethodCellPhoneClass one = new MethodCellPhoneClass();

		if (phoneBrand.equalsIgnoreCase("Samsung")) {
			System.out.println("Please select the model from the list");
			String[] samsungModelSelection = { "S22", "S22+", "S22Ultra", "S22FE" };
			for (int i = 0; i < samsungModelSelection.length; i++) {
				System.out.println(samsungModelSelection[i]);
			}

//			Reads input from the user during runtime
			String model = sc.next();
//			Calling the method samsungModelMethod
			one.samsungModel(model);
//			Returns value from the method samsungModelMethod
			int samsungPhoneTab = one.samsungModel(model);

			System.out.println("Please select the plan that you want to opt for: Rogers/Telus/Bell ");
			String plan = sc.next();
//			Calling the method 
			one.planMethod(plan);
//			Returns value from the planMethod
			int monthlyPlan = one.planMethod(plan);

			System.out.println("you have selected the " + model + " model with " + plan + " plan.");
			System.out.println("Your Phone Tab will be $" + samsungPhoneTab);
			System.out.println("Your Monthly Plan will be $" + monthlyPlan);
			System.out.println("Total Monthly Amount is $" + (samsungPhoneTab + monthlyPlan));

		} else if (phoneBrand.equalsIgnoreCase("Apple")) {
			System.out.println("Please select the model from the list");
			String[] appleModelSelection = { "iphone14", "iphone14pro", "iphone14promax", "iphone14mini" };
			for (int i = 0; i < appleModelSelection.length; i++) {
				System.out.println(appleModelSelection[i]);
			}

			String models = sc.next();

			one.appleModel(models);
			int applePhoneTab = one.appleModel(models);
			System.out.println("Please select the plan that you want to opt for: Rogers/Telus/Bell  ");
//			Reads input from the user during runtime
			String plan = sc.next();
//			Calling the method
			one.planMethod(plan);
//			Returns value from the method
			int monthlyPlan = one.planMethod(plan);

			System.out.println("you have selected the " + models + " model with " + plan + " plan.");
			System.out.println("Your Phone Tab will be $" + applePhoneTab);

			System.out.println("Your Monthly Plan will be $" + monthlyPlan);
			System.out.println("Total Monthly Amount is $" + (applePhoneTab + monthlyPlan));

		} else {
			System.out.println("Invalid input.");
		}

	}
}
