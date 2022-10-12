
public class MethodwithReturnType {
	String licenseType(String currentLicense) {
		String licenseToBeApplied;
		if(currentLicense.equals("No license")) {
			licenseToBeApplied = "G1";
		}else if(currentLicense.equals("G1")) {
			licenseToBeApplied = "G2";
		}else if(currentLicense.equals("G2")) {
			licenseToBeApplied = "G";
		} else {
			licenseToBeApplied = "Go home";
			}
		return licenseToBeApplied;
	}

}
