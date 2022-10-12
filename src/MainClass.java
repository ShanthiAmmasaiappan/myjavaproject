import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//      Instance of the class
		SimpleMethodOne sm = new SimpleMethodOne();
//		Calling the method using the object
		sm.addNumbers();

		sm.subNumbers();

		sm.productNumbers();

		sm.divisionNumbers();
	}

}
