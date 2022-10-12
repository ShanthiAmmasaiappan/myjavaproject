
public class SimpleMethodOne {
	int num1 = 10;
	int num2 = 20;
	int num3 = 30;

	void addNumbers() {
		int sum = num1 + num2 + num3;
		System.out.println("Output = " + sum);
	}

	void subNumbers() {
		int sub = num3 - num2 - num1;
		System.out.println("Output = " + sub);
	}

	void productNumbers() {
		int pro = num3 * num2 * num1;
		System.out.println("Output = " + pro);
	}

	void divisionNumbers() {
		int div = (num3 / num2) / num1;
		System.out.println("Output = " + div);
	}

}
