
public class IfElseOperator {

	public static void main(String[] args) {

		int age = 25;
		boolean isLifeguardSocietyCertificate = !true;
		boolean hasStandardFirstAid = true;

		if ((age >= 16) && hasStandardFirstAid && isLifeguardSocietyCertificate) {
			System.out.println(" Can apply for the job: ");
		}

		else if ((age >= 16) || hasStandardFirstAid && isLifeguardSocietyCertificate) {
			System.out.println("Cannot apply for the job");
		}

	}

}
