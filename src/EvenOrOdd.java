
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		program for even and odd
		int x = 2;
		if (x % 2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
//		int a = 5, b = 9, c = 7;
//		if(a<c || c>a && b>a) {
//			System.out.println("Print Line 1 ");
//		}
//		else {
//			System.out.println("Print line 2 ");
//		}
//			ternary operator
			int a = 5, b = 9, c = 7;
			String result = (a>c || c<a && b>a)? "Print Line 1" : "Print line 2" ;
			System.out.println(result);


		}

	}
	
}
