package switchcase;

public class Calculator {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c;
		String calculator = "subtraction";
		switch (calculator) {
		case "addition":
			c = a + b;
			System.out.println(" The result for addition = " + c);
			break;
		case "subtraction":
			c = a - b;
			System.out.println("The result for subtraction = " + c);
			break;
		case "multiplication":
			c = a * b;
			System.out.println("The result for multiplication = " + c);
			break;
		case "division":
			c = a / b;
			System.out.println("The result for division is = " + c);
			break;
		default:
			System.out.println("Doesnot match the input value");
			break;

		}

	}

}
