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
		MethodCellPhoneOne one = new MethodCellPhoneOne();
		System.out.println("Please select the model from the list");

		if (phoneBrand.equals("Samsung")) {

			one.samsungMethod("S22");
			one.samsungMethod("S22+");
			one.samsungMethod("S22 Ultra");
			one.samsungMethod("S22FE");
//			Reads input from the user during runtime
			String modelOne = sc.next();
//			Calling the method mobilePhoneOne
			one.mobilePhoneOne(modelOne);
//			Returns value from the method mobilePhoneOne
			int phoneTabOne = one.mobilePhoneOne(modelOne);

			System.out.println("Please select the plan that you want to opt for: Rogers/Telus/Bell ");
			String plan = sc.next();
//			Calling the method mobilePhoneThree
			one.mobilePhoneThree(plan);
//			Returns value from the method mobilePhoneThree
			int monthlyPlan = one.mobilePhoneThree(plan);

			System.out.println("you have selected the " + modelOne + " model with " + plan + " plan.");
			System.out.println("Your Phone Tab will be $" + phoneTabOne);
			System.out.println("Your Monthly Plan will be $" + monthlyPlan);
			System.out.println("Total Monthly Amount is $" + (phoneTabOne + monthlyPlan));

		} else if (phoneBrand.equals("Apple")) {

			one.appleMethod("iphone14");
			one.appleMethod("iphone14 pro");
			one.appleMethod("iphone14 pro max");
			one.appleMethod("iphone14 mini");
//			Reads input from the user during runtime
			String modelTwo = sc.next();

			one.mobilePhoneTwo(modelTwo);
			int phoneTabTwo = one.mobilePhoneTwo(modelTwo);
			System.out.println("Please select the plan that you want to opt for: Rogers/Telus/Bell  ");
//			Reads input from the user during runtime
			String plan = sc.next();
//			Calling the method
			one.mobilePhoneThree(plan);
//			Returns value from the method
			int monthlyPlan = one.mobilePhoneThree(plan);

			System.out.println("you have selected the " + modelTwo + " model with " + plan + " plan.");
			System.out.println("Your Phone Tab will be $" + phoneTabTwo);
			System.out.println("Your Monthly Plan will be $" + monthlyPlan);
			System.out.println("Total Monthly Amount is $" + (phoneTabTwo + monthlyPlan));

		} else {
			System.out.println("Invalid input.");
		}

	}
}
