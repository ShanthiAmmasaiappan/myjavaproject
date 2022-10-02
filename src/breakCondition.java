
public class breakCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		int num = 5;
////		while (num >= 0) {
////			System.out.println("print till the number is zero:" + num);
////			num--;
//		
////		}
		int num1 = 20;
		
		while(num1<=50){
			if(num1 % 3 == 0) {
				System.out.println("the number is divisible by 3:" +num1);
				
			}
			if(num1 % 5 == 0) {
				System.out.println("the number is divisible by 5:" +num1);
			}
		 num1++;
		
			
		}

	}

}
