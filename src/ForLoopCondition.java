
public class ForLoopCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int glassOfJuice = 3;
		for (int count = 1; count <= 5; count++) {
			System.out.println(+count + "glass");
			if (count == glassOfJuice) {
				System.out.println("Reached the limit");
				break;
			} else {
				System.out.println("Not reached the limit");
			}
		}

	}

}
