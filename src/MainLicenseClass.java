import java.util.Scanner;

public class MainLicenseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the current license: ");
		String currentLicense = sc.next();
		
		MethodwithReturnType mw = new MethodwithReturnType();
		String licenseToBeApplied= mw.licenseType(currentLicense);
		
		switch (licenseToBeApplied) {
		case "G1":
			System.out.println("The amount to be paid is $110");			
			break;
		case "G2":
			System.out.println("The amount to be paid is $130");			
			break;
		case "G":
			System.out.println("The amount to be paid is $150");			
			break;
		case "already have license":
			System.out.println("Go home");			
			break;

		default:
			System.out.println("Invalid input");
			break;
		}

		
	}

}
