
public class DivisibleWhileOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		
		while(num1<=20){
			if(num1 % 3 == 0 && num1 % 5 == 0) {
				System.out.println("the number is divisible by 3 & 5:" +num1);
				
			}
			if(num1 % 5 == 0) {
				System.out.println("the number is divisible by 5:" +num1);
			}
		 num1++;
		 	
		}
	}

}
