
public class NumberDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;
		int num2 = 15;
		
		if(num1 % 3 == 0 && num2 % 3 == 0) {
			System.out.println("Both the numbers are divisible by 3:");
		}
		else if(num1 % 3 == 0 && num2 % 3 != 0) {
			System.out.println("num1 is divisible by 3 but num2 is not divisible by 3:");
		}
		else if(num1 % 3 != 0 && num2 % 3 == 0) {
			System.out.println("num1 is not divisible by 3 but num2 is divisible by 3");
		}
		else if(num1 % 3 != 0 && num2 % 3 != 0) {
			System.out.println("Both the numbers are not divisible by 3:");
			
		}
		
		
		

	}

}