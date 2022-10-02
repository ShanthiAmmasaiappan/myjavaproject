
public class DriversLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int agePerson = 15;
//		boolean passWritternTest = !true;
//		boolean theCurrentLevelG1 = !true;
//		boolean theCurrentLevelG2 = true;
//		if ((agePerson >= 16) && passWritternTest) {
//			System.out.println(" G1 license is issued");
//		} else if (agePerson >= 16 && theCurrentLevelG1) {
//			System.out.println("G2 license is issued");
//		} else if (agePerson >= 16 && theCurrentLevelG2) {
//			System.out.println("G license is issued");
//		}
//
//		else {
//			System.out.println("The license is not issued");
//		}
		int agePerson = 15;

		String theCurrentLevel = "G";
		if ((agePerson >= 16) && (theCurrentLevel == "No license")) {

			System.out.println("G1 license is issued");

		} else if ((agePerson >= 16) && (theCurrentLevel == "No license")) {
			System.out.println("G2 license is issued");
		} else if ((agePerson >= 16) && (theCurrentLevel == "G2")) {
			System.out.println("G license is issued");
		} else if ((agePerson >= 16) && (theCurrentLevel == "G")) {
			System.out.println("Highest level");
		} else {
			System.out.println("license is not issued");
		}

	}
}
