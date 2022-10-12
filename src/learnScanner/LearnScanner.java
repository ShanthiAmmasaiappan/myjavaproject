package learnScanner;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		get input during run time
		//className referenceVariable = new className();(Syntax for a class)
		

		int x;
		int y;
		int z;
		String name = "s";
		String name1 = "";
		String name2 = "";
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number:");
		x = sc.nextInt();
		System.out.println("Enter the second number:");
		y = sc.nextInt();
		System.out.println("Enter the third number:");
		z = sc.nextInt();
		int a = x + y + z;
		System.out.println(a);
		System.out.println("Enter the First Name:");
		name1 = sc.next();
		System.out.println("Enter the Last Name:");
		name2 = sc.next();
		System.out.println(name1 + " "+ name2 );

	}

}
